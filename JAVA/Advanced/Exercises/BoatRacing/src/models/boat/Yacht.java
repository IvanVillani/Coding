package models.boat;

import Utility.Validator;
import interfaces.IRace;
import models.engine.BaseEngine;

import java.util.ArrayList;
import java.util.List;

public class Yacht extends BaseMotorBoat{
    private int cargoWeight;

    public Yacht(String model, int weight, BaseEngine firstEngine, int cargoWeight) {
        super(model, weight, firstEngine);
        this.setCargoWeight(cargoWeight);
    }

    public int getCargoWeight() {
        return this.cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        Validator.ValidatePropertyValue(cargoWeight, "Cargo Weight");
        this.cargoWeight = cargoWeight;
    }

    @Override
    protected List<BaseEngine> getEngines() {
        List<BaseEngine> engines = new ArrayList<>();
        engines.add(super.getFirstEngine());
        return engines;
    }

    @Override
    public boolean isMotorBoat() {
        return true;
    }

    @Override
    public double calculateRaceSpeed(IRace IRace) {
        return super.getFirstEngine().getCachedOutput() - super.getWeight() -
                this.cargoWeight + (IRace.getOceanCurrentSpeed() / 2d);
    }
}
