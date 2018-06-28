package p05_military;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();

        Map<Integer, Private> privates = new LinkedHashMap<>();

        while (!"End".equals(input)) {
            String[] arr = input.split(" ");
            switch (arr[0]) {
                case "Private":
                    Privat privat = new Privat(Integer.parseInt(arr[1]), arr[2], arr[3], Double.parseDouble(arr[4]));
                    privates.put(Integer.parseInt(arr[1]), privat);
                    System.out.println(privat.toString());
                    break;
                case "LeutenantGeneral":
                    HashSet<Private> privates1 = new LinkedHashSet<>();
                    for (int i = 5; i < arr.length; i++) {
                        Private pri = privates.get(Integer.parseInt(arr[i]));
                        privates1.add(pri);
                    }
                    LeutenantGeneral leutenantGeneral = new LeutenantGeneral(Integer.parseInt(arr[1]), arr[2], arr[3], Double.parseDouble(arr[4]), privates1);
                    System.out.println(leutenantGeneral.toString());
                    break;
                case "Engineer":
                    HashSet<Repair> repairs = new LinkedHashSet<>();
                    for (int i = 6; i < arr.length - 1; i = i + 2) {
                        Repair repair = new Repair(arr[i], Integer.parseInt(arr[i+1]));
                        repairs.add(repair);
                    }
                    try {
                        Engineer engineer = new Engineer(Integer.parseInt(arr[1]), arr[2], arr[3], Double.parseDouble(arr[4]), arr[5], repairs);
                        System.out.println(engineer.toString());
                    }catch (IllegalArgumentException ignored) {}
                    break;
                case "Commando":
                    HashSet<Mission> missions = new LinkedHashSet<>();
                    for (int i = 6; i < arr.length - 1; i = i + 2) {
                        try {
                            Mission mission = new Mission(arr[i], arr[i+1]);
                            missions.add(mission);
                        }catch (IllegalArgumentException ignored) {}
                    }
                    try {
                        Commando commando = new Commando(Integer.parseInt(arr[1]), arr[2], arr[3], Double.parseDouble(arr[4]), arr[5], missions);
                        System.out.println(commando.toString());
                    }catch (IllegalArgumentException ignored){}
                    break;
                case "Spy":
                    Spy spy = new Spy(Integer.parseInt(arr[1]), arr[2], arr[3], arr[4]);
                    System.out.println(spy.toString());
                    break;
                default:
                    break;
            }

            input = reader.readLine();
        }
        System.out.println();
    }
}
