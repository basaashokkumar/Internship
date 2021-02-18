public class Nestedtry{
    public static void main(String args[]){
        try{
            try{
                System.out.println("going to divide");
                int b =39/0;
            }catch(ArithmeticException e){System.out.println(e);}

            try{
                int a[]=new int[5];
                a[5]=4;
            }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
            try{
                String s=null;
                System.out.println(s.length());

            }
            catch(NullPointerException e){
                System.out.println(e);}
            try{
                String s="basa";
                int j=Integer.parseInt(s);
            }catch(NumberFormatException e){
                System.out.println(e);}


            System.out.println("other statement");
            System.exit(8);
        }catch(Exception e){System.out.println("handeled");}

        finally{
            System.out.println("Finally we have to excute this statment");
        }
        System.out.println("normal flow..");
    }
}