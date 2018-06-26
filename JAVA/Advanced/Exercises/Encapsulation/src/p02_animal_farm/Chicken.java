package p02_animal_farm;

import java.text.DecimalFormat;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }else if (name.replaceAll(" ", "").equals("")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age <= 15 && age >= 0) {
            this.age = age;
        }else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    private double calculateProductPerDay() {
        if (this.age >= 0 && this.age <= 5) {
            return 2;
        }else if (this.age >= 6 && this.age <= 11) {
            return 1;
        }else {
            return 0.75;
        }
    }

    public String getProductPerDay() {
        DecimalFormat dec = new DecimalFormat("#.##");
        String formatted = dec.format(this.calculateProductPerDay());
        return String.format("Chicken %s (age %d) can produce %s eggs per day.",this.name, this.age, formatted);
    }
}
