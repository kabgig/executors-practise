import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(3);
            var blablabla = executor.submit(() -> {
                        LongTask.Simulate();
                        return 1;
                    });
        System.out.println("Do more work");
        try {
            var res = blablabla.get();
            System.out.println(res);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}