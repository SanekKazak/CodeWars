package Task1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSqrt(15));
        System.out.println(isSqrt(15));


    }

    public static long isSqrt(long number){
        double inputSqrt = Math.sqrt(number);
        long nextNumb = (int)inputSqrt + 1;
        if (inputSqrt % 1 == 0) return nextNumb * nextNumb;
        else return -1;

    }

}
