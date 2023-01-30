import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        var task1 = CompletableFuture.supplyAsync(() -> {
            LongTask.Simulate();
            return 20;
        });
        var task2 = CompletableFuture.supplyAsync(() -> {
            LongTask.Simulate();
            return 0.9;
        });
        var fastest = CompletableFuture.supplyAsync(() -> 0.3);

        CompletableFuture.anyOf(task1, task2, fastest)
                .thenAccept(System.out::println);

    }
}