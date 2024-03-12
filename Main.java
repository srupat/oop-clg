import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));

        // Check equality of array1 and array2
        boolean isEqual1And2 = Arrays.equals(array1, array2);
        System.out.println("Array 1 and Array 2 are equal: " + isEqual1And2);

        // Check equality of array1 and array3
        boolean isEqual1And3 = Arrays.equals(array1, array3);
        System.out.println("Array 1 and Array 3 are equal: " + isEqual1And3);
    }
}
