package lab4;

public class CountInstances {
    static int count = 0;
    CountInstances() {
        count++;
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        new CountInstances();
        new CountInstances();
        new CountInstances();
        System.out.println("Total instances created " + CountInstances.count);
    }
}
