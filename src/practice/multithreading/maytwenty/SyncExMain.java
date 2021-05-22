package practice.multithreading.maytwenty;

public class SyncExMain {
    public static void main(String[] args) {
        Thread t1 = new PrinterThread("Hello..","There");
        Thread t2 = new PrinterThread("How"," are you");
        Thread t3 = new PrinterThread("Thank you,","very much");
        t1.start();
        t2.start();
        t3.start();

    }
}
