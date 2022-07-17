package programmers;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Slf4j
public class Year2016 {
    public static void main(String[] args) {
        log.info(solution(5, 24));
    }

    public static String solution(int a, int b) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, a - 1, b);
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);
        return sdf.format(date).toUpperCase();
    }
}
