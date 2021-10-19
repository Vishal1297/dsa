import java.util.Scanner;

/**
 * Problem Statement : https://codeforces.com/contest/9/problem/A
 */

public class DiceRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int W = scanner.nextInt();
        int num = 6 - (Math.max(Y, W) - 1);
        if (num == 1) {
            System.out.println("1/6");
        } else if (num == 2){
            System.out.println("1/3");
        } else if (num == 3) {
            System.out.println("1/2");
        } else if (num == 4) {
            System.out.println("2/3");
        } else if (num == 5) {
            System.out.println("5/6");
        } else {
            System.out.println("1/1");
        }
        scanner.close();
    }
}