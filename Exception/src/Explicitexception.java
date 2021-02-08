public class Explicitexception {



    public static void main(String args[]){
        int age=13;
        try {
            if (age < 18) {
                //throw  new ArithmeticException("not valid");
                throw new ArrayIndexOutOfBoundsException("not valid");
            } else {
                System.out.println("welcome to vote");
            }
        }catch (ArithmeticException e){
            System.out.println("exception Raised");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception again raised");
        }
        System.out.println("rest of the code...");
    }
}
