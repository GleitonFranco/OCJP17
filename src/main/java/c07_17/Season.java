package c07_17;

public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    String expectedVisitors;

    Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
        System.out.println("constructing");
    }

    public String printExpectedVisitors() {
        return this.expectedVisitors;
    }

}
