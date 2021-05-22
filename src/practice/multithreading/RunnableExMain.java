package practice.multithreading;

public class RunnableExMain {
    public static void main(String[] args) {
        ThreadRunnableEx thread=new ThreadRunnableEx();
        Thread t1=new Thread(thread);
        t1.start();
    }
}
