package adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    public static List<Room> getMap() {
        final var floresta = new Room(
                "Floresta Sursurrante",
                "Você entra num labirinto com árvores muito altas e próximas, e se desloca com dificuldade",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()

        );
        final var caverna = new Room(
                "Caverna dos Esquecidos",
                "Você entra nma caverna escura e labiríntica, cercado de pinturas enigmáticas e ecos de criaturas há muito silenciadas no mundo externo. Há uma outra saída, mas terá que passar através de um caminho de sombras e mistérios.",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        final var aldeia = new Room(
                "Aldeia Perdida",
                "Você está numa vila escondida nas profundezas da floresta, habitada por pessoas reclusas com segredos obscuros.",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        final var deserto = new Room(
                "Deserto de Areia Vermelha",
                "Você está num deserto árido e quente, com dunas de areia vermelha que se estendem até o horizonte.",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        final var porto = new Room(
                "Porto Pirata",
                "Você está num m porto infame, frequentado por piratas, contrabandistas e outros criminosos.",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        final var aldeiaMed = new Room(
                "Aldeia Medieval",
                "Você está numa vila pacata e pitoresca, cercada por um muro de pedra e com casas de madeira e palha.",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        final var catacumba = new Room(
                "Catacumba Subterrânea",
                "Você desce uma escadaria oculta numa rocha e encontra uma civilização secreta que vive nas profundezas da terra, em cavernas e túneis.",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        final var cidade = new Room(
                "Cidade Esquecida",
                "Você está nma cidade antiga e em ruínas, agora habitada por criaturas selvagens e bandidos.",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        final var feira = new Room(
                "Feira De Artefatos Clandestinos",
                "Você está numa feira, com muitas cabanas e bancadas sob o sol, muitas negociações em voz alta mas também muita coisa em sigilo. Para obter o que procura saiba escolher.",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        final var planicie = new Room(
                "Planície Esmeralda",
                "Você está numa planície vasta e verdejante, coberta por flores silvestres e árvores frutíferas.",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        porto.doors().add(new Door(deserto, Direction.WEST, true, null, 100));
        deserto.doors().add(new Door(feira, Direction.WEST, true, null, 100));
        deserto.doors().add(new Door(aldeiaMed, Direction.NORTH, true, null, 100));
        deserto.doors().add(new Door(porto, Direction.EAST, true, null, 100));
        aldeiaMed.doors().add(new Door(deserto, Direction.SOUTH, true, null, 100));
        aldeiaMed.doors().add(new Door(aldeia, Direction.NORTH, true, null, 100));
        aldeiaMed.doors().add(new Door(planicie, Direction.WEST, true, null, 100));
        aldeia.doors().add(new Door(aldeiaMed, Direction.SOUTH, true, null, 100));
        aldeia.doors().add(new Door(catacumba, Direction.EAST, true, null, 100));
        aldeia.doors().add(new Door(floresta, Direction.WEST, true, null, 100));
        catacumba.doors().add(new Door(aldeia, Direction.WEST, true, null, 100));
        floresta.doors().add(new Door(aldeia, Direction.EAST, true, null, 100));
        floresta.doors().add(new Door(planicie, Direction.SOUTH, true, null, 100));
        floresta.doors().add(new Door(caverna, Direction.WEST, true, null, 100));
        caverna.doors().add(new Door(floresta, Direction.EAST, true, null, 100));
        caverna.doors().add(new Door(cidade, Direction.SOUTH, true, null, 100));
        cidade.doors().add(new Door(caverna, Direction.NORTH, true, null, 100));
        cidade.doors().add(new Door(planicie, Direction.EAST, true, null, 100));
        planicie.doors().add(new Door(cidade, Direction.WEST, true, null, 100));
        planicie.doors().add(new Door(floresta, Direction.NORTH, true, null, 100));
        planicie.doors().add(new Door(feira, Direction.SOUTH, true, null, 100));
        planicie.doors().add(new Door(aldeiaMed, Direction.EAST, true, null, 100));
        feira.doors().add(new Door(planicie, Direction.NORTH, true, null, 100));
        feira.doors().add(new Door(deserto, Direction.EAST, true, null, 100));
        List<Room> map = Arrays.asList(
                floresta,
                caverna,
                aldeia,
                deserto,
                porto,
                aldeiaMed,
                catacumba,
                cidade,
                feira,
                planicie
        );
        shufflePersonas(getPersonas(), map);
        return map;
    }

    public static List<Persona> getPersonas() {
        var mochileiro = new Persona("O Mochileiro",
                "andarilho aleatório de férias",
                true,
                10,
                "Já passei por todos os lugares,  menos a Catacumba Subterrânea. Mesmo assim posso dizer que é melhor você voltar para onde veio; não vai gostar do que vai ver."
        );
        var eremita = new Persona("O Eremita", "morador do nada", true, 10,
                "Mais um procurando a Catacumba Subterrânea? Será que vai ser mais um que nunca mais vai voltar?"
        );
        var contrabandista = new Persona("O Contrabandista", "mercador renegado", true, 10,
                "Vou trazer uma muamba totalmente nova. É de primeira."
        );
        var atravessador = new Persona("O Atravessador", "mercador itinerante", true, 10,
                "Olha a muamba, olha a muamba, quem vai querer..."
        );
        var morcego = new Persona("O Morcego", "criatura que pode falar e cometer outros delitos humanos", true, 10,
                "Tá com medo? Verás coisas piores do que um morcego falante."
        );
        return List.of(
                mochileiro,
                eremita,
                contrabandista,
                atravessador,
                morcego
        );
    }

    public static void shufflePersonas(List<Persona> personas, List<Room> map) {
        int i =0;
        do {
            var p = personas.get(i);
            int index = (int) (Math.random() * map.size());
            var room = map.get(index);
            if (room.personas().size() == 0) {
                room.personas().add(p);
                i++;
            }
        } while (i < personas.size());
    }

    public static String input() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("******************** DEU RUIM NA ENTRADA DE DADOS! ************");
            return "";
//            throw new RuntimeException(e);
        }
    }
}
