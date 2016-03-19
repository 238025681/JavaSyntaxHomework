
import java.util.Arrays;
import java.util.Scanner;


public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] num = new double[3];
        int count = 0;
        while (count != 3) {  
            System.out.print("Enter one number: ");
            String input = scan.nextLine();
            try {
                num[count] = Double.parseDouble(input);
            } catch (Exception e) {
                System.out.println("This is not correct number, Try again");
                continue;
            }
            count++;
        }
        double [] formula = new double[2];
        formula[0] = firstFormula(num);
        formula[1] = secondFormula(num);
        
        
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f\n\r", formula[0], formula[1],Math.abs( averageValue(num) - averageValue(formula)));
        
       
    }

    private static double firstFormula(double[] num) {
        
        double argument = (Math.pow(num[0], 2) + Math.pow(num[1], 2)) / (Math.pow(num[0], 2) - Math.pow(num[1], 2));
        double power = (num[0] + num[1] + num[2]) / Math.sqrt(num[2]);
        
        return Math.pow(argument, power);
    }

    private static double secondFormula(double[] num) {
        double argument = (Math.pow(num[0], 2) + Math.pow(num[1], 2) - Math.pow(num[2], 3));
        double power = num[0] - num[1];

         return Math.pow(argument, power);
    }

    private static double averageValue(double[] num) {
       double sum = 0;
       double average = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        average = sum / num.length;
        return average;
    }
    
}
