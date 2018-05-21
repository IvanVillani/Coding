import java.util.ArrayList;
import java.util.Scanner;

public class FirstOddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] strr = scan.nextLine().split(" ");
        String [] arr = scan.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(arr[1]);
        String ore = arr[2];

        if (ore.equals("even")) {
            for (int i = 0; i < strr.length; i++) {
                int num = Integer.parseInt(strr[i]);
                if (num % 2 == 0 && n > 0) {
                    list.add(num);
                    n--;
                }
            }
        }else {
            for (int i = 0; i < strr.length; i++) {
                int num = Integer.parseInt(strr[i]);
                if (num % 2 != 0 && n > 0) {
                    list.add(num);
                    n--;
                }
            }
        }

        for (Integer el : list) {
            System.out.print(el);
            System.out.print(" ");
        }
    }
}

