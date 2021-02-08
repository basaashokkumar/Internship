public class NP {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println("finding the length of null string");
        }
        finally {
            System.out.println("After the Try-Catch Block");
        }
    }
}
