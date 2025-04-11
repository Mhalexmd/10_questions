import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to delete its duplicated letters:");
        String word = input.nextLine();
        String temp = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(temp.indexOf(ch) == -1) {
                temp += ch;
            }
        }
        System.out.println("The result is: " + temp);
    }
}
