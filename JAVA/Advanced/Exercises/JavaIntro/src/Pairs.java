import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] str = scan.nextLine().split(" ");

        if(str.length % 2 == 0) {
            for (int i = 0; i < str.length - 1; i=i+2) {
                int a = Integer.parseInt(str[i]);
                int b = Integer.parseInt(str[i+1]);

                if(a%2==0 && b%2==0) {
                    System.out.printf("%d, %d -> both are even%n", a, b);
                }else if (a%2!=0 && b%2!=0){
                    System.out.printf("%d, %d -> both are odd%n", a, b);
                }else {
                    System.out.printf("%d, %d -> different%n", a, b);
                }
            }
        }else {
            System.out.println("invalid length");

        }



    }
}
