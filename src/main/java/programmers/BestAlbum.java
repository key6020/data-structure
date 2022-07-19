package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;


@Slf4j
public class BestAlbum {
    public static void main(String[] args) {
//        log.info(Arrays.toString(solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})));
        log.info(Arrays.toString(solution(new String[]{"classic", "pop", "classic", "classic", "pop", "pop", "kpop", "kpop"}, new int[]{500, 600, 800, 1800, 250, 100, 100, 100})));
//        log.info(Arrays.toString(solution(new String[]{"classic", "pop", "classic", "classic"}, new int[]{500, 600, 150, 800})));
    }

    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<AlbumInfo>> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            AlbumInfo albumInfo = new AlbumInfo(plays[i], i);
            map.putIfAbsent(genres[i], new ArrayList<>());
            map.get(genre).add(albumInfo);
        }

        for (String k : map.keySet()) {
            map.get(k).sort(Comparator.comparing(AlbumInfo::getPlayCount).reversed().thenComparing(AlbumInfo::getIndex));
            // map을 total playCount로 내림차순 정렬
        }

        ArrayList<String> genreList = new ArrayList<>(map.keySet());
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < genreList.size(); i++) {
            String genre = genreList.get(i);
            ArrayList<AlbumInfo> albumInfoList = map.get(genre);

            if (albumInfoList.size() > 2) {
                for (int l = albumInfoList.size() - 1; l > 1; l--) {
                    albumInfoList.remove(l);
                }
            }

            for (int a = 0; a < albumInfoList.size(); a++) {
                answerList.add(albumInfoList.get(a).index);
            }
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }

    static class AlbumInfo {
        int playCount;
        int index;

        public int getPlayCount() {
            return playCount;
        }

        public int getIndex() {
            return index;
        }

        public AlbumInfo(int playCount, int index) {
            this.playCount = playCount;
            this.index = index;
        }
    }
}
