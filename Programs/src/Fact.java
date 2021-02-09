public class Fact {
    public static void main(String[] args) {
        long  num=63,factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
