import java.util.Scanner;

/**
 * Created by chobi on 3/17/16.
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = 0;
        int maxValue = 20;
        boolean correct = false;
        while (!correct) {
            System.out.print("Enter one number: \n\r");
            String input = scan.nextLine();
            try {
                target = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("This is not correct number, Try again");
                continue;
            }
            correct = true;
        }
        for (int i = 1; i <= maxValue; i++) {
            for (int j = 1; j <= maxValue; j++) {
                if (i+j == target){
                    System.out.printf("%d + %d = %d\n\r", i, j, target);
                }
            }
        }

        for (int i = 1; i <= maxValue; i++) {
            for (int j = 1; j <= maxValue; j++) {
                if (i-j == target){
                    System.out.printf("%d - %d = %d\n\r", i, j, target);
                }
            }
        }
    }
}
