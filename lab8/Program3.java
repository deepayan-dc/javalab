package lab8;

class SalesPersons extends Thread {
    String[] names = {"Aryan", "Roy", "Shaurya", "Tanmay"};
    private boolean suspended = false;
    public synchronized void suspendThread() {
        suspended = true;
    }
    public synchronized void resumeThread() {
        suspended = false;
        notify();
    }
    public void run() {
        try {
            for (int i = 0; i < names.length; i++) {
                synchronized (this) {
                    while (suspended) {
                        wait(); // wait if suspended
                    }
                }
                System.out.println("Sales Person: " + names[i]);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Days extends Thread {
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
            "Saturday", "Sunday"};
    SalesPersons sp;
    Days(SalesPersons sp) {
        this.sp = sp;
    }
    public void run() {
        try {
            for (int i = 0; i < days.length; i++) {
                System.out.println("Day: " + days[i]);
                if (days[i].equals("Sunday")) {
                    System.out.println("Suspending SalesPersons on Sunday...");
                    sp.suspendThread();
                }
                if (days[i].equals("Wednesday")) {
                    System.out.println("Resuming SalesPersons on Wednesday...");
                    sp.resumeThread();
                }
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Program3 {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        SalesPersons sp = new SalesPersons();
        Days d = new Days(sp);
        sp.start();
        d.start();
    }
}
