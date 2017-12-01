package ilya;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread server = new Thread(new Server());
        server.start();
        Thread.sleep(500);
        Thread client = new Thread(new Client());
        client.start();
    }
}
