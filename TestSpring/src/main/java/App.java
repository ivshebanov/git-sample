import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private ConsoleEventLogger cel;

    public App() {
    }

    public App(Client client, ConsoleEventLogger cel) {
        this.client = client;
        this.cel = cel;
    }

    private void logEvent(String msg) {
        String messeg = msg.replaceAll(client.getId(), client.getFullName());
        cel.logEvent(messeg);
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");
        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");
    }
}
