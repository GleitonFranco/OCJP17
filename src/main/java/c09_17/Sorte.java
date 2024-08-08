package c09_17;

import java.util.Comparator;

public record Sorte(int num, String text)  implements Comparable<Sorte>, Comparator<Sorte> {
    public String toString() {return "" + num;}
    public int compare(Sorte o1, Sorte o2) {return o1.num - o2.num;}
    public int compareTo(Sorte o) {return this.text.compareTo(o.text);}
}
