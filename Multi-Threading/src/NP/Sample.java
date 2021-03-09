package NP;

public class Sample implements Runnable{
    @Override
    public void run() {
        //super.run();
        System.out.println("just created a thread using Runnable Interface and running the method");
    }

    public static void main(String[] args) {
        Sample s=new Sample();
        Thread t=new Thread(s);
        t.start();
    }
}
