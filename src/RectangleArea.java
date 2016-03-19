
import java.util.Scanner;
import java.util.Arrays;


public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two digits: ");
        String [] input = scan.nextLine().split(" ");
        int rectangleWidth = Integer.parseInt(input[0]);
        int rectangleLength = Integer.parseInt(input[1]);
        int area = rectangleWidth * rectangleLength;
        System.out.println(area);
        
        
        
    }
    
}
