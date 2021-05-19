package practice.multithreading;

public class ThreadEx extends Thread{
   // public Object sleep;


    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);

            } catch (InterruptedException e) {

            }
        }

    }

}
