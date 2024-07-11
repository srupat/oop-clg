import java.util.Scanner;

public class exam25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input
        System.out.println("Enter the number of numbers:");
        int countOfNumbers = sc.nextInt();
        System.out.println("Enter the number of threads:");
        int numberOfThreads = sc.nextInt();

        final int partitionSize = countOfNumbers / numberOfThreads;
        int globalStart = 1;
        while(globalStart < countOfNumbers){
            final int start = globalStart;
            final int end = start + partitionSize - 1;

            for(int i=start;i<end;i+=partitionSize){
                Thread t = new Thread(()-> {
                    System.out.println(Thread.currentThread().getName() + "counting numbers from "+start+" to "+end);
                });
                t.start();
                try{
                    t.join();
                }
                catch (InterruptedException e){
                    e.getMessage();
                }
            }

            globalStart = globalStart + partitionSize - 1;
        }


    }
}
