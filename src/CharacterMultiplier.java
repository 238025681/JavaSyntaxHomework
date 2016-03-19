import java.util.Scanner;

/**
 * Created by chobi on 3/17/16.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int result = 0;

        int shortestStringLenght = input[0].length() - input[1].length() <= 0 ? input[0].length() : input[1].length();
        for (int i = 0; i < shortestStringLenght; i++) {
            result += (input[0].charAt(i)*input[1].charAt(i));
        }
        if (input[0].length() != input[1].length()){
            String largestString = input[0].length() - input[1].length() < 0 ? input[1] : input[0];
            for (int i = 0; i < largestString.length() - shortestStringLenght; i++) {
                result += largestString.charAt(i+shortestStringLenght);
            }
        }
        System.out.printf("%d\n\r", result);
    }
}
