package secondTask;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamFilterProduct {

    public static void main(String[] args) {

        Map<String, Integer> product = new HashMap<>();
        product.put("Onion", 100);
        product.put("Cucumber", 200);
        product.put("Cherry", 210);
        product.put("Orange",400);
        product.put("Tomato", 440);

        AtomicInteger count = new AtomicInteger(0);

        product.entrySet()
                .stream()
                .filter(p -> p.getValue() <= 300)
                .filter(map -> map.getKey().startsWith("C"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((key, value) -> System.out.println(count.incrementAndGet() + ".  "+ key + " => " + value));
    }
}
