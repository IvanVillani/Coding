package app;

import app.core.Engine;
import app.core.WarManager;
import app.io.ConsoleReader;
import app.io.ConsoleWriter;
import app.repository.Repository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        Repository repository = new Repository();
        WarManager healthManager = new WarManager(repository);
        Engine engine = new Engine(reader, writer, healthManager);

        engine.start();
    }
}
