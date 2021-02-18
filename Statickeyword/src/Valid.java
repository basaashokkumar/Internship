import java.io.IOException;

public class Valid {
    static void validate(int n){
        if(n>18){
            System.out.println("All are welocome to vote!!!");
        }
        else{
            throw new ArithmeticException("Wait few more years");
        }
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("validated the age");
    }
}
