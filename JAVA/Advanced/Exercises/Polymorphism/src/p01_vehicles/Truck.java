package p01_vehicles;

public class Truck extends Vehicle{
    public Truck(double tankCapacity, double fuelQuantity, double fuelConsumption) {
        super(tankCapacity, fuelQuantity, fuelConsumption);
    }

    @Override
    public void drive(double km) {
        if ((super.fuelConsumption + 1.6) * km <= super.fuelQuantity) {
            super.setFuelQuantity(super.fuelQuantity - (super.fuelConsumption + 1.6) * km);
        }else {
            throw new IllegalArgumentException("Truck needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        super.setFuelQuantity(super.fuelQuantity + liters * 0.95);
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", super.fuelQuantity);
    }
}
