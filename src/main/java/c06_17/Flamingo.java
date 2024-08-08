package c06_17;

public class Flamingo {
    private String color = null;

    public void setColor(String color) {
        color = color; // NÃO!
        this.color = color;
    }
}
