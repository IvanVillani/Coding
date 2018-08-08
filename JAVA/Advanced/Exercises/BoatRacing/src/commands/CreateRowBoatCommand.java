package commands;

import database.BoatSimulatorDatabase;
import exeptions.DuplicateModelException;
import models.boat.BaseBoat;
import models.boat.RowBoat;

public class CreateRowBoatCommand {
    private BoatSimulatorDatabase database;

    public CreateRowBoatCommand(BoatSimulatorDatabase database) {
        this.database = database;
    }


    public String execute(String model, int weight, int oars) throws DuplicateModelException {
        BaseBoat boat = new RowBoat(model, weight, oars);
        this.database.getBoats().add(boat);
        return String.format("Row boat with model %s registered successfully.", model);
    }
}
