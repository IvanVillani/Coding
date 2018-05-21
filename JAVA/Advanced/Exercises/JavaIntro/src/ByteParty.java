import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scan.nextLine());
            arr[i] = input;
        }

        for (;;) {
            String str = scan.nextLine();
            if (str.equals("party over")) {
                break;
            }

            String [] strr = str.split(" ");
            int pos = Integer.parseInt(strr[1]);
            if (strr[0].equals("-1")) {
                for (int i = 0; i < arr.length; i++) {
                    int num = arr[i];
                    int mask = num >> pos;
                    int bit = mask & 1;
                    if (bit == 1) {
                        int mesk = ~(1 << pos);
                        arr[i] = num & mesk;
                    }else {
                        int mesk = 1 << pos;
                        arr[i] = num | mesk;
                    }
                }
            }else if (strr[0].equals("0")) {
                for (int i = 0; i < arr.length; i++) {
                    int num = arr[i];
                    int mask = ~(1 << pos);
                    arr[i] = num & mask;
                }
            }else {
                for (int i = 0; i < arr.length; i++) {
                    int num = arr[i];
                    int mask = 1 << pos;
                    arr[i] = num | mask;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

