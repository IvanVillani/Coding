package p05_military;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();

        HashSet<Private> privates = new LinkedHashSet<>();

        while (!"End".equals(input)) {
            String[] arr = input.split(" ");
            switch (arr[0]) {
                case "Private":
                    Privat privat = new Privat(Integer.parseInt(arr[1]), arr[2], arr[3], Double.parseDouble(arr[4]));
                    privates.add(privat);
                    System.out.println(privat.toString());
                    break;
                case "LeutenantGeneral":
                    LeutenantGeneral leutenantGeneral = new LeutenantGeneral(Integer.parseInt(arr[1]), arr[2], arr[3], Double.parseDouble(arr[4]), privates);
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
                    Spy spy = new Spy(Integer.parseInt(arr[1]), arr[2], arr[3], Integer.parseInt(arr[4]));
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
