import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    Buffer(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int item, int producerId) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }
            System.out.println("Producer " + producerId + " produced item: " + item);
            buffer.add(item);
            notifyAll();
        }
    }

    public void consume(int consumerId) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == 0) {
                wait();
            }
            int consumedItem = buffer.removeFirst();
            System.out.println("Consumer " + consumerId + " consumed item: " + consumedItem);
            notifyAll();
        }
    }
}

class Producer extends Thread {
    private Buffer buffer;
    private int id;

    Producer(Buffer buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i, id);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;
    private int id;

    Consumer(Buffer buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume(id);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Lab5 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(2);
        Producer producer1 = new Producer(buffer, 1);
        Producer producer2 = new Producer(buffer, 2);
        Consumer consumer = new Consumer(buffer, 1);

        producer1.start();
        producer2.start();
        consumer.start();
    }
}
