
import java.util.Scanner;


public class ConvertToBase7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean correct = false;
        while (!correct) {  
            System.out.print("Enter one number: \n\r");
            String input = scan.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("This is not correct number, Try again");
                continue;
            }
            correct = true;
        }
        System.out.printf("%s\n\r", Integer.toString(number, 7));
    }
}
