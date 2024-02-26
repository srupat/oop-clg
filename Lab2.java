import java.util.Scanner;

class Adder {
    private int[] arr;
    private int numsum;

    public Adder(int[] arr, int numsum) {
        this.arr = new int[arr.length];
        this.numsum = numsum;
    }

    public int[] getData(int[] arr, int numsum) {
        int[] array = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == numsum) {
                    array[0] = arr[i];
                    array[1] = arr[j];
                    return array;
                }
            }
        }
        return array;
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] inputArray = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        Adder add = new Adder(inputArray, targetSum);

        int[] result = add.getData(inputArray, targetSum);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");

        scanner.close();
    }
}
