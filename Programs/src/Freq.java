public class Freq {
    public static void main(String[] args) {
        String str =new String("Hello");
        char ch='l';
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                ++count;
            }
        }
        System.out.println("Frequency of the given character is :"+count);
    }
}
