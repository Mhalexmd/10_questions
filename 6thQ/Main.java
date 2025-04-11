import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int minDistance = Integer.MAX_VALUE;
        int lastPos1 = -1;
        int lastPos2 = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                lastPos1 = i;
                if (lastPos2 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastPos1 - lastPos2));
                }
            }
            if (array[i] == num2) {
                lastPos2 = i;
                if (lastPos1 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastPos1 - lastPos2));
                }
            }
        }

        if (minDistance != Integer.MAX_VALUE) {
            System.out.println("Minimum distance: " + minDistance);
        } else {
            System.out.println("One or both numbers not found in array");
        }
    }
}