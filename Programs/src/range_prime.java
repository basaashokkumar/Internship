public class range_prime {
    public static void main(String[] args) {
        int low_range=1,high_range=78,i;

        while(low_range<high_range){
            boolean flag=false;
            for(i=2;i<=high_range/2;i++){
                if(low_range%i==0){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.print(low_range+" ");
            }
            low_range++;
        }
    }
}
