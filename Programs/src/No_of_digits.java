public class No_of_digits {
    public static void main(String[] args) {
        int n=143,temp,r;
        int sum=0;
        //temp=n;
        while(n>0){
            r=n%10;
            sum+=r;
            n=n/10;

        }
        System.out.println("Sum of the digits :"+sum);
    }
}
