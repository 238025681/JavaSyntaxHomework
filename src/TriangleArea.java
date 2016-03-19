
import static java.lang.Math.abs;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        
        System.out.println("Coordinates A: ");
        String[] input = scanIn.nextLine().split(" ");
        int [] pointA = inputCoordinates(input);
        
        System.out.println("Coordinates B: ");
        input = scanIn.nextLine().split(" ");
        int [] pointB = inputCoordinates(input);
                
        System.out.println("Coordinates C: ");
        input = scanIn.nextLine().split(" ");
        int [] pointC = inputCoordinates(input);
        
        //Ax ( By−Cy)+ Bx(Cy−Ay)+ Cx ( Ay− By)
        int area = abs((pointA[0]*(pointB[1]-pointC[1]) + pointB[0]*(pointC[1] - pointA[1]) + pointC[0]*(pointA[1] - pointB[1])) / 2);
        
        System.out.println(area);

    }

    private static int[] inputCoordinates(String[] input) {
        int [] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }

    
}
