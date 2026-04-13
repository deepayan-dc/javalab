package lab8;

class SharedBuffer {
    private int data;
    private boolean hasData = false;
    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait();
        }
        data = value;
        System.out.println("Produced: " + value);
        hasData = true;
        notifyAll();
    }
    public synchronized int consume() throws InterruptedException {
        while (!hasData) {
            wait();
        }
        int value = data;
        System.out.println("Consumed: " + value);
        hasData = false;
        notifyAll();
        return value;
    }
}
class Producer extends Thread {
    private SharedBuffer buffer;
    Producer(SharedBuffer buffer) { this.buffer = buffer; }

    public void run() {
        try {
            for (int value = 1; value <= 10; value++) {
                buffer.produce(value);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class Consumer extends Thread {
    private SharedBuffer buffer;
    Consumer(SharedBuffer buffer) { this.buffer = buffer; }
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
