import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String startDateText = scan.nextLine();
        String endDateText = scan.nextLine();

        String format = "dd-MM-yyyy";

        LocalDate startDate = LocalDate.parse(startDateText, DateTimeFormatter.ofPattern(format));
        LocalDate endDate = LocalDate.parse(endDateText, DateTimeFormatter.ofPattern(format));

        int [] days = new int[] {
          1, 3, 1, 6, 24, 6, 22, 1, 24, 25, 26
        };

        int [] months = new int[] {
          1, 3, 5, 5, 5, 9, 9, 11, 12, 12, 12
        };

        int result = 0;

        for (LocalDate current = startDate;
             current.isBefore(endDate.plusDays(1));
             current = current.plusDays(1)) {
            if (current.getDayOfWeek().getValue() == 6 || current.getDayOfWeek().getValue() == 7) {
                continue;
            }

            boolean check = false;

            for (int i = 0; i < days.length; i++) {
                if (current.getDayOfMonth() == days[i] && current.getMonthValue() == months[i]) {
                    check = true;
                }
            }

            if (!check) {
                result++;
            }
        }

        System.out.println(result);

    }
}
