public class ConsoleEventLogger implements EventLogger{

    public ConsoleEventLogger(){

    }

    public void logEvent(Event event) {
        System.out.println(event.toString());
    }
}
