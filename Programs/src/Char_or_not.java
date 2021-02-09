public class Char_or_not {
    public static void main(String[] args) {
        char ch='z';
        int ascii=ch;
        if((ascii>=65 && ascii <=90)||(ascii>=97 && ascii<=122))
        {
            System.out.println("character");
        }
        else
            System.out.println("not a character");
    }
}
