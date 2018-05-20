import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BombNumbs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : input) {
            list.add(i);
        }


        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int num = arr[0];
        int power = arr[1];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                int start = i - power;
                if (start < 0) {
                    start = 0;
                }
                int end = i + power;
                if (end > list.size()-1) {
                    end = list.size()-1;
                }
                for (int j = end; j >= start; j--) {
                    list.remove(j);
                }
                i = start-1;
            }
        }

        int sum = 0;

        for (Integer it : list) {
            sum += it;
        }

        System.out.println(sum);
    }
}
