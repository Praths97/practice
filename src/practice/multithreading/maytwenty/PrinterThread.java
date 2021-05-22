package practice.multithreading.maytwenty;

public class PrinterThread extends Thread{
    String s1,s2;
public PrinterThread(String s1,String s2) {
    this.s1=s1;
    this.s2=s2;


}
    public void run() {
StringPrinter print=new StringPrinter();
print.print(s1,s2);

    }
}
