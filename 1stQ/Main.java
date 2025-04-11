import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        String num1 = scanner.next();
        System.out.println("Enter the 2nd number: ");
        String num2 = scanner.next();
        int maxLength = Math.max(num1.length(), num2.length());
        int[] number1 = new int[maxLength];
        int[] number2 = new int[maxLength];

        for (int i = 0; i < num1.length(); i++) {
            number1[maxLength - num1.length() + i] = num1.charAt(i) - '0';
        }

        for (int i = 0; i < num2.length(); i++) {
            number2[maxLength - num2.length() + i] = num2.charAt(i) - '0';
        }

        int[] result = new int[maxLength + 1];
        int carry = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int sum = number1[i] + number2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        System.out.println("The result is: ");
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) continue;
            System.out.print(result[i]);
        }

        System.out.println();
    }
}