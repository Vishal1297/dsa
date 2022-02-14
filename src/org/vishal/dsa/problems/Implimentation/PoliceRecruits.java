import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int events = scanner.nextInt();
        int untreatedEvents = 0, recruits = 0;
        int inputs[] = new int[events];
        for (int i = 0; i < events; i++) {
            inputs[i] = scanner.nextInt();
        }
        for (int i = 0; i < events; i++) {
            if (inputs[i] == -1) {
                if (recruits > 0) {
                    recruits--;
                } else {
                    untreatedEvents++;
                }
            } else if (inputs[i] > 0) {
                recruits += inputs[i];
            }
        }
        System.out.println(Math.abs(untreatedEvents));
        scanner.close();
    }
}
