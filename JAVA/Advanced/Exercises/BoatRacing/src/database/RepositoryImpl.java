package database;

import Utility.Constants;
import interfaces.Modelable;
import exeptions.DuplicateModelException;
import exeptions.NonExistantModelException;
import interfaces.Repository;

import java.util.HashMap;
import java.util.Map;

public class RepositoryImpl<T extends Modelable> implements Repository<T> {
    private Map<String, T> itemsByModel;

    public RepositoryImpl()
    {
        this.itemsByModel = new HashMap<>();
    }

    protected Map<String, T> getItemsByModel() {
        return this.itemsByModel;
    }

    @Override
    public void add(T item) throws DuplicateModelException {
        if (this.itemsByModel.containsKey(item.getModel()))
        {
            throw new DuplicateModelException(Constants.DUPLICATE_MODEL_MESSAGE);
        }else {
            this.itemsByModel.put(item.getModel(), item);
        }

    }

    @Override
    public T getItem(String model) throws NonExistantModelException {
        if (!this.itemsByModel.containsKey(model))
        {
            throw new NonExistantModelException(Constants.NON_EXISTENT_MODEL_MESSAGE);
        }

        return this.itemsByModel.get(model);
    }

}
