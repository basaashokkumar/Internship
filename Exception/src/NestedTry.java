public class NestedTry {
    public static void main(String[] args) {
        try{
            int a=9,b=9;
            if(a==b){
                try{
                    int c=a-b;
                    int x=8/c;
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Arithmetic Exception");
                }
            }


        }
        catch (Exception e){
            System.out.println("IOEXCEPTION");
        }
        finally {
            System.out.println("after the try-catch block");
        }
    }

}
