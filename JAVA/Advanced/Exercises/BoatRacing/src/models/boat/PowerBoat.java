package models.boat;

import interfaces.IRace;
import models.engine.BaseEngine;

import java.util.ArrayList;
import java.util.List;

public class PowerBoat extends BaseMotorBoat {
    private BaseEngine secondEngine;

    public PowerBoat(String model, int weight, BaseEngine firstEngine, BaseEngine secondEngine) {
        super(model, weight, firstEngine);
        this.secondEngine = secondEngine;
    }

    @Override
    protected List<BaseEngine> getEngines() {
        List<BaseEngine> engines = new ArrayList<>();
        engines.add(super.getFirstEngine());
        engines.add(this.secondEngine);
        return engines;
    }

    @Override
    public boolean isMotorBoat() {
        return true;
    }

    @Override
    public double calculateRaceSpeed(IRace IRace) {
        return super.getFirstEngine().getCachedOutput() + this.secondEngine.getCachedOutput() -
                super.getWeight() + (IRace.getOceanCurrentSpeed() / 5d);
    }
}
