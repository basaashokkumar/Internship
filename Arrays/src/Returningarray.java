public class Returningarray {
    static int []getArray(){
        int d[]={1,2,3,4,9,8,7,6};
        return d;
    }

    public static void main(String[] args) {
        int z[]=getArray();
        for(int i=0;i<z.length;i++){
            System.out.print(z[i]+" ");
        }
    }
}
