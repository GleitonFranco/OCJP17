package c09_17;

// Comparable --> java.lang.*

public record Duck(int id, String name, double weight) implements Comparable<Duck> {
    @Override
    public int compareTo(Duck o) {
        return 0;
    }
    public void apply2(String s) {}
}
