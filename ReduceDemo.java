package by.itacademy;

import java.util.stream.IntStream;

public class ReduceDemo {
    public static void main(String[] args) {
        IntStream.of(1,4,5,6,7)
                .reduce(0,(acc,right)-> acc + right);
    }
}
