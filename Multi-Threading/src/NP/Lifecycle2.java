package NP;

public class Lifecycle2 extends Thread {
    @Override
    public void run() {

        //super.run();
        System.out.println("In this method we are using yield method");
        for (int i=0;i<19;i++){
            System.out.println("Thread count :"+i);

            if (i==9)
                notify();



        }
    }
}
