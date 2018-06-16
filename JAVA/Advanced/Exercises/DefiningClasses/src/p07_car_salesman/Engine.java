package p07_car_salesman;

public class Engine {
    static public String DEFAULT_VALUE = "n/a";

    private String model;
    private String power;
    private String displace;
    private String effic;

    public Engine(String model, String power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, String power, String displace, String effic) {
        this.model = model;
        this.power = power;
        this.displace = displace;
        this.effic = effic;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDisplace() {
        return displace;
    }

    public void setDisplace(String displace) {
        this.displace = displace;
    }

    public String getEffic() {
        return effic;
    }

    public void setEffic(String effic) {
        this.effic = effic;
    }
}
