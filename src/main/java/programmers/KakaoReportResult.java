package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class KakaoReportResult {
    public static void main(String[] args) {
//        String[] idList = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
//        int k = 2;
//        log.info(Arrays.toString(solution(idList, report, k)));

        String[] idList = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        log.info(Arrays.toString(solution(idList, report, k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> reportHashSet = new HashSet<>();
        Collections.addAll(reportHashSet, report);

        HashMap<String, ArrayList<String>> reportedHashMap = new HashMap<>();
        for (String r : reportHashSet) {
            String[] reportInfo = r.split(" ");
            ArrayList<String> reporterList = reportedHashMap.getOrDefault(reportInfo[1], null);
            if (reporterList == null) {
                reporterList = new ArrayList<>();
            }
            reporterList.add(reportInfo[0]);
            reportedHashMap.put(reportInfo[1], reporterList);
        }

        HashMap<String, Integer> reportedResultMap = new HashMap<>();
        for (ArrayList<String> arrList : reportedHashMap.values()) {
            if (arrList.size() >= k) {
                for (String a : arrList) {
                    reportedResultMap.put(a, reportedResultMap.getOrDefault(a, 0) + 1);
                }
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reportedResultMap.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}
