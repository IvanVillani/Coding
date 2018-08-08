package controllers;

import Utility.Constants;
import commands.*;
import database.BoatSimulatorDatabase;
import enumeration.EngineType;
import exeptions.*;
import interfaces.BoatSimulatorController;
import interfaces.IRace;
import models.Race;
import models.boat.BaseBoat;

import java.util.*;

public class BoatSimulatorControllerImpl implements BoatSimulatorController {
    private Map<BaseBoat, Double> map;
    private Map<BaseBoat, Double> map1;
    private BoatSimulatorDatabase database;
    private IRace currentIRace;

    public BoatSimulatorControllerImpl(BoatSimulatorDatabase database) {
        this.database = database;
        this.map = new LinkedHashMap<>();
        this.map1 = new LinkedHashMap<>();
    }

    @Override
    public BoatSimulatorDatabase getDatabase() {
        return this.database;
    }

    @Override
    public IRace getCurrentIRace() {
        return this.currentIRace;
    }

    public void setCurrentIRace(IRace currentIRace) {
        this.currentIRace = currentIRace;
    }

    public String createBoatEngine(String model, int horsepower, int displacement, EngineType engineType) throws DuplicateModelException {
        CreateBoatEngineCommand createBoatEngineCommand =
                new CreateBoatEngineCommand(this.database);

        return createBoatEngineCommand.execute(model, horsepower, displacement, engineType);
    }

    public String createRowBoat(String model, int weight, int oars) throws DuplicateModelException {
        CreateRowBoatCommand createRowBoatCommand =
                new CreateRowBoatCommand(this.database);

        return createRowBoatCommand.execute(model, weight, oars);
    }

    public String createSailBoat(String model, int weight, int sailEfficiency) throws DuplicateModelException {
        CreateSailBoatCommand createSailBoatCommand =
                new CreateSailBoatCommand(this.database);

        return createSailBoatCommand.execute(model, weight, sailEfficiency);
    }

    public String CreatePowerBoat(String model, int weight, String firstEngineModel, String secondEngineModel) throws NonExistantModelException, DuplicateModelException {
        CreatePowerBoatCommand createPowerBoatCommand =
                new CreatePowerBoatCommand(this.database);

        return createPowerBoatCommand.execute(model, weight, firstEngineModel, secondEngineModel);
    }

    public String CreateYacht(String model, int weight, String engineModel, int cargoWeight) throws NonExistantModelException, DuplicateModelException {
        CreateYachtCommand createYachtCommand =
                new CreateYachtCommand(this.database);

        return createYachtCommand.execute(model, weight, engineModel, cargoWeight);
    }

    public String OpenRace(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorboats) throws RaceAlreadyExistsException {
        IRace IRace = new Race(distance, windSpeed, oceanCurrentSpeed, allowsMotorboats, new LinkedHashMap<>());
        this.ValidateRaceIsEmpty();
        this.setCurrentIRace(IRace);
        return
                String.format(
                        "A new race with distance %s meters, wind speed %s m/s and ocean current speed %s m/s has been set.",
                        distance, windSpeed, oceanCurrentSpeed);
    }

    public String SignUpBoat(String model) throws NonExistantModelException, DuplicateModelException, NoSetRaceException {
        BaseBoat boat = this.database.getBoats().getItem(model);
        this.ValidateRaceIsSet();
        if (!this.currentIRace.getAllowsMotorboats() && boat.isMotorBoat()) {
            throw new IllegalArgumentException(Constants.INCORRECT_BOAT_TYPE_MESSAGE);
        }
        this.currentIRace.addParticipant(boat);
        return String.format("Boat with model %s has signed up for the current Race.", model);
    }

    public String StartRace() throws InsufficientContestantsException, NoSetRaceException {
        this.ValidateRaceIsSet();
        Collection<BaseBoat> participants = this.currentIRace.getParticipants();
        if (participants.size() < 3) {
            throw new InsufficientContestantsException(Constants.INSUFFICIENT_CONTESTANTS_MESSAGE);
        }

        this.findFastest(participants);

        String[] places = {"First", "Second", "Third"};
        final int[] index = {0};

        StringBuilder result = new StringBuilder();

        this.map
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(boat -> {
                    if (index[0] < 3) {
                        result.append(String.format("%s place: %s Model: %s Time: %s",
                                places[index[0]++],
                                boat.getKey().getClass().getSimpleName(),
                                boat.getKey().getModel(),
                                this.isFinished(boat.getValue())))
                                .append(System.lineSeparator());
                    }
                });

        for (Map.Entry<BaseBoat, Double> doubleBoatEntry : this.map1.entrySet()) {
            if (index[0] == 3) {
                break;
            }
            result.append(String.format("%s place: %s Model: %s Time: Did not finish!",
                    places[index[0]++],
                    doubleBoatEntry.getKey().getClass().getSimpleName(),
                    doubleBoatEntry.getKey().getModel()))
                    .append(System.lineSeparator());
        }

        this.currentIRace = null;
        this.map.clear();
        this.map1.clear();

        return result.toString().trim();
    }

    private String isFinished(Double time) {
        if (time <= 0 || time == Double.POSITIVE_INFINITY || time == Double.NEGATIVE_INFINITY) {
            return "Did not finish!";
        }
        return String.format("%.2f sec", time);
    }

    @Override
    public String GetStatistic() {
        return null;
    }

//    public String getStatistic() {
//        //TODO Bonus Task Implement me
//        throw new NotImplementedException();
//    }

    private void findFastest(Collection<BaseBoat> participants) {
        for (BaseBoat participant : participants) {
            Double speed = participant.calculateRaceSpeed(this.currentIRace);
            Double time = this.currentIRace.getDistance() / speed;

            if (time <= 0) {
                this.map1.put(participant, time);
            } else {
                this.map.put(participant, time);
            }
        }

        if (this.map.size() >= 3) {
            this.map1.clear();
        }
    }

    private void ValidateRaceIsSet() throws NoSetRaceException {
        if (this.currentIRace == null) {
            throw new NoSetRaceException(Constants.NO_SET_RACE_MESSAGE);
        }
    }

    private void ValidateRaceIsEmpty() throws RaceAlreadyExistsException {
        if (this.currentIRace != null) {
            throw new RaceAlreadyExistsException(Constants.RACE_ALREADY_EXISTS_MESSAGE);
        }
    }
}
