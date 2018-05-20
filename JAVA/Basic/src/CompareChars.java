import java.util.Arrays;
import java.util.Scanner;

public class CompareChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arr1 = scan.nextLine().replaceAll(" ", "")
                .toCharArray();
        char[] arr2 = scan.nextLine().replaceAll(" ", "")
                .toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr2[i]) {
                System.out.println(new String(arr1));
                System.out.println(new String(arr2));
                break;
            }else if (arr1[i] > arr2[i]) {
                System.out.println(new String(arr2));
                System.out.println(new String(arr1));
                break;
            }else {
                if (i == arr2.length-1 && i <= arr1.length-1) {
                    System.out.println(new String(arr2));
                    System.out.println(new String(arr1));
                    break;
                }
                else if (i == arr1.length-1 && i < arr2.length-1) {
                    System.out.println(new String(arr1));
                    System.out.println(new String(arr2));
                    break;
                }
            }
        }


    }
}
