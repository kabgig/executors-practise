import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        var future = CompletableFuture.supplyAsync(() -> 1);
        future.thenAcceptAsync((result) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}