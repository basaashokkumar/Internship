

public class Roots {
    public static double squareRoot(double number) {
        double temp;

        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }

    public static void main(String[] args) {
        double a=1,b=-5,c=6;
        double r1,r2;
        double det=b*b-4*a*c;
        double sr=squareRoot(det);
        System.out.println(det);
        if(det>0)
        {
            System.out.print("roots are real and distinct: ");
            System.out.println((-b+sr)/2*a + " " + (-b-sr)/2*a);

        }
        else if(det==0){
            System.out.println("roots are real and equal");
            System.out.println((-b+sr)/2*a + " " + (-b-sr)/2*a);
        }
        else{
            System.out.println("roots are imaginary and distinct");
            System.out.println((-b+sr)/2*a + " " + (-b-sr)/2*a);
        }

    }
}
