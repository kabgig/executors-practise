import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        var task1 = CompletableFuture.supplyAsync(() -> 20);
        var task2 = CompletableFuture.supplyAsync(() -> 0.9);

        task1.thenCombine(task2, (price, exchangeRate) -> price * exchangeRate)
                .thenAccept(System.out::println);
    }
}