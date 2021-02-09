import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        int year;
        Scanner scan =new Scanner(System.in);
        year=scan.nextInt();

            if((year%4==0) || (year%100==0)){
                if(year%400==0 || year%4==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Non-Leap Year");
                }



        }
        else{
            System.out.println("Non-Leap Year");
        }

    }
}
