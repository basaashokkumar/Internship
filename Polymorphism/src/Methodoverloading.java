class Banks{
    int  getRateOfInterest(int p,int t)
    { int rate=3;
        return (rate*p*t)/100;
    }
    int  getRateOfInterest(int r,int p, int t)
    {
        return (r*p*t)/100;
    }
    double  getRateOfInterest(double r,int p)
    {
        int t=4;
        return (r*p*t)/100;
    }
}
public class Methodoverloading  extends Banks{
    public static void main(String[] args) {
        Methodoverloading ob=new Methodoverloading();
        System.out.println(ob.getRateOfInterest(1250,3));
        System.out.println(ob.getRateOfInterest(7.38,2500));
        System.out.println(ob.getRateOfInterest(2,500,3));
    }
}
