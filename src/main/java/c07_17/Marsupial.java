package c07_17;

class Marsupial {
    protected int age = 3;
    public static boolean isBiped() {
        return false;
    }

    public int getAge2() {
        return 1;
    }

    public int getAge() {
        return this.age;
    }
}

class Kangaroo extends Marsupial {
    protected int age = 6;
    public static boolean isBiped() {
        return true;
    }
    public int getAge() {
        return this.age;
    }
    public int getAge2() {
        return 2;
    }

    public static void main(String... args) {
        Kangaroo k = new Kangaroo();
        Marsupial m = (Marsupial) k;
//        Marsupial l = (Kangaroo) (new Marsupial()); //CCE
        System.out.println(k.isBiped());
        System.out.println(m.isBiped());
        System.out.println(k.getAge());
        System.out.println(m.getAge());
        System.out.println(k.getAge2());
        System.out.println(m.getAge2());
        System.out.println(k.age);
        System.out.println(m.age);
    }

}
