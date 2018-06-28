package p05_military;

public class Mission implements IMission{
    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    public void completeMission(){
        this.state = "Finished";
    }

    @Override
    public void setState(String state) {
        if (!"inProgress".equals(state) && !"Finished".equals(state)) {
            throw new IllegalArgumentException("Skip only mission");
        }else {
            this.state = state;
        }
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state);
    }
}
