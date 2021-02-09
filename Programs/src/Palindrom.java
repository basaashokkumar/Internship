public class Palindrom {
    public static void main(String[] args) {
        int n=141,temp,r;
        int rev=0;
        temp=n;
        while(n>0){
            r=n%10;
            rev=rev*10 + r;
            n=n/10;

        }

        System.out.println("Reverse of the Number :"+rev);
        if(temp==rev){
            System.out.println("It is a Palindrome ");
        }
        else
        {
            System.out.println("It is not a palindrome ");
        }
    }
}
