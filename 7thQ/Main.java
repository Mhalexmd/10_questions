import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        if (size1 != size2) {
            System.out.println("Arrays have different elements");
            return;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean equal = true;
        for (int i = 0; i < size1; i++) {
            if (array1[i] != array2[i]) {
                equal = false;
                break;
            }
        }

        if (equal) {
            System.out.println("Arrays have same elements");
        } else {
            System.out.println("Arrays have different elements");
        }
    }
}