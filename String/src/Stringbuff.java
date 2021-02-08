public class Stringbuff {
        public static void main(String args[]){
            StringBuffer sb=new StringBuffer("Hello");
            System.out.println(sb);
            sb.append("Java");//now original string is changed
            System.out.println(sb);
            StringBuffer sb1=new StringBuffer("BASA");//
            StringBuffer aa=new StringBuffer("KING");
            System.out.println(sb1.replace(4,10,"ASHOK"));
            //System.out.println(aa.deleteCharAt(0));
            System.out.println(aa.delete(3,4));
            System.out.println(sb.capacity());
            System.out.println(aa.deleteCharAt(0));
            StringBuffer sb2=new StringBuffer();
            System.out.println(sb2.capacity());
}}
