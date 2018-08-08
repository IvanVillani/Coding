package pr02PrivateClassFiddling;

import pr02PrivateClassFiddling.com.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.System.in;

public class Main {
    private static final String CLASS_NAME = "BlackBoxInt";
    private static final String CLASS_PATH = "pr02PrivateClassFiddling.com.";
    public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		BlackBoxInt blackBox;

        try {
            Class<?> blackBoxClass = Class.forName(CLASS_PATH + CLASS_NAME);
            Constructor<?> constructor = blackBoxClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            blackBox = (BlackBoxInt) constructor.newInstance();

            while (true) {
                String input = reader.readLine();

                if ("END".equals(input)) {
                    break;
                }

                String[] arr = input.split("_");

                Method declaredMethod = blackBox.getClass().getDeclaredMethod(arr[0], int.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(blackBox, Integer.parseInt(arr[1]));
                Field field = blackBox.getClass().getDeclaredField("innerValue");
                field.setAccessible(true);
                System.out.println(field.get(blackBox));


            }

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
