package p05_animals;

public class Animal {
    private String name;
    private String age;
    private String gender;

    public Animal(String name, String age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.replaceAll(" ", "").equals("")) {
            throw new IllegalArgumentException("Invalid input!");
        }else if (Character.isLowerCase(name.charAt(0)) || Character.isDigit(name.charAt(0))) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        if (age.replaceAll(" ", "").equals("")) {
            throw new IllegalArgumentException("Invalid input!");
        }else if (Integer.parseInt(age) <= 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (name.replaceAll(" ", "").equals("")) {
            throw new IllegalArgumentException("Invalid input!");
        }else if (!Statics.DEFAULT_GENDERS.contains(gender)) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public String produceSound() {
        return "Not implemented!";
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.name, this.age, this.gender);
    }
}
