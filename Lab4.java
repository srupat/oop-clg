public class Lab4 {
    public static void main(String[] args) {

        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This line will cause ArithmeticException
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }


        try {
            int[] numbers = {1, 2, 3};
            int index = 5; // Accessing an index beyond the array size
            int value = numbers[index]; // This line will cause ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value); // This line won't be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }


        try {
            String str = null;
            int length = str.length(); // This line will cause NullPointerException
            System.out.println("Length: " + length); // This line won't be executed
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
