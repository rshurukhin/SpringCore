import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    Client client;
    EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger){
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
        App app = (App) ctx.getBean("app");
        Event ev = (Event) ctx.getBean("event");
        ev.setMsg("User 1 is our first user");
        app.logEvent(ev);
        ctx.close();
    }

    private void logEvent(Event ev){
        eventLogger.logEvent(ev);
    }
}
