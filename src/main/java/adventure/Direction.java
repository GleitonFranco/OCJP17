package adventure;

public enum Direction {
    NORTH("N", "Norte"),
    EAST("L", "Leste"),
    SOUTH("S", "Sul"),
    WEST("O", "Oeste"),
    NOWHERE("", "Lugar Nenhum");

    private final String abbreviation;
    private final String name;

    Direction(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
    }

    public String getAbbreviation() {return abbreviation;}
    public String getName() {return name;}
}
