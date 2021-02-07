import java.io.*;
import java.util.*;
public class Logical {
    static public void main(String[] args){
        int num1=8;
        int num2=9;
        System.out.println(num1>num2 && num2<num1);
        int result = num1++;
        System.out.println(result);
        System.out.println(result);
        result = ++num1;
        System.out.println(result);
        int x,y,z;
        x=6;
        y=3;
        z=x++ + ++y;
        System.out.println(z);
        int a=6,b=3;
        int c;
        c=++a +  ++a;
        System.out.println(c);
    }
}
