package p01_vehicles;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;
    protected double tankCapacity;

    public Vehicle(double tankCapacity, double fuelQuantity, double fuelConsumption) {
        this.tankCapacity = tankCapacity;
        this.setFuelQuantity(fuelQuantity);
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }else if (fuelQuantity > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity = fuelQuantity;
    }

    public abstract void drive(double km);
    public abstract void refuel(double liters);

    @Override
    public abstract String toString();
}
