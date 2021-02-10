interface abc{
    void display();


}
class DCB implements abc{
    @Override
    public void display() {
        System.out.println("IMPLEMENTING");
    }
}



public class Interface {
    DCB o=new DCB();
    o.display();
}
