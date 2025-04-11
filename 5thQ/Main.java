import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();

        int length = number.length();
        int sumLeft = 0;
        int sumRight = 0;

        if (length % 2 == 0) {
            for (int i = 0; i < length / 2; i++) {
                sumLeft += Character.getNumericValue(number.charAt(i));
            }
            for (int i = length / 2; i < length; i++) {
                sumRight += Character.getNumericValue(number.charAt(i));
            }
        } else {
            int middleIndex = length / 2;
            for (int i = 0; i < middleIndex; i++) {
                sumLeft += Character.getNumericValue(number.charAt(i));
            }
            for (int i = middleIndex + 1; i < length; i++) {
                sumRight += Character.getNumericValue(number.charAt(i));
            }
        }

        if (sumLeft == sumRight) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}