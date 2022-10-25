package c05;

public class Infinity {

    //}
    //
    //class Beyond extends Infinity {
    static Integer i;
    public static void main(String[] args) {
        int sw = (int)(Math.random() * 3);
        switch(sw) {
            case 0: {
                for(int x = 10; x > 5; x++)
                    if(x > 10000000) x = 10;
                break;
            }
            case 1: { int y = 7 * i; break; }
        //case 2: { Infinity inf = new Beyond();
        //Beyond b = (Beyond)inf; }
        }
    }

    public static String season14Ce(int value) {
        return switch (value) {
            case 1 -> "Spring";
            case 2,3 -> "Summer";
            case 4 -> {yield "Some rain";}
            //case 5 -> {}   // NÃO! switch expression
            default -> "none"; // required
        };
    }

    public static void season14CePrint(int value) {
        switch (value) {
            case 1 -> System.out.println("Spring");
            case 2,3 -> System.out.println("Summer");
            case 4 -> {
                System.out.println("Winter");
            }
        }

        for (int i =0, j = 0; i < 5; i++, j-- ) {

        }
    }

}
