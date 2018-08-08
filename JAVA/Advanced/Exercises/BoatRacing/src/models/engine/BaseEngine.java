package models.engine;

import Utility.Constants;
import Utility.Validator;
import interfaces.Modelable;

public abstract class BaseEngine implements Modelable {
    protected int cachedOutput;

    protected String model;

    private int horsepower;

    private int displacement;

    protected BaseEngine(String model, int horsepower, int displacement) {
        this.setModel(model);
        this.setHorsepower(horsepower);
        this.setDisplacement(displacement);
    }

    protected abstract int getOutput();

    public int getCachedOutput() {
        return cachedOutput;
    }

    public void setCachedOutput(int cachedOutput) {
        this.cachedOutput = cachedOutput;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        Validator.ValidateModelLength(model, Constants.MIN_BOAT_ENGINE_MODEL_LENGTH);
        this.model = model;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    private void setHorsepower(int horsepower) {
        Validator.ValidatePropertyValue(horsepower, "Horsepower");
        this.horsepower = horsepower;
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(int displacement) {
        Validator.ValidatePropertyValue(displacement, "Displacement");
        this.displacement = displacement;
    }
}
