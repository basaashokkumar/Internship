class Propagating {
    void ch3() {
        String str = null;
        str.length();
    }

    void ch2() {
        ch3();
    }

    void ch1() {
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
public class Propagation {
    public static void main(String[] args) {
     Propagating obj=new Propagating();
     obj.ch();
    }
}
