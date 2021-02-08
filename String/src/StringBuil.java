public class StringBuil {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.append("World"));
        System.out.println(sb.append("java"));
        System.out.println(System.currentTimeMillis()-starttime);
        starttime=System.currentTimeMillis();
        StringBuffer sb1=new StringBuffer("Hello");
        System.out.println(sb1.append("World"));
        System.out.println(System.currentTimeMillis()-starttime);
    }
}
