

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class RandomizeNumInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberA = 0;
        int numberB = 0;
        boolean correct = false;
        String input = "";
        while (!correct) {  
            try {
                System.out.print("Enter one number: \n\r");
                input = scan.nextLine();
                numberA = Integer.parseInt(input);
                
                System.out.print("Enter one number: \n\r");
                input = scan.nextLine();
                numberB = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("This is not correct number, Try again");
                continue;
            }
            correct = true;
        }
        Random rand = new Random();
        int diffrence = numberA >= numberB  ? numberA - numberB : numberB - numberA;
        
        int minNum = numberA <= numberB  ? numberA : numberB;
        
        List <Integer> newSequence = new LinkedList<>();
        
        while (newSequence.size()<=diffrence) {
            int nextNum = rand.nextInt(diffrence+1) + minNum;
            if (newSequence.contains(nextNum)) {
                continue;
            } else {
                newSequence.add(nextNum);
            }
            
            
        }
        newSequence.stream().forEach((integer) -> {
            System.out.println(integer);
        }); 
       
    }
}
