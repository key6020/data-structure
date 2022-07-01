package programmers;

import java.util.ArrayList;
import java.util.List;

public class NoNumbers {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }

    public static int solution(int[] numbers) {
        int answer;
        List<Integer> series = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        series.add(1);
        series.add(2);
        series.add(3);
        series.add(4);
        series.add(5);
        series.add(6);
        series.add(7);
        series.add(8);
        series.add(9);

        for (int number : numbers) {
            if (series.contains(number)) {
                temp.add(number);
            }
        }

        series.removeAll(temp);
        answer = series.stream().mapToInt(s -> s).sum();
        return answer;
    }
}
