public class Passingarray {
    static int getMin(int arr[]){
        int max=0;
        for(int x:arr){
            if(max<x){
                max=x;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int p[]=new int[4];
        for(int i=0;i<4;i++){
            p[i]=i+8;
        }
        int max;
        max =getMin(p);
        System.out.println(max);
    }
}
