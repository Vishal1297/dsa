import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teams = scanner.nextInt();
        int result = 0;
        int[] a = new int[teams];
        int[] h = new int[teams];
        for (int i = 0; i < teams; i++) {
            a[i] = scanner.nextInt();
            h[i] = scanner.nextInt();
        }
        for (int row = 0; row < teams; row++) {
            for (int col = 0; col < teams; col++) {
                if (row != col && a[row] == h[col]) {
                    result++;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}