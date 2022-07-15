package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Printer {
    public static void main(String[] args) {
        log.info(solution(new int[]{2, 1, 3, 2}, 2) + "");
        log.info(solution(new int[]{1, 1, 9, 1, 1, 1}, 0) + "");

        log.info(queueSolution(new int[]{2, 1, 3, 2}, 2) + "");
        log.info(queueSolution(new int[]{1, 1, 9, 1, 1, 1}, 0) + "");
    }

    // Queue : 순서대로 처리
    public static int solution(int[] priorities, int location) {
        List<PrinterJob> jobList = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            jobList.add(new PrinterJob(priorities[i], i));
        }

        int answer = 0;
        while (!jobList.isEmpty()) {
            PrinterJob job = jobList.remove(0);
            if (jobList.stream().anyMatch(j -> j.priority > job.priority)) {
                jobList.add(job);
            } else {
                answer++;
                if (location == job.index) {
                    break;
                }
            }
        }
        return answer;
    }

    static class PrinterJob {
        int priority;
        int index;

        public PrinterJob(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

    // only queue

    public static int queueSolution(int[] priorities, int location) {
        List<Integer> list = new ArrayList<>();
        for (int priority : priorities) {
            list.add(priority);
        }

        int answer = 0;
        while (!list.isEmpty()) {
            Integer num = list.remove(0);
            if (list.stream().anyMatch(n -> n > num)) {
                list.add(num);
            } else {
                answer++;
                if (location == 0) {
                    break;
                }
            }

            location--;
            if (location < 0) {
                location = list.size() - 1;
            }
        }
        return answer;
    }
}
