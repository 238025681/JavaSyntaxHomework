
import java.util.Scanner;


public class Covertbase7ToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean correct = false;
        String input = "";
        while (!correct) {  
            System.out.print("Enter one number: \n\r");
            input = scan.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("This is not correct number, Try again");
                continue;
            }
            correct = true;
        }
        
        System.out.printf("Base-7 : %s\n\rDecimal : %d\n\r",input, Integer.parseInt(input, 7));
    }
}
