package pr0304Barracks.core.commands;

import pr0304Barracks.annonations.Inject;
import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;

public class AddCommand implements Executable {
    @Inject
    private Repository repository;

    @Inject
    private UnitFactory unitFactory;

    @Inject
    private String[] data;

    @Override
    public String execute() {
        String unitType = this.data[1];
        Unit unitToAdd = this.unitFactory.createUnit(unitType);
        this.repository.addUnit(unitToAdd);
        return unitType + " added!";
    }
}
