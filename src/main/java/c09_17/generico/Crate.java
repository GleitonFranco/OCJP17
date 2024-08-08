package c09_17.generico;

public class Crate<T> {
    private T content;

    public Crate() {
//        this.content = new T(); // NÃO!
    }

    public Crate(T content) {}

    public T lookInCrate() {
        return content;
    }

    public void packCrate(T content) {
        if (isValid(content))
            this.content = content;
    }

    // FORMAL TYPE PARAMETER AT METHOD LEVEL: BEFORE THE RETURN TYPE
    public static <T> boolean isValid(T t) {return true;}
    public static <T> T extractFrom(Crate<T> c) {
        return c.content;
    }
    public static <T> Class getClasse(Crate<T> c) {
        return c.content.getClass();
    }
//    public static boolean isThere(Crate crate) { // OK
//    public static boolean isThere(Crate<T> crate) { // NÃO! Tem que ter
    public static boolean isThere(Crate<?> crate) {
        return crate.content != null;
    }

    public static void main(String[] args) {
        var isOK = Crate.isValid("delivery");
        var isOK2 = Crate.<String>isValid("delivery");
        var isOK2_5 = isValid("delivery");
//        var isOK2_9 = <String>isValid("delivery"); // NÃO!!!

        var isOK3 = Crate.<String[]>isValid(args);
        var isOK4 = Crate.isValid(args);
    }

}
