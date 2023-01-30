public class LongTask {
    public static void Simulate(){
        try {
            Thread.sleep(1473);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
