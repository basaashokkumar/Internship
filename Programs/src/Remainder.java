public class Remainder {
    public static void main(String[] args) {
        int dividend=30,divisor=9;
        if(dividend>divisor) {
            int remainder = dividend % divisor;
            int Quotient = dividend / divisor;
            System.out.println("Remainder :" + remainder);
            System.out.println("Quotient :" + Quotient);
            if ((Quotient * divisor + remainder) == dividend) {
                System.out.println("Answer is accurate");
            } else {
                System.out.println("Answer is not accurate");
            }
        }
        else{
            System.out.println("Re-enter the values");
        }

    }
}
