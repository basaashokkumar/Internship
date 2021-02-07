import java.io.*;
import java.util.Scanner;
import java.util.Scanner.*;
class Rbi{
    double rate=7.5;
    double getRateOfInterest(int principle ,int time){
        return (rate*principle*time)/100;
    }


}
class Sbi extends Rbi{
    double rate=3.23;
    double getRateOfInterest(int principle ,int time){
        return (rate*principle*time)/100;
    }
}
public class Bank {
    public static void main(String[] args) {
        int principle,time;
        double SI;
        Scanner scan=new Scanner(System.in);
        //rate=scan.nextInt();
        principle=scan.nextInt();
        time=scan.nextInt();
        Sbi ob=new Sbi();
        SI=ob.getRateOfInterest(principle,time);
        System.out.println(SI);



    }
}
