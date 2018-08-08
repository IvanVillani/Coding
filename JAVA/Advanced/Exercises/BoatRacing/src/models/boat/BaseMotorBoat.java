package models.boat;

import models.engine.BaseEngine;

import java.util.List;

public abstract class BaseMotorBoat extends BaseBoat{
    private BaseEngine firstEngine;

    protected BaseMotorBoat(String model, int weight, BaseEngine firstEngine) {
        super(model, weight);
        this.firstEngine = firstEngine;
    }

    public BaseEngine getFirstEngine() {
        return firstEngine;
    }

    public void setFirstEngine(BaseEngine firstEngine) {
        this.firstEngine = firstEngine;
    }

    protected abstract List<BaseEngine> getEngines();
}
