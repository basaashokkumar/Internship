package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("ArrayLists:");
        ArrayList list1=new ArrayList();
        Scanner scan=new Scanner(System.in);
        int ch;
        String str=new String();
        ch=scan.nextInt();
        switch(ch){
            case 1:{
                System.out.println("Inserting contact");
                scan.nextLine();
                str=scan.nextLine();
                list1.add(str);
                System.out.println(list1);

            }
            case 2:{
                System.out.println("Deleting contact");
               // System.out.println(list1);
                scan.nextLine();
                str=scan.nextLine();
                list1.remove(str);
                break;
            }
            case 3:{
                System.out.println("searching contact");
                scan.nextLine();
                str=scan.nextLine();
                list1.contains(str);
                break;
            }
            case 4:{
                System.out.println("updating contact");
                scan.nextLine();
                str=scan.nextLine();
                list1.set(1,str);
                break;
            }
            default:
                System.out.println("Re-enter the operation");

        }
    }
}
