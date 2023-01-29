import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send(){
        LongTask.Simulate();
        System.out.println("email was sent");
    }

    public CompletableFuture<Void> sendAsync (){
        return CompletableFuture.runAsync(() -> send());
    }
}
