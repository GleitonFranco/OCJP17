package c12streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZerosTest {

    public static void main(String[] args) {
        var numbers = Arrays.asList(1, 6, 4, 3, 2, 0, 0, 5, 0, 7, 9, 0, 0, 0);
        printConsequentZeros(numbers);
    }

    private static void printConsequentZeros(List<Integer> numbers) {
        List<Integer> zeros = new ArrayList<>();
        Integer current;
        Integer zero = Integer.valueOf(0);
        for (int i = 0; i < numbers.size(); i++) {
            current = numbers.get(i);
            if (current.equals(zero)) {
                zeros.add(i);
//                if (i == numbers.size() -1) {
//                    printLine(zeros);
//                }
            } else {
                if (zeros.size() > 1) {
                    printLine(zeros);
                } else {
                    zeros.clear();
                }
            }
        }
        if (numbers.get(numbers.size()-1).equals(zero) && zeros.size() > 1) {
            printLine(zeros);
        }
    }

    private static void printLine(List<Integer> zeros) {
        String line = zeros.stream()
                .map(n -> n.toString())
                .reduce("=> ",(acc, id) -> acc  + id + ", ");
        System.out.println(line.substring(0, line.length() - 2));
        zeros.clear();
    }

//	=> 5, 6
//  => 11, 12, 13
}
