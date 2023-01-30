import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {
        int seconds;

        var quote1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from site 1");
            LongTask.Simulate(2407);
            return "Quote{site='site1', price=100}";
        });
        var quote2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from site 2");
            LongTask.Simulate(1302);
            return "Quote{site='site2', price=105}";
        });
        var quote3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from site 3");
            LongTask.Simulate(2000);
            return "Quote{site='site3', price=108}";
        });

            quote1.thenAcceptAsync(m ->
                    System.out.println(m)
            );

        quote2.thenAcceptAsync(m ->
                System.out.println(m)
        );
        quote3.thenAcceptAsync(m ->
                System.out.println(m)
        );

    }
}