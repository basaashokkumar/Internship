public class Clone {
    public static void main(String[] args) {
        // array declaration and instantiation
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=i+1;
        }
        int a[]=arr.clone();
        for(int x:a)
        {
            System.out.print(x+" ");
        }

    }
}
