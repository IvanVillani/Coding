package commands;

import database.BoatSimulatorDatabase;
import enumeration.EngineType;
import exeptions.DuplicateModelException;
import models.engine.BaseEngine;
import models.engine.JetEngine;
import models.engine.SterndriveEngine;

public class CreateBoatEngineCommand {
    private BoatSimulatorDatabase database;

    public CreateBoatEngineCommand(BoatSimulatorDatabase database) {
        this.database = database;
    }

    public String execute(String model, int horsepower, int displacement, EngineType engineType) throws DuplicateModelException {
        BaseEngine engine;
        switch (engineType) {
            case JET:
                engine = new JetEngine(model, horsepower, displacement);
                break;
            case STERNDRIVE:
                engine = new SterndriveEngine(model, horsepower, displacement);
                break;
            default:
                return "Not a JET, not a STERNDRIVE, so???";
        }

        this.database.getEngines().add(engine);
        return String.format(
                "Engine model %s with %s HP and displacement %s cm3 created successfully.",
                model,
                horsepower,
                displacement);
    }
}
