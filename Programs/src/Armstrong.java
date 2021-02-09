public class Armstrong {
    public static void main(String[] args) {
        int n=153,temp,r;
        int rev=0;
        temp=n;
        while(n>0){
            r=n%10;
            rev=rev + r*r*r;
            n=n/10;

        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("Armstrong Number :"+rev);
        }
        else{
            System.out.println("Not a Armstrong Number");
        }

    }
}