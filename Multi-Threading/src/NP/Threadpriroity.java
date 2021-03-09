package NP;

public class Threadpriroity extends Thread{
    public void run(){
        int thread_count=0;
        System.out.println("just created a thread :"+(++thread_count));
    }

    public static void main(String[] args) {
        Threadpriroity t1=new Threadpriroity();
        Threadpriroity t2=new Threadpriroity();
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread.yield();
        t1.start();
        t2.start();
    }
}
