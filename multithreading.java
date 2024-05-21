public class multithreading {
    public static void printTable(int num){
        for(int i=0;i<10;i++)
            System.out.println(num * i);
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
//            for(int i=0;i<10;i++)
//                System.out.println(i);
            printTable(2);
        });

        Thread t2 = new Thread(() -> {
//            for(int i=0;i<10;i++)
//                System.out.println(i);
            printTable(5);
        });

        t1.start();
        t2.start();
//        t1.join();

        try {
            t1.join();
//        t2.join();}
        }
        catch (InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
