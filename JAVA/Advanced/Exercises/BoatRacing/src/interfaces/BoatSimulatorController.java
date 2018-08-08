package interfaces;

import database.BoatSimulatorDatabase;
import enumeration.EngineType;
import exeptions.*;

public interface BoatSimulatorController {
    IRace getCurrentIRace();

    BoatSimulatorDatabase getDatabase();

    String createBoatEngine(String model, int horsepower, int displacement, EngineType engineType) throws DuplicateModelException;

    String createRowBoat(String model, int weight, int oars) throws DuplicateModelException;

    String createSailBoat(String model, int weight, int sailEfficiency) throws DuplicateModelException;

    String CreatePowerBoat(String model, int weight, String firstEngineModel, String secondEngineModel) throws NonExistantModelException, DuplicateModelException;

    String CreateYacht(String model, int weight, String engineModel, int cargoWeight) throws NonExistantModelException, DuplicateModelException;

    String OpenRace(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorboats) throws RaceAlreadyExistsException;

    String SignUpBoat(String model) throws NonExistantModelException, DuplicateModelException, NoSetRaceException;

    String StartRace() throws InsufficientContestantsException, NoSetRaceException;

    String GetStatistic();
}
