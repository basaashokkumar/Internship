public class Power_of_a_number {
  static   int pow(int num, int pow){
        int result=1;
        for(int i=1;i<=pow;i++){
            result=result*num;
        }
        return result;
    }

    public static void main(String[] args) {
        int num=9,pow=2;
        int res;
        res=pow(num,pow);
        System.out.println(res);
    }
}
