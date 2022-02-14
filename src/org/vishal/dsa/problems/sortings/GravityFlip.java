import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int inputs[] = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = scanner.nextInt();
        }
        Arrays.sort(inputs);
        for (int i = 0; i < n; i++) {
            System.out.print(inputs[i] + " ");
        }
        scanner.close();
    }
}