package by.itacademy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
     //   test(strings);
        IntSummaryStatistics sum = Stream.of("1", "2", "3", "5", "4", "7", "6")
                .map(Integer::valueOf)
                .mapToInt(StreamDemo::convert)
                .summaryStatistics();

        System.out.println(sum);
    }

    private static int convert (Integer value) {
        //TO DO 01.04.2021
        return value.intValue();
    }


    private static void test(List<String> strings) {
        strings.stream()
                .map(it -> it + it)
                .map(it-> Integer.valueOf(it))
                .filter(value-> value > 3000)
                .sorted()
                .forEach(it-> System.out.println(it));
    }
}
