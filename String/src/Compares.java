public class Compares {
    public static void main(String args[]){
        String s1="Ashok";
        s1="Ashokkumar";
        String s2="as";
        String s3=new String("Ashok");
        String s4="ASHOK",s5="kumar";
        System.out.println(s1);
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equalsIgnoreCase(s4));


        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s5));

        System.out.println(s1==s2);//instance in pool
        System.out.println(s1==s3); //instance in heap(non pool)
        System.out.println(s1==s4);




    }
}
