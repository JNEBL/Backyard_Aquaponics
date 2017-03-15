import java.text.DecimalFormat;

/**
 * Created by student5 on 3/15/17.
 */
public class Time {
    DecimalFormat format = new DecimalFormat("00");
    private int year,month,day,hour,minute,second;
    public Time(){
        setYear(1);
        setMonth(1);
        setDay(1);
        setHour(12);
        setMinute(0);
        setSecond(0);
    }
    public Time(int year,int month,int day,int hour, int minute, int second){
        setYear(year);
        setMonth(month);
        setDay(day);
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public Time(Time x){
        setYear(x.getYear());
        setMonth(x.getMonth());
        setDay(x.getDay());
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
                if (hour > 12) {
                    setHour(1);
                    day++;
                    if (day > 28){
                        setDay(1);
                        month++;
                        if (month > 13){
                            setMonth(1);
                            year++;
                        }
                    }
                }
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
                    if (hour > 12) {
                        setHour(1);
                        day++;
                        if (day > 28){
                            setDay(1);
                            month++;
                            if (month > 13){
                                setMonth(1);
                                year++;
                            }
                        }
                    }
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

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if (day>0&&day<=28)
            this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if (month>0&&month<=13)
            this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year>0)
            this.year = year;
    }

    public String toString(){
        String time = format.format(hour) + ":" + format.format(minute) + ":" + format.format(second);
        return time;
    }
}
