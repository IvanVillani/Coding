package p05_speed_racing;

public class Car {
    private String model;
    private double fuel;
    private double pointer;
    private int distance;

    public Car(String model, double fuel, double pointer) {
        this.model = model;
        this.fuel = fuel;
        this.pointer = pointer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getPointer() {
        return pointer;
    }

    public void setPointer(double pointer) {
        this.pointer = pointer;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
