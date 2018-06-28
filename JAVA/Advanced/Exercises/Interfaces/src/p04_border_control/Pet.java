package p04_border_control;

public class Pet implements CheckBirthdate{
    private String name;
    private String birthdate;
    private String check;

    public Pet(String check, String name, String birthdate) {
        this.check = check;
        this.name = name;
        this.setBirthdate(birthdate);
    }

    @Override
    public void setBirthdate(String birthdate) {
        if (birthdate.endsWith(this.check)) {
            throw new IllegalArgumentException(birthdate);
        }
        this.birthdate = birthdate;
    }
}
