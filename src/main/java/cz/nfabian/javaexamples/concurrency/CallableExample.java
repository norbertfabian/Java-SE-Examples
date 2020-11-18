package cz.nfabian.javaexamples.concurrency;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CallableExample {

    private static AtomicInteger index = new AtomicInteger(0);

    public static void main(String[] args) {
        Callable<String> callable = () -> "Call number: " + index.incrementAndGet() + ", Thread name: " + Thread.currentThread().getName() + System.lineSeparator();

        List<Callable<String>> callables = Stream.generate(() -> callable).limit(10).collect(Collectors.toList());

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            List<Future<String>> results = executorService.invokeAll(callables);
            executorService.shutdown();

            results.forEach(result -> {
                try {
                    System.out.println(result.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
