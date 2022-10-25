package c07;

import java.time.*;
import java.util.Arrays;

public class ArraysMain {
    public static void main(String... args) {
        int[] ints1, ints2;
        int variosInts[], umInt;
        int[] a1 = {1,2,3,4,5,6,7};
        var a2 = new int[] {1,2,3};
        int [] a3 = {4,8,9,7};
        int []a4 = {1,2,9};
        int a5[] = {1,2,3,4,5,6,7};
        int a6 [] = {1,2,3,4,5,6,7};

        System.out.println(toString(a1, a2) + Arrays.mismatch(a1,a2));
        System.out.println(toString(a3, a2) + Arrays.mismatch(a3,a2));
        System.out.println(toString(a1, a2) + Arrays.compare(a1,a2));
        System.out.println(toString(a2, a1) + Arrays.compare(a2,a1));
        System.out.println(toString(a2, a3) + Arrays.compare(a2,a3));
        System.out.println(toString(a3, a2) + Arrays.compare(a3,a2));
        System.out.println(toString(a2, a4) + Arrays.compare(a2,a4));

        int [][] d2;
        int d22[][];
        int[] d23[] = {{1}, {2}, {}};
    }

    public static String toString(int[] a1, int[] a2) {
        return Arrays.toString(a1) + " : " + Arrays.toString(a2) + " = ";
    }


}
