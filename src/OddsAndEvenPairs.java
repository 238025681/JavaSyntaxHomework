
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class OddsAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        boolean correct = false;
       
        List <Integer> numbers = new LinkedList<>();
        while (!correct) {  
            try {
                System.out.print("Enter few numbers: \n\r");
                String [] input = scan.nextLine().split(" ");
                if (input.length % 2 != 0) {
                    throw new ArrayStoreException();
                }
                
                for (String string : input) {
                    numbers.add(Integer.parseInt(string));
                }
                
            } catch (ArrayStoreException e) {
                System.out.println("Invalid length");
                continue;
            } catch (Exception e){
                System.out.println("This is not correct number, Try again");
                continue;
            }
            
            correct = true;
        }
        for (int i = 0; i < numbers.size(); i+=2) {
            oddsOrEvent(numbers.get(i), numbers.get(i+1));
        }
     
    }
    public static void oddsOrEvent (int num, int num2){
        if (num % 2 == 0 && num2 % 2 == 0) {
            System.err.printf("%d, %d -> both are even\n\r", num, num2);
        } else if (num % 2 == 1 && num2 % 2 == 1) {
            System.out.printf("%d, %d -> both are odd\n\r", num, num2);
        } else {
            System.out.printf("%d, %d -> different\n\r", num, num2);
        }
    }
}
