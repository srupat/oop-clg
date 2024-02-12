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

        Adder add = new Adder(new int[]{3,5,-4,8,11,1,-1,7}, 15);

        int[] result = add.getData(new int[]{3,5,-4,8,11,1,-1,7}, 15);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }
}
