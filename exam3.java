
class MultiplicationTable{

    public synchronized void printTable(int num){
        for(int i = 1;i<11;i++){
            System.out.println(num * i);
        }
    }

}
public class exam3 {
    public static void main(String[] args) {

        MultiplicationTable multiplicationTable = new MultiplicationTable();

        Thread t1 = new Thread(() -> {
            multiplicationTable.printTable(5);
//            multiplicationTable.printTable(2);
        });

        Thread t2 = new Thread(() -> {
//            multiplicationTable.printTable(5);
            multiplicationTable.printTable(2);
        });



        t1.start();
        t2.start();

    }
}
