import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {
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

        try {
            System.out.println(quote1.get());
            System.out.println(quote2.get());
            System.out.println(quote3.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}