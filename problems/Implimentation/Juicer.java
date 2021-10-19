import java.util.Scanner;

/**
 * Problem Statement : https://codeforces.com/contest/709/problem/A
 */

public class Juicer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oranges = scanner.nextInt();
        int maxOrangeSize = scanner.nextInt();
        int wasteCapacity = scanner.nextInt();
        int currentCapacity = wasteCapacity;
        int result = 0;
        for (int i = 0; i < oranges; i++) {
            int currentOrangeSize = scanner.nextInt();
            if (currentOrangeSize <= maxOrangeSize) {
                if (currentCapacity >= currentCapacity) {
                    currentCapacity -= currentOrangeSize;
                    if (currentCapacity < 0) {
                        currentCapacity = wasteCapacity;
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}