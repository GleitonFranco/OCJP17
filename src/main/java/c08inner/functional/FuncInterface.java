package c08inner.functional;

public interface FuncInterface {
    void abstractFun(int x);
//    void abstractFun2(float y); // NÃO! Interface funcional só pode ter 1

    default void normalFun() {
        System.out.println("HELLO");
    }
}

class Test {

//    static {
//        int i = 0;
//        testc = 1;
//    }

    {
        test1 = "1";
    }

    public static void main(String... args) {
        FuncInterface fojb = (int x) -> System.out.println(2*x);
        FuncInterface fojb2 = x -> System.out.println(2*x);
        fojb.abstractFun(5);
        int _1 = 1;
        int $1 = 1;
        int var = 1;
        new Test();
    }

    public void obterTest() {

    }

    public Test() {

        System.out.println("vars");
        System.out.println(test1);
        System.out.println(testc);
        System.out.println(ii);
    }

    final String test1;
    static int testc;
    int ii;

}
