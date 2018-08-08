package models.boat;

import Utility.Constants;
import interfaces.IRace;

public class SailBoat extends BaseBoat{
    private int sailEfficiency;

    public SailBoat(String model, int weight, int sailEfficiency) {
        super(model, weight);
        this.setSailEfficiency(sailEfficiency);
    }

    public int getSailEfficiency() {
        return this.sailEfficiency;
    }

    public void setSailEfficiency(int sailEfficiency) {
        if (sailEfficiency < 1 || sailEfficiency > 100) {
            throw new IllegalArgumentException(Constants.INCORRECT_SAIL_EFFICIENCY_MESSAGE);
        }
        this.sailEfficiency = sailEfficiency;
    }

    @Override
    public boolean isMotorBoat() {
        return false;
    }

    @Override
    public double calculateRaceSpeed(IRace IRace) {
        return (IRace.getWindSpeed() * (this.sailEfficiency / 100d)) - super.getWeight() +
                (IRace.getOceanCurrentSpeed() / 2d);
    }
}
