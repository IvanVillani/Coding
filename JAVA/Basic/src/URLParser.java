import java.util.Scanner;

public class URLParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String [] firstArr;
        String [] secondArr;
        String prot = "";
        String serv = "";
        String res = "";

        if (str.contains("://")) {
            firstArr = str.split("://");
            prot = firstArr[0];
            if (firstArr[1].contains("/")) {
                secondArr = firstArr[1].split("/");
                if (secondArr.length > 2) {
                    serv = secondArr[0];
                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < secondArr.length; i++) {
                        if (i == 1) {
                            sb.append(secondArr[i]);
                        }else {
                            sb.append("/");
                            sb.append(secondArr[i]);
                        }
                    }
                    res = sb.toString();
                }else {
                    serv = secondArr[0];
                    if (secondArr.length == 2) {
                        res = secondArr[1];
                    }
                }
            }else {
                serv = firstArr[1];
            }

        }else {
            if (str.contains("/")) {
                secondArr = str.split("/");
                if (secondArr.length > 2) {
                    serv = secondArr[0];
                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < secondArr.length; i++) {
                        if (i == 1) {
                            sb.append(secondArr[i]);
                        }else {
                            sb.append("/");
                            sb.append(secondArr[i]);
                        }
                    }
                    res = sb.toString();
                }else {
                    serv = secondArr[0];
                    if (secondArr.length == 2) {
                        res = secondArr[1];
                    }
                }
            }else {
                serv = str;
            }
        }

        System.out.printf("[protocol] = \"%s\"%n", prot);
        System.out.printf("[server] = \"%s\"%n", serv);
        System.out.printf("[resource] = \"%s\"%n", res);

    }
}
