import java.io.*;
import java.util.Scanner;
import java.util.Scanner.*;
public class Airthmetic {
    public static void main(String[] args) {
        int number1,number2,result;
        Scanner scan=new Scanner(System.in);
        number1=scan.nextInt();
        number2=scan.nextInt();
        result=number1+number2;

        System.out.println(result);
        number1=result*10-number2;
        System.out.println(number1);
        number1=number2*result/number1;
        System.out.println(number1);
    }
}
