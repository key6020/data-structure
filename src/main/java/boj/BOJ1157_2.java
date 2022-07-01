package boj;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BOJ1157_2 {
    //    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine().toUpperCase();

        long start = System.currentTimeMillis();

        String input = "Mississipidsfdfkallllllasdffffffffffffdkkkksaaaaaaaaaaaaaa";

        assert input != null && input.length() > 0;

        Map<String, Long> map = Arrays.asList(input.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long middle = System.currentTimeMillis();
        System.out.println(middle - start);

        TreeMap<Long, List<String>> resultMap = map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue, () -> new TreeMap<>(Collections.reverseOrder()), Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));

        Map.Entry<Long, List<String>> item = resultMap.entrySet().stream().findFirst().get();

        if(item.getValue().size() > 1) {
            System.out.println("?");
        } else {
            System.out.println(item.getValue().get(0));
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
