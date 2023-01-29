import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        var weather = CompletableFuture.supplyAsync(() ->{
                System.out.println("Getting current weather");
                throw new IllegalStateException();
        });
        try {
           var temperature =  weather.exceptionally(ex -> 1).get();
            System.out.println(temperature);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}