import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private EventLogger cel;

    public App() {
    }

    public App(Client client, EventLogger cel) {
        this.client = client;
        this.cel = cel;
    }

    private void logEvent(Event event, String msg) {
        String messeg = msg.replaceAll(client.getId(), client.getFullName());
        event.setMsg(messeg);
        cel.logEvent(event);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        Event event = ctx.getBean(Event.class);
        app.logEvent(event, "Some event for user 1");

        event = ctx.getBean(Event.class);
        app.logEvent(event, "Some event for user 2");

        ctx.close();
    }
}
