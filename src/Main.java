import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        var task1 = CompletableFuture.supplyAsync(() -> 20);
        var task2 = CompletableFuture.supplyAsync(() -> 0.9);
        var task3 = CompletableFuture.supplyAsync(() -> 0.3);

        var all = CompletableFuture.allOf(task1,task2,task3);
        all.thenRun(() -> {
            try {
                System.out.println(task1.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
            System.out.println("All Done!");
        });


    }
}