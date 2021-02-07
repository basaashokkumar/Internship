package com.company;
import java.util.Scanner;
class Evenodd{
    void perform(int num) {


        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}


    public class Even {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            Evenodd eo=new Evenodd();
            eo.perform(num);


        }
    }

