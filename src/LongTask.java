public class LongTask {
    public static void Simulate(int time) {
        try {
            Thread.sleep(time); // sleep between 1s & 2s
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
