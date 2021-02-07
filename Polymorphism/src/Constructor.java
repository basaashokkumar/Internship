class Bankersinterest{
    Bankersinterest(int p, int r)
    {
        int t=3;
        System.out.println((p*r*t)/100);

    }
    Bankersinterest(){
        double p=11111,r=4,t=3;
        System.out.println((p*r*t)/100);
    }
    Bankersinterest(int p,int r, int t){
        System.out.println((p*r*t)/100);
    }
}
public class Constructor{
    public static void main(String[] args) {
        Bankersinterest ob =new Bankersinterest(1250,3);
        Bankersinterest ob1 =new Bankersinterest();
        Bankersinterest ob2=new Bankersinterest(1250,2,5);

    }
}