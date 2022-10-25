package c05;

import java.math.BigDecimal;

public class FindInMatrix {
    public static void main(String... args) {
//        int[][] list = {{1,13},{5,2},{2,2}};
//        int searchValue = 2;
//        int posX = -1;
//        int posY = -1;
//        PARENT_LOOP: for (int i =0; i < list.length; i++) {
//            for (int j = 0; j < list[i].length; j++) {
//                if (list[i][j] == searchValue) {
//                    posX = i;
//                    posY = j;
//                    //break;// PARENT_LOOP;
//                }
//            }
//        }
//        if (posX == -1 || posY == -1) {
//            System.out.println("Value " + searchValue + " not found!");
//        } else {
//            System.out.println("Value " + searchValue + " found at: (" + posX + "," + posY + ")");
//        }
//        continues();
//        print(new int[] {1,2,3});
        rabbit();
    }

    public static void continues() {
        for (int i = 0; i < 6; i++) {
            if (i ==4) {
                continue;
            }
            System.out.println(i);
        }

        int t = 3;
        long h = -t + t * 3;
        if (t >= 4)
            if (h < 6)
                System.out.println("A");
        else System.out.println("B");
        else System.out.println("C");

    }

    public static void scopeNumber(Number n) {
        if (n instanceof Integer integer) {
            System.out.println("Resto = " + (integer % 10));
            integer++;
        }
        if (n instanceof BigDecimal bigDecimal) {
            System.out.println("Quociente = " + bigDecimal.divide(BigDecimal.TEN));
        }
        //if (n instanceof String) {} // NÃO!
    }

    public static void print(int[] wheather) {
        System.out.println("************************");
        for (int i = 0; ++i < 10 && i < wheather.length;) {
            System.out.println(wheather[i]);
        }
    }

    public static void printType(Object o) {
        if (o instanceof Integer bat) {

        } else if (o instanceof Integer bat && bat < 10) {

        }
    }

    public static void rabbit() {
        System.out.println("**************** RABBIT ********");
        var tf = 1;
        switch (tf) {
            case 1:
                System.out.println("3");
            default: case 3:
                System.out.println("5");

        }
//        double iguana = 10;
//        do {
//            int snake = 0;
//            System.out.println(snake++ + " ");
//            iguana--;
//        } while (snake <= 5); // NÃO!
        int count = 0;
        BUNNY: for (int row = 1; row <=3; row++)
            RABBIT: for (int col = 0; col < 3; col++) {
            if ((col+row) % 2 == 0)
                break;
            count++;
            }
        System.out.println(count);
    }

    public static void rabbit2() {
        boolean kg = true;
        int r = 15, m = 10;
        do {
            --m;
            if (m == 8) kg = false;
            r -= 2;
        } while (kg);
        System.out.println(r);

//        do System.out.println(r);
//        while (true);

    }
}
