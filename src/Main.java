public class Main {
    public static void main(String[] args) {
        var mail = new MailService();
        mail.sendAsync();
        System.out.println("hello world");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}