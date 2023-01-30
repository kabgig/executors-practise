import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        var task = CompletableFuture.supplyAsync(() -> {
            LongTask.Simulate();
            return 20;
        });

        Integer res = null;
        try {
            res = task.completeOnTimeout(7, 1, TimeUnit.MINUTES).get();
            System.out.println(res);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        try {
            var res2 = task.orTimeout(1, TimeUnit.SECONDS).get();
            System.out.println(res2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}