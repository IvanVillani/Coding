package models;

import Utility.Constants;
import Utility.Validator;
import interfaces.IRace;
import exeptions.DuplicateModelException;
import models.boat.BaseBoat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Race implements IRace {
    private int distance;
    private int windSpeed;
    private int oceanCurrentSpeed;
    private Boolean allowsMotorBoats;
    private Map<String, BaseBoat> registeredBoats;

    public Race(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorBoats, Map<String, BaseBoat> registeredBoats) {
        this.setDistance(distance);
        this.setWindSpeed(windSpeed);
        this.setOceanCurrentSpeed(oceanCurrentSpeed);
        this.setAllowsMotorBoats(allowsMotorBoats);
        this.registeredBoats = registeredBoats;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    private void setDistance(int distance) {
        Validator.ValidatePropertyValue(distance, "Distance");
        this.distance = distance;
    }

    @Override
    public int getWindSpeed() {
        return windSpeed;
    }

    private void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getOceanCurrentSpeed() {
        return oceanCurrentSpeed;
    }

    private void setOceanCurrentSpeed(int oceanCurrentSpeed) {
        this.oceanCurrentSpeed = oceanCurrentSpeed;
    }

    public Boolean getAllowsMotorboats() {
        return allowsMotorBoats;
    }

    private void setAllowsMotorBoats(Boolean allowsMotorBoats) {
        this.allowsMotorBoats = allowsMotorBoats;
    }

    public Map<String, BaseBoat> getRegisteredBoats() {
        return this.registeredBoats;
    }

    public void addParticipant(BaseBoat boat) throws DuplicateModelException {
        if (this.getRegisteredBoats().containsKey(boat.getModel())) {
            throw new DuplicateModelException(Constants.DUPLICATE_MODEL_MESSAGE);
        }
        this.registeredBoats.put(boat.getModel(), boat);
    }

    public List<BaseBoat> getParticipants() {
        return new ArrayList<>(this.registeredBoats.values());
    }
}