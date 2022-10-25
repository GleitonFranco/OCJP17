package c08inner.c1regular;

public class Outer4Example {
    private int x = 1;
    public void outerMethod() {

    }
    public MemberInter creatInner() {
        return new MemberInter();
    }
    private class MemberInter {
        private int x = 2;
        public void innnerMethod() {

        }
    }
}
