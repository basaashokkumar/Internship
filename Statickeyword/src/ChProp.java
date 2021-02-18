import java.io.IOException;

class Propagating1 {
    void ch3() throws IOException {
        //String str = null;
        //str.length();
        throw new java.io.IOException("Checked gives error");
    }

    void ch2() throws IOException {
        ch3();
    }

    void ch1() throws IOException {
        ch2();
    }

    void ch() {
        try {
            ch1();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
public class ChProp {
    public static void main(String[] args) {
        Propagating1 obj=new Propagating1();
        obj.ch();
    }
}
