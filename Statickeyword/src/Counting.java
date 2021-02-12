public class Counting {

    static int count=0;

    Counting(){
        count++;
        System.out.println(count);
    }

    public static void main(String args[]){

        Counting c1=new Counting();
        Counting c2=new Counting();
        Counting c3=new Counting();
    }
}
