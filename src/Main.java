import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        var quote1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from site 1");
            LongTask.Simulate();
            return 108;
        });
        var quote2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from site 2");
            LongTask.Simulate();
            return 109;
        });
        var quote3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from site 3");
            LongTask.Simulate();
            return 105;
        });


    }
}