import Inorganic.Time;

/**
 * Created by student5 on 3/16/17.
 */
public class DevRunner {
    public  static void main(String args[]){
        Time t = new Time();
        t.incrementTimeByMinute(999999999);
        System.out.println(t.toStringDate());
        System.out.println(t.toStringFull());
        System.out.println(t.toStringTime());
    }
}
