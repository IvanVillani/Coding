package p08_pokemon_trainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.System.in;
import static java.lang.System.mapLibraryName;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!"Tournament".equals(input)) {
            String[] arr = input.split(" ");
            String nameT = arr[0];
            String nameP = arr[1];
            String element = arr[2];
            int health = Integer.parseInt(arr[3]);
            Pokemon pokemon = new Pokemon(nameP, element, health);

            if (trainers.containsKey(nameT)) {
                trainers.get(nameT).getPokemons().add(pokemon);
            }else {
                LinkedList<Pokemon> pokemons = new LinkedList<>();
                pokemons.add(pokemon);
                Trainer trainer = new Trainer(nameT, pokemons);
                trainers.put(nameT, trainer);
            }

            input = reader.readLine();
        }

        input = reader.readLine();

        while (!"End".equals(input)) {
            for (Map.Entry<String, Trainer> trainer : trainers.entrySet()) {
                String ff = input;
                boolean find = trainer.getValue().getPokemons().stream()
                        .anyMatch(pokemon -> ff.equals(pokemon.getElement()));
                if (find) {
                    trainer.getValue().setBadges(trainer.getValue().getBadges() + 1);
                }else {
                    for (Pokemon pokemon : trainer.getValue().getPokemons()) {
                        int newHealth = pokemon.getHealth() - 10;
                        pokemon.setHealth(newHealth);
                    }
                    trainer.getValue().getPokemons().removeIf(pokemon -> pokemon.getHealth() <= 0);
                }
            }

            input = reader.readLine();
        }

        trainers.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue().getBadges(), entry1.getValue().getBadges()))
                .forEach(entry -> {
                    System.out.printf("%s %d %d%n", entry.getValue().getName(), entry.getValue().getBadges(), entry.getValue().getPokemons().size());
                });
    }
}
