package p05_military;

public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier{
    protected String corps;

    public SpecialisedSoldier(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    @Override
    public void setCorps(String corps) {
        if (!"Airforces".equals(corps) && !"Marines".equals(corps)) {
            throw new IllegalArgumentException("Skip line");
        }else {
            this.corps = corps;
        }
    }
}
