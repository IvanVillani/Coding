package p10_tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Threeuple> threeuples = new ArrayList<>();

        String[] input1 = reader.readLine().split(" ");
        String[] input2 = reader.readLine().split(" ");
        String[] input3 = reader.readLine().split(" ");
        reader.close();

        Threeuple<String, String, String> threeuple1 = new Threeuple<>(input1[0] + " " + input1[1], input1[2], input1[3]);
        Threeuple<String, Integer, Boolean> threeuple2 = new Threeuple<>(input2[0], Integer.parseInt(input2[1]), "drunk".equals(input2[2]));
        Threeuple<String, Double, String> threeuple3 = new Threeuple<>(input3[0], Double.parseDouble(input3[1]), input3[2]);
        threeuples.add(threeuple1);
        threeuples.add(threeuple2);
        threeuples.add(threeuple3);

        threeuples.forEach(threeuple -> {
                    System.out.println(threeuple.getFirstItem() + " -> " + threeuple.getSecondItem() + " -> " + threeuple.getThirdItem());
                });

    }
}
