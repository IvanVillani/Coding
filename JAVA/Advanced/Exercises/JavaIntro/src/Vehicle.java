import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arr = scan.nextLine().split("\\s+");
        int sold = 0;

        for(;;) {
            String [] input = scan.nextLine().split("\\s+");
            if (input[0].equals("End")) {
                break;
            }else {
                String t = input[0];
                String type;
                switch (t) {
                    case "Car" :
                        t = "c";
                        break;
                    case "Bus":
                        t = "b";
                        break;
                    case "Van":
                        t = "v";
                        break;
                    default:
                        break;

                }
                int seats = Integer.parseInt(input[2]);
                String sb = t + String.valueOf(seats);
                boolean checker = false;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals(sb)) {
                        int price = t.charAt(0) * seats;
                        System.out.printf("Yes, sold for %d$%n", price);
                        arr[i] = "";
                        checker = true;
                        sold++;
                        break;
                    }
                }
                if (!checker) {
                    System.out.println("No");
                }
            }


        }
        StringBuilder sb = new StringBuilder();
        for (String anArr : arr) {
            if (!anArr.equals("") && sb.toString().equals("")) {
                sb.append(anArr);
            } else if (!anArr.equals("") && !sb.toString().equals("")) {
                sb.append(", ").append(anArr);
            }
        }


        System.out.printf("Vehicles left: %s%n", sb.toString());
        System.out.printf("Vehicles sold: %s%n", sold);
    }
}
