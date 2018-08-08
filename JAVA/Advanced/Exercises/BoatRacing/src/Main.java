import Core.CommandHandlerImpl;
import Core.Engine;
import controllers.BoatSimulatorControllerImpl;
import database.BoatSimulatorDatabase;
import interfaces.BoatSimulatorController;
import interfaces.CommandHandler;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BoatSimulatorDatabase boatSimulatorDatabase = new BoatSimulatorDatabase();
        BoatSimulatorController boatSimulatorController = new BoatSimulatorControllerImpl(boatSimulatorDatabase);
        CommandHandler commandHandler = new CommandHandlerImpl(boatSimulatorController);
        Engine engine = new Engine(commandHandler);
        engine.run();
    }
}
