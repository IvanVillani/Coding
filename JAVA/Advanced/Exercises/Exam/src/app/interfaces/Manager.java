package app.interfaces;

import app.entities.ComicCharacterImpl;
import app.entities.Power;

public interface Manager {
    String checkComicCharacter(String characterName);

    String addHero(ComicCharacterImpl hero);

    String addAntiHero(ComicCharacterImpl antiHero);

    String addArena(Arena arena);

    String addHeroToArena(String arena, String hero);

    String addAntiHeroToArena(String arena, String antiHero);

    String loadSuperPowerToPool(Power power);

    String assignSuperPowerToComicCharacter(String comicCharacter, String superPower);

    String usePowers(String characterName);

    String startBattle(String arena);

    String endWar();

}
