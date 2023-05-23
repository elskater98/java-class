package utils;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Utils {

    public void getCurrentDay() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
