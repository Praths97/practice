package practice.multithreading;

public class ThreadExMain {
    public static void main(String[] args) {
        ThreadEx t1=new ThreadEx();
        t1.setPriority(4);
        t1.getPriority();
        System.out.println(t1.getPriority());
        t1.setName("ThreaddemoEx");
        System.out.println(t1.getName());
        t1.start();
    }
}
