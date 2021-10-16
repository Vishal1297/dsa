import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String inst = scanner.next();
        int j = 0;
        for (int i = 0; i < inst.length(); i++) {
            if (input.charAt(j) == inst.charAt(i)) {
                j++;
            }
            if(j >= input.length()) {
                break;
            }
        }
        System.out.println(j+1);
        scanner.close();
    }
}
