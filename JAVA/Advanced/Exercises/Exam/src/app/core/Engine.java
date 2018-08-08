package app.core;

import app.entities.ArenaImpl;
import app.entities.ComicCharacterImpl;
import app.entities.Power;
import app.factories.ComicCharacterFactory;
import app.factories.SuperPowerFactory;
import app.interfaces.Arena;
import app.io.ConsoleReader;
import app.io.ConsoleWriter;

import java.io.IOException;

public class Engine {
    private ConsoleReader reader;
    private ConsoleWriter writer;
    private WarManager manager;

    public Engine(ConsoleReader reader, ConsoleWriter writer, WarManager manager) {
        this.reader = reader;
        this.writer = writer;
        this.manager = manager;
    }

    public void start() throws IOException {
        String input = reader.read();
        boolean check = false;

        while (true) {
            String[] arr = input.split(" ");
            String result = null;
            switch (arr[0]) {
                case "CHECK_CHARACTER":
                    result = manager.checkComicCharacter(arr[1]);
                    break;
                case "REGISTER_HERO":
                    try {
                        ComicCharacterImpl hero = ComicCharacterFactory.createHero(arr[1], arr[2],
                                Integer.parseInt(arr[3]), Double.parseDouble(arr[4]),
                                Double.parseDouble(arr[5]), Double.parseDouble(arr[5]));
                        result = manager.addHero(hero);
                    }catch (IllegalArgumentException ex) {
                        result = ex.getMessage();
                    }
                    break;
                case "REGISTER_ANTI_HERO":
                    try {
                        ComicCharacterImpl antiHero = ComicCharacterFactory.createHero(arr[1], arr[2],
                                Integer.parseInt(arr[3]), Double.parseDouble(arr[4]),
                                Double.parseDouble(arr[5]), Double.parseDouble(arr[5]));
                        result = manager.addAntiHero(antiHero);
                    }catch (IllegalArgumentException ex) {
                        result = ex.getMessage();
                    }
                    break;
                case "BUILD_ARENA":
                    Arena arena = new ArenaImpl(arr[1], Integer.parseInt(arr[2]));
                    result = manager.addArena(arena);
                    break;
                case "SEND_HERO":
                    result = manager.addHeroToArena(arr[1], arr[2]);
                    break;
                case "SEND_ANTI_HERO":
                    result = manager.addAntiHeroToArena(arr[1], arr[2]);
                    break;
                case "SUPER_POWER":
                    Power power = SuperPowerFactory.createPower(arr[1], Double.parseDouble(arr[2]));
                    result = manager.loadSuperPowerToPool(power);
                    break;
                case "ASSIGN_POWER":
                    result = manager.assignSuperPowerToComicCharacter(arr[1], arr[2]);
                    break;
                case "UNLEASH":
                    result = manager.usePowers(arr[1]);
                    break;
                case "COMICS_WAR":
                    result = manager.startBattle(arr[1]);
                    break;
                case "WAR_IS_OVER":
                    result = manager.endWar();
                    check = true;
                    break;
            }
            if(result != null) {
                writer.write(result);
            }
            if (check) {
                break;
            }else {
                input = reader.read();

            }
        }
    }
}
