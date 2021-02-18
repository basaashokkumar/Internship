import java.io.IOException;
import java.util.Scanner;

class TestCustomException1{

    static void validate(int age)throws IOException {
        if(age<18)
            throw new IOException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        try{
            int age=scan.nextInt();
            validate(age);
        }catch(Exception m){System.out.println("Exception occured: "+m);}

        System.out.println("rest of the code...");
    }

}