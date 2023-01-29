import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {

        executor.submit(() -> System.out.println(Thread.currentThread().getName()));
        }
        executor.shutdown();
    }
}