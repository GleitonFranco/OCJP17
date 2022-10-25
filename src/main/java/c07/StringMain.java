package c07;

public class StringMain {
    //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
    public static void main(String... args) {
//        blocks();
//        formats();
        equality();
        api();
        concatenation();
        formats();
    }

    public static void blocks() {
        int i = 2;
//        String s = i + 1; // NÃO!
        var block = """
                a
                 b
                c""";
        var concat = " a\n" + "  b\n" + " c";
        System.out.println(block.length());
        System.out.println(concat.length());
        System.out.println(block.indent(1).length());
        System.out.println(concat.indent(-1).length());
        System.out.println(concat.indent(-4).length());
        System.out.println(concat.stripIndent().length());
        System.out.println("*"+concat.indent(-1) + "*");
        System.out.println("*"+concat.stripIndent() + "*");
    }

    public static void formats() {
        var name = "Kate";
        var orderId = 50;
        var value = 90.257;
        System.out.println(String.format("Hello %s, order nº %d is ready ;-)", name, orderId));
        System.out.println("Hello %s,%n order nº %4d is ready with value of %6.2f".formatted(name, orderId, value));
        System.out.println("Hello %s,%n order nº %04d is ready with value of %06.2f".formatted(name, orderId, value));
    }

    public static void equality() {
        var s1 = "Hello World!";// String pool
        var s2 = "  Hello World! ".trim();// HEAP
        var s3 = "Hello World!";// String pool
        System.out.println(s1);
        System.out.println("*"+s2+"*");
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s2.intern());
    }

    public static void api() {
        CharSequence cs = "umaString";
        var an = "animals";
        System.out.println(an.substring(3));
        System.out.println(an.substring(3,6));
        System.out.println(an.charAt(3));
        System.out.println(an.startsWith("an"));
        System.out.println(an.startsWith("an", 2));
        System.out.println(an.contains("ni"));
        System.out.println(an.indexOf('z'));
        System.out.println(an.indexOf('a'));
        System.out.println(an.indexOf('a', 1));// char or String
        System.out.println(an.toUpperCase());
        System.out.println(an.toUpperCase().equalsIgnoreCase(an));
        System.out.println(an.repeat(2));
        System.out.println(an.replace('a', 'A'));
        System.out.println(an.replace("a", "eeeeeee"));

        System.out.println("*" + "   Hello World  ".trim() + "*");
        System.out.println("*" + "   Hello World  ".strip() + "*");
        System.out.println("*" + "   Hello World  \t".stripLeading() + "*");
        System.out.println("*" + "   Hello World  \t".stripTrailing() + "*");
        var spc = "\tabc\n";
        System.out.println(spc);
        System.out.println(spc.length());
        System.out.println(spc.trim().length());
        var spc2 = "1\\t2\\n3\\s4\\'5\\6";
        System.out.println(spc2);
        System.out.println(spc2.length());
        System.out.println(spc2.translateEscapes());
        System.out.println(spc2.translateEscapes().length());
        System.out.println("BLANK/EMPTY");
        System.out.println("".isBlank());
        System.out.println("".isEmpty());
        System.out.println("\s".isBlank());
        System.out.println("\s".isEmpty());
    }

    public static void builder() {
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html
        var sb = new StringBuilder("SB_")
                .append(65)
                .appendCodePoint(65)
                .append(true)
                .append(4.5f)
                .insert(1,"tring")
                .deleteCharAt(1)
                .delete(3, 5);// method chaining && change sb state
        System.out.println(sb);
        var strSb = sb.substring(0,2);// não muda o sb
        System.out.println(sb);
    }
    public static void concatenation() {
        System.out.println(1 + 2 + "3" + 4 + 5 + 0 + 6.6f);
        var s = "1";
        s += "2";
        s += 3;
        System.out.println(s);
    }
}
