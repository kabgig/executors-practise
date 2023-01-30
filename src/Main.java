import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static void main(String[] args) {
        var future = CompletableFuture.supplyAsync(() -> 20);
        future.thenApply(Main::toFahrenheit)
                .thenAccept(System.out::println);
    }
}