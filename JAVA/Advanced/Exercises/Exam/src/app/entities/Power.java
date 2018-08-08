package app.entities;

import app.interfaces.SuperPower;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Power implements SuperPower {
    private String name;
    private double powerPoints;

    public Power(String name, double powerPoints) {
        this.setName(name);
        this.setPowerPoints(powerPoints);
    }

    public void setName(String name) {
        Pattern pattern = Pattern.compile("^(\\@[A-Za-z_]{5,}\\@)$");
        Matcher matcher = pattern.matcher(name);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Super power name not in the correct format!");
        } else {
            this.name = name;
        }
    }

    public void setPowerPoints(double powerPoints) {
        if (powerPoints < 0.0) {
            throw new IllegalArgumentException("Power points should be a possitive number!");
        }else {
            this.powerPoints = powerPoints;
        }
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPowerPoints() {
        return 0;
    }
}
