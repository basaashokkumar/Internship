class AB{
    int a=9;
    void display(){
        System.out.println(a);
    }
}
class CD extends AB{
    double b=7,n;
    int m;
    void display(){
        n=Math.sqrt(b);
        m=Math.abs(a);
        System.out.printf("%.16f %d",n,m);
    }

}

public class Multiple {
    public static void main(String[] args) {
        AB o=new CD();
        o.display();
        //CD oj=new AB();
       // oj.display();
    }
}
