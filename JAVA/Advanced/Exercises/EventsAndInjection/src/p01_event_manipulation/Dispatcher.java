package p01_event_manipulation;

import java.util.List;

public class Dispatcher {
    private String name;
    private List<NameChangeListener> listeners;

    public Dispatcher(List<NameChangeListener> listeners) {
        this.listeners = listeners;
    }

    public void setName(String name) {
        this.name = name;
        NameChange event = new NameChange(name);
        this.fireNameChangeEvent(event);
    }

    void addNameChangeListener(NameChangeListener listener) {
        listeners.add(listener);
    }


    void removeNameChangeListener(NameChangeListener listener) {
        listeners.remove(listener);
    }

    void fireNameChangeEvent(NameChange event) {
        for (NameChangeListener listener : listeners) {
            listener.handleChangedName(event);
        }
    }
}
