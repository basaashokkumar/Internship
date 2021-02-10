class A{
    protected int a=8;
}
class B extends A{
    protected int b=6;
}
class C extends B{
    protected int c=4;
}



public class D {
    public static void main(String[] args) {
        C ob=new C();
        System.out.println(ob.a + ob.b +ob.c);

    }
}
