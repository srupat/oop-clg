public class Lab4 {
    public static void main(String[] args) {
        try {

            String[] names = {"Alice", "Bob", null};
            int index = 2;


            int length = names[index].length();


            int cgpa = 9;
            int denominator = index - 2;
            int result = cgpa / denominator;


            int value = names[index].charAt(0);

            System.out.println("Length: " + length);
            System.out.println("cgpa: " + result);
            System.out.println("Value: " + value);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
