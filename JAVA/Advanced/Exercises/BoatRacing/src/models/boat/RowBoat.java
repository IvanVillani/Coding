package models.boat;

import Utility.Validator;
import interfaces.IRace;

public class RowBoat extends BaseBoat{
    private int oars;

    public RowBoat(String model, int weight, int oars) {
        super(model, weight);
        this.setOars(oars);
    }

    public int getOars() {
        return this.oars;
    }

    public void setOars(int oars) {
        Validator.ValidatePropertyValue(oars, "Oars");
        this.oars = oars;
    }

    @Override
    public boolean isMotorBoat() {
        return false;
    }

    @Override
    public double calculateRaceSpeed(IRace IRace) {
        return (this.oars * 100) - super.getWeight() + IRace.getOceanCurrentSpeed();
    }
}
