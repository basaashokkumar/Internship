import java.util.Scanner;

public class Prime_no_or_not {
    public static void main(String[] args) {
        int num;
        Scanner scan =new Scanner(System.in);
        num = scan.nextInt();
        int factors=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factors++;
            }
        }
        if(factors==2){
            System.out.println("It is a prime number :"+num);
        }
        else{
            System.out.println("It is not a Prime number ");
        }
    }
}
