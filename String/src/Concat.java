public class Concat {
    public static void main(String[] args) {
        //Strings are immutable
        String st="Basa";
        System.out.println(st);
        //st.concat(" Ashok");
        st=st.concat(" Ashok");
        System.out.println(st);
        //here we have concatenated but we have to refer to that object in string constant pool.
        String s=st.concat(" Kumar");
        System.out.println(s);
        String st1="Hello";
        String st2="World";
        String st3=new String("Java");
        System.out.println(st1+st2);
        System.out.println(st1.concat(st2));
        System.out.println(st1+st3);
        String st4=50+30+40+"40";
        System.out.println(st4);
    }
}
