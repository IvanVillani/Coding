package app.core;

import app.entities.ArenaImpl;
import app.entities.ComicCharacterImpl;
import app.entities.Power;
import app.entities.antiHeroes.AntiHero;
import app.entities.heroes.Hero;
import app.interfaces.Arena;
import app.interfaces.Manager;
import app.interfaces.SuperPower;
import app.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class WarManager implements Manager {
    private Repository repository;

    public WarManager(Repository repository) {
        this.repository = repository;
    }

    @Override
    public String checkComicCharacter(String characterName) {
        return "";
    }

    @Override
    public String addHero(ComicCharacterImpl hero) {
        return repository.addHero(hero);
    }

    @Override
    public String addAntiHero(ComicCharacterImpl antiHero) {
        return repository.addAntiHero(antiHero);
    }

    @Override
    public String addArena(Arena arena) {
        return repository.addArena(arena);
    }

    @Override
    public String addHeroToArena(String arena, String hero) {
        for (ComicCharacterImpl hero1 : repository.getHeroes()) {
            if (hero1.getName().equals(hero)) {
                for (ArenaImpl arena1 : repository.getArenas()) {
                    if (arena.equals(arena1.getArenaName())) {
                        for (Hero hero2 : arena1.getHeroes()) {
                            if (hero.equals(hero2.getName())) {
                                return String.format("%s is fighting!", hero);
                            }
                        }
                        if (hero1.getHealth() <= 0) {
                            return String.format("%s is dead!", hero);
                        }else if (arena1.getCapacity() == arena1.getHeroes().size() + arena1.getAntiHeroes().size()) {
                            return "Arena is full!";
                        }else {
                            return String.format("%s is fighting for your freedom in %s!", hero, arena);
                        }
                    }
                }
            }
        }
        return "";
    }

    @Override
    public String addAntiHeroToArena(String arena, String antiHero) {
        for (ComicCharacterImpl antiHero1 : repository.getAntiHeroes()) {
            if (antiHero1.getName().equals(antiHero)) {
                for (ArenaImpl arena1 : repository.getArenas()) {
                    if (arena.equals(arena1.getArenaName())) {
                        for (AntiHero antiHero2 : arena1.getAntiHeroes()) {
                            if (antiHero.equals(antiHero2.getName())) {
                                return String.format("%s is fighting!", antiHero);
                            }
                        }
                        if (antiHero1.getHealth() <= 0) {
                            return String.format("%s is dead!", antiHero);
                        }else if (arena1.getCapacity() == arena1.getHeroes().size() + arena1.getAntiHeroes().size()) {
                            return "Arena is full!";
                        }else {
                            return String.format("%s and his colleagues are trying to take over %s!", antiHero, arena);
                        }
                    }
                }
            }
        }
        return "";
    }

    @Override
    public String loadSuperPowerToPool(Power power) {
        for (Power power1 : repository.getPowers()) {
            if (power.getName().equals(power1.getName())) {
                return "This super power already exists!";
            }
        }
        repository.getPowers().add(power);
        return String.format("%s added to pool!", power.getName());
    }

    @Override
    public String assignSuperPowerToComicCharacter(String comicCharacter, String superPower) {
        boolean check = false;
        for (ComicCharacterImpl hero : repository.getHeroes()) {
            if (hero.getName().equals(comicCharacter)) {
                for (SuperPower power : hero.getPowers()) {
                    if (power.getName().equals(superPower)) {
                        return String.format("%s already assigned!", superPower);
                    }
                }
            }
        }
        for (ComicCharacterImpl antiHero : repository.getAntiHeroes()) {
            if (antiHero.getName().equals(comicCharacter)) {
                check = true;
                for (SuperPower power : antiHero.getPowers()) {
                    if (power.getName().equals(superPower)) {
                        return String.format("%s already assigned!", superPower);
                    }
                }
            }
        }
        if (check) {
            for (ComicCharacterImpl antiHero : repository.getAntiHeroes()) {
                if (antiHero.getName().equals(comicCharacter)) {
                    for (Power power : repository.getPowers()) {
                        if (power.getName().equals(superPower)) {
                            for (Power assigned : repository.getAssigned()) {
                                if (assigned.getName().equals(superPower)) {
                                    return "";
                                }
                            }
                            antiHero.getPowers().add(power);
                            repository.getAssigned().add(power);
                            return String.format("%s has a new super power!", antiHero.getName());
                        }
                    }
                }
            }
        }else {
            for (ComicCharacterImpl hero : repository.getHeroes()) {
                if (hero.getName().equals(comicCharacter)) {
                    for (Power power : repository.getPowers()) {
                        if (power.getName().equals(superPower)) {
                            for (Power assigned : repository.getAssigned()) {
                                if (assigned.getName().equals(superPower)) {
                                    return "";
                                }
                            }
                            hero.getPowers().add(power);
                            repository.getAssigned().add(power);
                            return String.format("%s has a new super power!", hero.getName());
                        }
                    }
                }
            }
        }
        return "";
    }

    @Override
    public String usePowers(String characterName) {
        for (ComicCharacterImpl hero : repository.getHeroes()) {
            if (hero.getName().equals(characterName)) {
                if(hero.getPowers().size() == 0) {
                    return String.format("%s has no super powers!", characterName);
                }
            }
        }
        for (ComicCharacterImpl antiHero : repository.getAntiHeroes()) {
            if (antiHero.getName().equals(characterName)) {
                if(antiHero.getPowers().size() == 0) {
                    return String.format("%s has no super powers!", characterName);
                }
            }
        }
        return String.format("%s used his super powers!", characterName);
    }

    @Override
    public String startBattle(String arena) {
        List<String> namesToBeRemoved = new ArrayList<>();
        for (ArenaImpl arena1 : repository.getArenas()) {
            if (arena.equals(arena1.getArenaName())) {
                if (arena1.getAntiHeroes().size() == 0 && arena1.getHeroes().size() == 0) {
                    return "SAFE ZONE!";
                }else {
                    if (arena1.getHeroes().size() >= arena1.getAntiHeroes().size()) {
                        while (true) {
                            for (int i = 0; i < arena1.getAntiHeroes().size(); i++) {
                                if(arena1.getAntiHeroes().get(i).getAttack() >= arena1.getHeroes().get(i).getHealth()) {
                                    namesToBeRemoved.add(arena1.getHeroes().get(i).getName());
                                }else {
                                    double currHealth1 = arena1.getAntiHeroes().get(i).getHealth();
                                    double currHealth2 = arena1.getHeroes().get(i).getHealth();
                                    int switcher = 1;

                                    while (true) {
                                        if (switcher % 2 != 0) {
                                            currHealth2 -= arena1.getAntiHeroes().get(i).getAttack();
                                            if (currHealth2 <= 0) {
                                                namesToBeRemoved.add(arena1.getHeroes().get(i).getName());
                                                break;
                                            }
                                            arena1.getHeroes().get(i).setHealth(currHealth2);
                                        }else {
                                            currHealth1 -= arena1.getHeroes().get(i).getAttack();
                                            if (currHealth1 <= 0) {
                                                namesToBeRemoved.add(arena1.getAntiHeroes().get(i).getName());
                                                break;
                                            }
                                            arena1.getAntiHeroes().get(i).setHealth(currHealth1);
                                        }
                                        switcher++;
                                    }
                                }
                            }

                            for (String s : namesToBeRemoved) {
                                for (Hero hero : arena1.getHeroes()) {
                                    for (ComicCharacterImpl hero1 : repository.getHeroes()) {
                                        if (hero1.getName().equals(hero.getName())) {
                                            hero1.setHealth(hero.getHealth());
                                        }
                                    }
                                    if (s.equals(hero.getName())) {
                                        arena1.getHeroes().remove(hero);
                                    }
                                }
                                if (arena1.getHeroes().size() == 0) {
                                    String name = arena1.getArenaName();
                                    repository.getArenas().remove(arena1);
                                    repository.getHeroWars().add(1);
                                    return String.format("Heroes won the battle of %s!", name);
                                }
                                for (AntiHero antiHero : arena1.getAntiHeroes()) {
                                    for (ComicCharacterImpl antiHero1 : repository.getAntiHeroes()) {
                                        if (antiHero1.getName().equals(antiHero.getName())) {
                                            antiHero1.setHealth(antiHero.getHealth());
                                        }
                                    }
                                    if (s.equals(antiHero.getName())) {
                                        arena1.getAntiHeroes().remove(antiHero);
                                    }
                                }
                                if (arena1.getAntiHeroes().size() == 0) {
                                    String name = arena1.getArenaName();
                                    repository.getArenas().remove(arena1);
                                    repository.getAntiHeroWars().add(1);
                                    return String.format("Anti Heroes won the battle of %s!", name);
                                }
                            }
                        }
                    }else {
                        while (true) {
                            for (int i = 0; i < arena1.getHeroes().size(); i++) {
                                if(arena1.getAntiHeroes().get(i).getAttack() >= arena1.getHeroes().get(i).getHealth()) {
                                    namesToBeRemoved.add(arena1.getHeroes().get(i).getName());
                                }else {
                                    double currHealth1 = arena1.getAntiHeroes().get(i).getHealth();
                                    double currHealth2 = arena1.getHeroes().get(i).getHealth();
                                    int switcher = 1;

                                    while (true) {
                                        if (switcher % 2 != 0) {
                                            currHealth2 -= arena1.getAntiHeroes().get(i).getAttack();
                                            if (currHealth2 <= 0) {
                                                namesToBeRemoved.add(arena1.getHeroes().get(i).getName());
                                                break;
                                            }
                                            arena1.getHeroes().get(i).setHealth(currHealth2);
                                        }else {
                                            currHealth1 -= arena1.getHeroes().get(i).getAttack();
                                            if (currHealth1 <= 0) {
                                                namesToBeRemoved.add(arena1.getAntiHeroes().get(i).getName());
                                                break;
                                            }
                                            arena1.getAntiHeroes().get(i).setHealth(currHealth1);
                                        }
                                        switcher++;
                                    }
                                }
                            }
                            for (String s : namesToBeRemoved) {
                                for (Hero hero : arena1.getHeroes()) {
                                    for (ComicCharacterImpl hero1 : repository.getHeroes()) {
                                        if (hero1.getName().equals(hero.getName())) {
                                            hero1.setHealth(hero.getHealth());
                                        }
                                    }
                                    if (s.equals(hero.getName())) {
                                        arena1.getHeroes().remove(hero);
                                    }
                                }
                                if (arena1.getHeroes().size() == 0) {
                                    String name = arena1.getArenaName();
                                    repository.getArenas().remove(arena1);
                                    repository.getHeroWars().add(1);
                                    return String.format("Heroes won the battle of %s!", name);
                                }
                                for (AntiHero antiHero : arena1.getAntiHeroes()) {
                                    for (ComicCharacterImpl antiHero1 : repository.getAntiHeroes()) {
                                        if (antiHero1.getName().equals(antiHero.getName())) {
                                            antiHero1.setHealth(antiHero.getHealth());
                                        }
                                    }
                                    if (s.equals(antiHero.getName())) {
                                        arena1.getAntiHeroes().remove(antiHero);
                                    }
                                }
                                if (arena1.getAntiHeroes().size() == 0) {
                                    String name = arena1.getArenaName();
                                    repository.getArenas().remove(arena1);
                                    repository.getAntiHeroWars().add(1);
                                    return String.format("Anti Heroes won the battle of %s!", name);
                                }
                            }
                        }
                    }
                }
            }
        }
        return "";
    }

    @Override
    public String endWar() {
        if (repository.getHeroWars().size() > repository.getAntiHeroWars().size()) {
            return String.format("After  battles our FRIENDLY HEROES WON!", repository.getAntiHeroWars().size() + repository.getHeroWars().size());
        }else {
            return "WE ARE DOOMED!";
        }
    }
}
