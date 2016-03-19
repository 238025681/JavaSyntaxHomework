
import java.math.BigInteger;
import java.util.Scanner;

public class FormatNumber {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Plase enter one number between 0 and 500: ");
        
        int firstNum = scan.nextInt();
        System.out.println("Plase enter one double number: ");
        double secondNum = scan.nextDouble();
        System.out.println("Plase enter last double number: ");
        double thirdNum = scan.nextDouble();
        System.out.printf("|%-10x|%010d|%10.2f|%-10.3f\n\r", firstNum, new BigInteger(Integer.toBinaryString(firstNum)), secondNum, thirdNum);
   
    }
}
