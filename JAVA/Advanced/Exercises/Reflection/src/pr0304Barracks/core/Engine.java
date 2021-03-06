package pr0304Barracks.core;

import pr0304Barracks.annonations.Inject;
import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.Runnable;
import pr0304Barracks.contracts.UnitFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {
	private static final String COMMAND_CLASS_PATH = "pr0304Barracks.core.commands.";

	private Repository repository;

	private UnitFactory unitFactory;

	private String[] data;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpredCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String interpredCommand(String[] data, String commandName) {
	    this.data = data;
        try {
            Class<?> commandClass = Class.forName(COMMAND_CLASS_PATH + Character.toUpperCase(commandName.charAt(0)) + commandName.substring(1) + "Command");
            Constructor<?> declaredConstructor = commandClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            Executable command = (Executable) declaredConstructor.newInstance();
            this.injectDependencies(command);
            return command.execute();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            throw new RuntimeException("Invalid command!");
        }
    }

    private <T extends Executable> void injectDependencies(T command) throws IllegalAccessException {
        Field[] commandFields = command.getClass().getDeclaredFields();
        Field[] engineFields = this.getClass().getDeclaredFields();

        for (Field commandField : commandFields) {
            commandField.setAccessible(true);
            if (commandField.isAnnotationPresent(Inject.class)) {
                for (Field engineField : engineFields) {
                    engineField.setAccessible(true);
                    if (commandField.getType().getSimpleName().equals(engineField.getType().getSimpleName()) && commandField.getType().equals(engineField.getType())) {
                        commandField.set(command, engineField.get(this));
                    }
                }
            }
        }
    }
}
