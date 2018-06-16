import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class P02_Linear {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Pattern pattern = Pattern.compile("\\s*[A-Z][a-z]+\\s*[A-Z][a-z]+\\s*");

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayDeque<String> problems = new ArrayDeque<>();
        ArrayDeque<String> candidates = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            problems.push(input);
        }
        for (int i = 0; i < m; i++) {
            String input = reader.readLine();
            String name;
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                name = matcher.group();
                candidates.add(name);
            }
        }

        while (problems.size() > 0 && candidates.size() > 1) {
            String problem = problems.pop();
            int problemSum = 0;
            int candidateSum = 0;
            for (char ch : problem.toCharArray()) {
                problemSum += ch;
            }
            String candidate = candidates.remove();
            for (char ch : candidate.toCharArray()) {
                candidateSum += ch;
            }
            if (candidateSum > problemSum) {
                candidates.add(candidate);
                System.out.printf("%s solved %s.%n", candidate, problem);
            }else {
                problems.addLast(problem);
                System.out.printf("%s failed %s.%n", candidate, problem);
            }
        }
        if (problems.size() == 0) {
            StringBuilder sb = new StringBuilder();
            int size = candidates.size();
            if (size > 1) {
                for (int i = 0; i < size; i++) {
                    sb.append(candidates.remove()).append(", ");
                }
                sb.replace(sb.length()-2, sb.length(), "");
                System.out.println(sb);
            }else {

            }
        }else {
            if (candidates.size() == 1) {
                System.out.printf("%s gets the job!%n", candidates.pop());
            }
        }
    }
}
