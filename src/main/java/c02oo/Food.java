package c02oo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {
    private LocalDate bestBefore;
    private BigDecimal discount = BigDecimal.ONE;

    public Food() {
        super(1);
        bestBefore = LocalDate.now();
    }
    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

}

class Food2 {
    public static void main(String... args) {
        new Food2();
    }
    public void Food2() { //NÃO É CONSTRUTOR! É SÓ UM MÉTODO ESQUISITO
        System.out.println("foi?");
    }
}
