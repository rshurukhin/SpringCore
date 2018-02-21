import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {
    private int id = new Random().nextInt(1000000);
    private String msg;
    private Date date;
    private DateFormat df;

    public Event(Date date, DateFormat df){
        this.date = date;
        this.df = df;
    }

    @Override
    public String toString() {
        return "id: " + id + " message: " + msg + " date: " + df.format(date);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
