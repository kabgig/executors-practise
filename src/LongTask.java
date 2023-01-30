public class LongTask {

    public static int Simulate(){
        int time = (int)(Math.random()*1000 + 1000);
        try {
            Thread.sleep(time); // sleep between 1s & 2s
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return time;
    }
}
