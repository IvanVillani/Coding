package p06_collection;

import java.util.List;

public abstract class BaseCollection {
    protected List<String> list;

    public BaseCollection(List<String> list) {
        this.list = list;
    }
}
