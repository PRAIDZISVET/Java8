package by.itacademy.ex3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("first", 10);
        map.put("secondsecond", 46);
        map.put("third", 4);
        map.put("fourth", 99);

        //test1(map);

        Integer reduce = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .map(Map.Entry::getValue)
                .reduce(0, (acc, current) -> acc + current);

                System.out.println(reduce);

    }

    private static void test1(Map<String, Integer> map) {
        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
