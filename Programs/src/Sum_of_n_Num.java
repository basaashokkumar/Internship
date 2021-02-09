public class Sum_of_n_Num {
    public static void main(String[] args) {
        int i=1,sum=0,num=100;
        while(num>0)
        {
         sum+=i;
         i++;
         num--;
        }
        System.out.println(sum);
    }
}
