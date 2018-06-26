package p01_vehicles;

public class Car extends Vehicle{
    public Car(double tankCapacity, double fuelQuantity, double fuelConsumption) {
        super(tankCapacity, fuelQuantity, fuelConsumption);
    }

    @Override
    public void drive(double km) {
        if ((super.fuelConsumption + 0.9) * km <= super.fuelQuantity) {
            super.setFuelQuantity(super.fuelQuantity - (super.fuelConsumption + 0.9) * km);
        }else {
            throw new IllegalArgumentException("Car needs refueling");
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
        return String.format("Car: %.2f", super.fuelQuantity);
    }
}
