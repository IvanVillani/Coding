package root.core;

import root.command_dispatcher.HealthManager;
import root.io.ConsoleReader;
import root.io.ConsoleWriter;

import java.io.IOException;

public class Engine {
    private ConsoleReader reader;
    private ConsoleWriter writer;
    private HealthManager manager;

    public Engine(ConsoleReader reader, ConsoleWriter writer, HealthManager manager) {
        this.reader = reader;
        this.writer = writer;
        this.manager = manager;
    }

    public void start() throws IOException {
        String input = reader.read();

        while (!"BEER IS COMING".equals(input)) {
            String result = manager.accept(input.split(" "));
            if(result != null) {
                writer.write(result);
            }

            input = reader.read();
        }
    }
}
