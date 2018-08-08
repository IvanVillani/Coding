package p01_event_manipulation;

public class Handler implements NameChangeListener{
    @Override
    public void handleChangedName(NameChange event) {
        System.out.printf("Dispatcher's name changed to %s.%n", event.getNameChanged());
    }
}
