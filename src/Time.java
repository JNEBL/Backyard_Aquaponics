import java.text.DecimalFormat;

/**
 * Created by student5 on 3/15/17.
 */
public class Time {
    DecimalFormat format = new DecimalFormat("00");
    private int hour,minute,second;
    public Time(){
        setHour(12);
        setMinute(0);
        setSecond(0);
    }
    public Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public Time(Time x){
        setHour(x.getHour());
        setMinute(x.getMinute());
        setSecond(x.getSecond());
    }

    public void incrementTime(){
        second++;
        if (second >= 60){
            setSecond(0);
            minute++;
            if (minute >= 60){
                setMinute(0);
                hour++;
                if (hour > 12)
                    setHour(1);
            }
        }
    }

    public void incrementTime(int sec){
        for (int x = 0;x<sec;x++){
            second++;
            if (second >= 60){
                setSecond(0);
                minute++;
                if (minute >= 60){
                    setMinute(0);
                    hour++;
                    if (hour > 12)
                        setHour(1);
                }
            }
        }
    }

    public int getHour(){
        return this.hour;
    }
    public void setHour(int x){
        if (x > 0 && x <= 12)
            this.hour = x;
    }

    public int getMinute(){
        return this.minute;
    }
    public void setMinute(int x){
        if (x >= 0 && x < 60)
            this.minute = x;
    }

    public int getSecond(){
        return this.second;
    }
    public void setSecond(int x){
        if (x >= 0 && x < 60)
            this.second = x;
    }
    public String toString(){
        String time = format.format(hour) + ":" + format.format(minute) + ":" + format.format(second);
        return time;
    }
}
