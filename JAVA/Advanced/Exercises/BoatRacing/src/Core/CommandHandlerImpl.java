package Core;

import Utility.Constants;
import enumeration.EngineType;
import interfaces.BoatSimulatorController;
import interfaces.CommandHandler;
import exeptions.*;

import java.util.List;

public class CommandHandlerImpl implements CommandHandler {
    private BoatSimulatorController controller;

    public CommandHandlerImpl(BoatSimulatorController controller) {
        this.controller = controller;
    }

    private BoatSimulatorController getController() {
        return this.controller;
    }

    public String executeCommand(String name, List<String> parameters) throws DuplicateModelException, NonExistantModelException, RaceAlreadyExistsException, NoSetRaceException, InsufficientContestantsException {
        switch (name) {
            case "CreateBoatEngine":
                if (parameters.get(3).equals("Jet")) {
                    return this.getController().createBoatEngine(
                            parameters.get(0),
                            Integer.parseInt(parameters.get(1)),
                            Integer.parseInt(parameters.get(2)),
                            EngineType.JET);
                } else if (parameters.get(3).equals("Sterndrive")) {
                    return this.getController().createBoatEngine(
                            parameters.get(0),
                            Integer.parseInt(parameters.get(1)),
                            Integer.parseInt(parameters.get(2)),
                            EngineType.STERNDRIVE);
                }

                throw new IllegalArgumentException(Constants.INCORRECT_ENGINE_TYPE_MESSAGE);

            case "CreateRowBoat":
                return this.getController().createRowBoat(
                        parameters.get(0),
                        Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)));
            case "CreateSailBoat":
                return this.getController().createSailBoat(
                        parameters.get(0),
                        Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)));
            case "CreatePowerBoat":
                return this.getController().CreatePowerBoat(
                        parameters.get(0),
                        Integer.parseInt(parameters.get(1)),
                        parameters.get(2),
                        parameters.get(3));
            case "CreateYacht":
                return this.getController().CreateYacht(
                        parameters.get(0),
                        Integer.parseInt(parameters.get(1)),
                        parameters.get(2),
                        Integer.parseInt(parameters.get(3)));
            case "OpenRace":
                return this.getController().OpenRace(
                        Integer.parseInt(parameters.get(0)),
                        Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)),
                        Boolean.parseBoolean(parameters.get(3)));
            case "SignUpBoat":
                return this.getController().SignUpBoat(parameters.get(0));
            case "StartRace":
                return this.getController().StartRace();
            case "GetStatistic":
                return this.getController().GetStatistic();
            default:
                throw new IllegalArgumentException("Invalid command!");
        }
    }
}
