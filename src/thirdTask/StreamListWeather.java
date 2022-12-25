package thirdTask;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamListWeather {

    public static void main(String[] args) {

        Map<String, Integer> days = new HashMap<>();
        days.put("Sunday01", 10);
        days.put("Monday01", 8);
        days.put("Tuesday01", 4);
        days.put("Wednesday01", 12);
        days.put("Thursday01", 0);
        days.put("Friday01", -4);
        days.put("Saturday01", -3);

        days.put("Sunday02", -6);
        days.put("Monday02", -7);
        days.put("Tuesday02", - 8);
        days.put("Wednesday02", -4);
        days.put("Thursday02", -1);
        days.put("Friday02", 0);
        days.put("Saturday02", 15);

        AtomicInteger count = new AtomicInteger(0);

        days.entrySet()
                .stream()
                .filter(d ->d.getValue() >= 10)
                .filter(d -> d.getValue() <= 18)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((key, value) -> System.out.println(count.incrementAndGet() + ". " + key + " => " + value));
    }
}
