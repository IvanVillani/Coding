package p01_vehicles;

public class Bus extends Vehicle{
    public Bus(double tankCapacity, double fuelQuantity, double fuelConsumption) {
        super(tankCapacity, fuelQuantity, fuelConsumption);
    }

    @Override
    public void drive(double km) {
        if ((super.fuelConsumption + 1.4) * km <= super.fuelQuantity) {
            super.setFuelQuantity(super.fuelQuantity - (super.fuelConsumption + 1.4) * km);
        }else {
            throw new IllegalArgumentException("Bus needs refueling");
        }
    }

    public void driveEmpty(double km) {
        if (super.fuelConsumption * km <= super.fuelQuantity) {
            super.setFuelQuantity(super.fuelQuantity - super.fuelConsumption * km);
        }else {
            throw new IllegalArgumentException("Bus needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        super.setFuelQuantity(super.fuelQuantity + liters);
    }

    @Override
    public String toString() {
        return String.format("Bus: %.2f", super.fuelQuantity);
    }


}
