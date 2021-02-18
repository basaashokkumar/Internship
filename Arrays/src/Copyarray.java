public class Copyarray {
    public static void main(String[] args) {
        int a1[]={1,2,4,6,7,9};
        System.out.println(a1.length);
        int b1[]=new int[a1.length];
        System.arraycopy(a1,0,b1,0,6);
        for(int x:b1)
            System.out.print(x+" ");
    }
}
