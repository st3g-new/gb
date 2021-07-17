package lesson3.w1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> list = fillList();
        Map<String, Integer> work= wordCount(list);
        printResult(work);
    }

    private static List<String> fillList() {
        List<String> list = List.of(
                "карты",
                "деньги",
                "два",
                "ствола",
                "два",
                "с",
                "половиной",
                "человека",
                "большой",
                "куш",
                "два",
                "ствола",
                "судьба",
                "человека",
                "письма",
                "мертвого",
                "человека"
        );
        return list;
    }

    private static Map<String, Integer> wordCount(List<String> list){
        Map<String, Integer> map = new HashMap<>();
        for (String word : list) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    private static void printResult(Map<String, Integer> map){
        System.out.println(map);
    }
}
