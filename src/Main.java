import com.sysmh.test.Util;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        test();
        System.out.println("789");
    }
    private static  void test(){
        Util util = new Util();
        int d = util.getLocalTime();
        System.out.println(d);
        System.out.println("ok");

    }
}
