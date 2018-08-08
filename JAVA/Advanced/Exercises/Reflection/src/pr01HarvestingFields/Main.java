package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        while (true) {
            String mod = reader.readLine();

            if ("HARVEST".equals(mod)) {
                break;
            }

            printFieldsByModifier(mod);
        }
	}

    private static void printFieldsByModifier(String mod) {
	    Field[] fields = getFieldsByModifier(mod);

        if (fields != null) {
            Arrays.stream(fields)
                    .forEach(field -> System.out.printf("%s %s %s%n",
                            Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName()));
        }
    }

    private static Field[] getFieldsByModifier(String mod) {
        Field[] fields = RichSoilLand.class.getDeclaredFields();

        switch (mod) {
            case "private":
                return Arrays.stream(fields)
                        .filter(field -> Modifier.isPrivate(field.getModifiers()))
                        .toArray(Field[]::new);
            case "public":
                return Arrays.stream(fields)
                        .filter(field -> Modifier.isPublic(field.getModifiers()))
                        .toArray(Field[]::new);
            case "protected":
                return Arrays.stream(fields)
                        .filter(field -> Modifier.isProtected(field.getModifiers()))
                        .toArray(Field[]::new);
            case "all":
                return fields;
        }

        return null;

    }
}
