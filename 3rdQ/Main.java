import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with brackets: ");
        String input = scanner.nextLine();

        if (checkBalance(input) == 1) {
            System.out.println("Valid bracket sequence");
        } else {
            System.out.println("Invalid bracket sequence");
        }
    }

    public static int checkBalance(String s) {
        int round = 0;
        int curly = 0;
        int square = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') round++;
            else if (c == ')') round--;
            else if (c == '{') curly++;
            else if (c == '}') curly--;
            else if (c == '[') square++;
            else if (c == ']') square--;

            if (round < 0 || curly < 0 || square < 0) {
                return 0;
            }

            if (i > 0) {
                char prev = s.charAt(i-1);
                if ((c == ')' && prev != '(' && prev != '[' && prev != '{') ||
                        (c == '}' && prev != '{' && prev != '(' && prev != '[') ||
                        (c == ']' && prev != '[' && prev != '(' && prev != '{')) {
                    return 0;
                }
            }
        }

        return (round == 0 && curly == 0 && square == 0) ? 1 : 0;
    }
}