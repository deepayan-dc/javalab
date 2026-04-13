package lab8;

class ThreadA extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) { // 5 iterations
                System.out.println("A");
                Thread.sleep(1000); // 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class ThreadB extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) { // 5 iterations
                System.out.println("B");
                Thread.sleep(3000); // 3 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class TwoThreads {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        t1.start();
        t2.start();
    }
}