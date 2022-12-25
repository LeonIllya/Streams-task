package firstTask;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamFilterName {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Liam", "Jacob",
                "Noah", "Mason", "Michael", "Jonny");

        AtomicInteger count = new AtomicInteger(0);

        stream.filter(str -> str.startsWith("J"))
                .forEach(str ->
                System.out.println(count.incrementAndGet() + ". " + str)
        );
    }
}
