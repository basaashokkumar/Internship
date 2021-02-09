public class Gcd {
    public static void main(String[] args) {
        int a=72,gcd=1,b=120;
        for(int i=1;i<a && i<b;i++)
        {
            if(a%i==0 && b%i==0){
                 gcd=i;
            }
        }
        System.out.println(gcd);
        System.out.println((a*b)/gcd);

    }
}
