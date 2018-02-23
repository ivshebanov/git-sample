/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

public class App {
    private Client client;
    private ConsoleEventLogger cel;

    private void logEvent(String msg){
        String messeg = msg.replaceAll(client.getId(), client.getFullName());
        cel.logEvent(messeg);
    }

    public static void main(String[] args) {
        App app = new App();

        app.client = new Client("1", "John Smith");
        app.cel = new ConsoleEventLogger();

        app.logEvent("Some event for user 1");
    }
}
