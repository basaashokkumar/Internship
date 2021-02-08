public class AIOB {
    public static void main(String[] args) {
        try{
            int a[]=new int[10];
            a[100]=123;
        }
        catch (ArrayIndexOutOfBoundsException ep){
            System.out.println("Indexed value is out of the array size");
        }
        finally{
            System.out.println("After the try-catch block");
        }
    }
}
