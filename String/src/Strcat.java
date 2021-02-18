public class Strcat {
    public static void main(String[] args) {
        String s="Hello";
        s.concat("king");
        System.out.println( s.compareTo("Hello"));
        System.out.println(s.equalsIgnoreCase("Hello"));
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.substring(2,4));
        System.out.println(s.substring(2));
        System.out.println(s.replace('l','b'));
        System.out.println(s.intern());
        String s2="cheese";
        s2.replace("ee","oo");
        System.out.println(s2);
        StringBuffer s5=new StringBuffer("chalo");
       s5.replace(0,5,"Kings");
        System.out.println(s5);
        s5.reverse();
        System.out.println(s5);
        String s3;
        s3=s2.intern();
        System.out.println(s3);
    }
}
