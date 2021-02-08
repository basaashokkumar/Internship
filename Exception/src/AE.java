public class AE {
    public static void main(String[] args) {
        try{
            int x=10,y=0,z;
            z=x/y;
            System.out.println("The Value Of Z:"+z);

        }
        catch (ArithmeticException e) {
            System.out.println("Divde by zero Exception");
        }
        finally {
            System.out.println("After the try-catch block");
        }
    }
}
