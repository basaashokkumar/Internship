public class Largestnumber {
    public static void main(String[] args) {
        int a=73,b=8,c=18;
        if(a>b && a>c)
        {
            System.out.println("A is the Largest number :"  +a);
        }
        else{
            if(b>c && b>a){
                System.out.println("B is the Largest number :"  +b);
            }
            else{
                System.out.println("C is the Largest number :"  +c);
            }
        }
    }
}
