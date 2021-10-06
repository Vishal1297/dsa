import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stones = scanner.nextInt();
        String colors = scanner.next();
        char prevChar = colors.charAt(0);
        int requiredColors = 0;
        for (int i = 1; i < stones; i++) {
            if (prevChar == colors.charAt(i)) {
                requiredColors++;
            }
            prevChar = colors.charAt(i);
        }
        System.out.println(requiredColors);
        scanner.close();
    }
}
