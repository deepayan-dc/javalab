package lab6;

interface Printer{
    void print();
}
class LaserPrinter  implements Printer{
    public void print(){
        System.out.println("Laser-printer is printing documents");
    }
}
public class CreateInterface {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        LaserPrinter lp = new LaserPrinter();
        lp.print();
    }
}
