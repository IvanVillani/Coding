package root;

import root.command_dispatcher.HealthManager;
import root.core.Engine;
import root.io.ConsoleReader;
import root.io.ConsoleWriter;
import root.repository.Repository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        Repository repository = new Repository();
        HealthManager healthManager = new HealthManager(repository);
        Engine engine = new Engine(reader, writer, healthManager);

        engine.start();
    }
}
