package pr0304Barracks.core.commands;

import pr0304Barracks.annonations.Inject;
import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;

public class RetireCommand implements Executable {
    @Inject
    private String[] data;

    @Inject
    private Repository repository;

    @Override
    public String execute() {
        try {
            String unitType = this.data[1];
            this.repository.removeUnit(unitType);
            return unitType + " retired!";
        }catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }
}
