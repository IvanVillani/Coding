package models.boat;

import Utility.Constants;
import Utility.Validator;
import interfaces.Boat;
import interfaces.Modelable;

public abstract class BaseBoat implements Modelable, Boat {
    private String model;
    private int weight;

    protected BaseBoat(String model, int weight) {
        this.setModel(model);
        this.setWeight(weight);
    }

    @Override
    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        Validator.ValidateModelLength(model, Constants.MIN_BOAT_MODEL_LENGTH);
        this.model = model;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        Validator.ValidatePropertyValue(weight, "Weight");
        this.weight = weight;
    }
}
