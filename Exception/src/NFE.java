public class NFE {
    public static void main(String[] args) {
        try{
            String s="abc";
            int i=Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("wrong formatting");
        }
        finally {
            System.out.println("After try-catch block Exception");
        }
    }
}
