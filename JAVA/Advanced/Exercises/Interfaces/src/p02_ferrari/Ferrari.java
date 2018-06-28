package p02_ferrari;

public class Ferrari implements Car{
    private static String MODEL = "488-Spider";
    private String driver;

    public Ferrari(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", MODEL, this.useBrakes(), this.pushTheGas(), this.driver);
    }

    @Override
    public String useBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushTheGas() {
        return "Zadu6avam sA!";
    }
}
