public class Substr {
    public static void main(String[] args) {
        String str="Basa Ashok Kumar";
        //substrings
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,10));
        System.out.println(str.charAt(5));
        String s="     Hello";
        System.out.println(s.trim());//removes whitespaces.
        //intern() method
        String f=str.intern();
        System.out.println(f);
    }
}
