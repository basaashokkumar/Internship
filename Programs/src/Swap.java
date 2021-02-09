public class Swap {
    public static void main(String[] args) {
        int number1=3,number2=4;
        int temp;
        System.out.println("before swap:"+number1+" "+number2);
        System.out.println("now we are going to swap the numbers");
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("after swap:"+number1+" "+number2);
    }
}
