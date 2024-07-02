package adventure;


public class Adventure {
    private Room yourRoom;

    public static void main(String[] args) {
        System.out.println(Utils.title());
        new Adventure();
    }

    public Adventure() {
        final var map = Data.getMap();
        this.yourRoom = map.get((int) (Math.random() * map.size()));
        String comando = "sair";
        do {
            System.out.println(Utils.bar());
            this.describeRoom();
            this.describePerson();
            this.describeDirections();
            System.out.println("O que vai fazer?");
            comando = Data.input().toUpperCase();
            this.parseCommand(comando);
        } while (!comando.equalsIgnoreCase("sair"));
    }

    private void describeRoom() {
        System.out.println("\n\nVocê está em " + yourRoom.name().toUpperCase() + "!");
        System.out.println(yourRoom.description());
    }

    private void describeDirections() {
        System.out.print("\nDireções possíveis: ");
        System.out.println(yourRoom.doors().stream()
                .map(d -> "(" + d.direction().getAbbreviation() + ") " + d.direction().getName() + " | " + d.direction().ordinal() + d.direction().name())
                .reduce("", (a,s) -> a + "\n" + s));
    }

    private void describePerson() {
        var personOpt = this.yourRoom.personas().stream().findFirst();
        if (personOpt.isPresent()) {
            final var person = personOpt.get();
            System.out.print("\nDe repente você encontra ");
            System.out.println(person.name().toUpperCase() + "!");
            System.out.print(person.name());
            System.out.println(" diz: \"" + person.quote() + "\"");
        }
    }

    public void parseCommand(String comando) {
        Direction direction = switch (comando) {
            case "N" -> Direction.NORTH;
            case "L" -> Direction.EAST;
            case "S" -> Direction.SOUTH;
            case "O" -> Direction.WEST;
            default -> Direction.NOWHERE;
        };
        var r = this.yourRoom.doors().stream().filter(d -> d.direction() == direction).findFirst();
        r.ifPresent(door -> this.yourRoom = door.room());
    }

}
