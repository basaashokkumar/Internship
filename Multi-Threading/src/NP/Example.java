package NP;

public class Example {
   /* @Override
    public void run() {
        //super.run();
        System.out.println("just created a thread using thread class and running the method");
    }
*/

    public static void main(String[] args) {
        Lifecycle1 lc1 = new Lifecycle1();
        Lifecycle2 lc2=new Lifecycle2();
        lc1.start();

        lc2.start();


    }
}
