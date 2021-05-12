package by.itacademy.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("11111111", "22222222", "22222222", "44444444", "5", "3");


        long collect = strings.stream()
                .filter(it-> it.length() >= 8)
                .distinct()
                .count();
        System.out.println(collect);

    }
}
