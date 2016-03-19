import java.util.Scanner;

/**
 * Created by chobi on 3/18/16.
 */
public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String[] getCondition = scan.nextLine().split(" ");
        int numberOfMatches = Integer.parseInt(getCondition[1]);
        String oddsOrEven = getCondition[2];

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        oddsOrEvenElements(numbers, numberOfMatches, oddsOrEven);

    }

    private static void oddsOrEvenElements(int[] numbers, int numberOfMatches, String oddsOrEven) {
        int count = numberOfMatches - numbers.length <= 0 ? numberOfMatches : numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            if (oddsOrEven.matches("even") && numbers[i]%2 ==0 && count !=0){
                System.out.printf("%d ",numbers[i]);
                count--;
            }
            else if (oddsOrEven.matches("odd") && numbers[i]%2 !=0 && count !=0){
                System.out.printf("%d ",numbers[i]);
                count--;
            }
        }
    }
}
