public class NAI {
    public static void main(String[] args) {
        try{
            int a[]=new int[10];
            a[-1]=9;
        }
        catch (ArrayIndexOutOfBoundsException ep){
            System.out.println("OUT OF BOUND");
        }
        catch (NegativeArraySizeException e){
            System.out.println("-ve index for the array");
        }
        finally {
            System.out.println("after try-catch block");
        }
    }
}
