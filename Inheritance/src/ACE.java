
interface Printable{
    void print();
}
interface Showable{
    void show();
}
public class ACE implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        ACE obj = new ACE();
        obj.print();
        obj.show();
    }
}
