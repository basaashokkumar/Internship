import java.util.StringTokenizer;
public class Tokenizer{
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("my name is ashok"," ");
        System.out.println(st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());

        }

    }
}
