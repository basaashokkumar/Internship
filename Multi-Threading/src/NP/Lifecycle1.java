package NP;

public class Lifecycle1 extends Thread{

    @Override
    public void run() {
        //super.run();
        System.out.println("LifeCycle of Thread");
        for (int i=0;i<19;i++){
            System.out.println("Thread Count :"+i);
            if (i==6)
                stop();
        }

    }


    }



