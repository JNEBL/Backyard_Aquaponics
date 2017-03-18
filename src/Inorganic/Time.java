package Inorganic;

import java.text.DecimalFormat;

/**
 * Created by student5 on 3/15/17.
 */
public class Time {
    DecimalFormat format = new DecimalFormat("00");
    DecimalFormat f = new DecimalFormat("0000");
    private Time time;
    private int year,month,day,hour,minute,second;
    public Time(){
        setYear(0);
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

    private void incrementTime(){
        second++;
        if (second >= 60){
            setSecond(0);
            minute++;
            if (minute >= 60){
                setMinute(0);
                hour++;
                if (hour > 24) {
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
            incrementTime();
        }
    }
    public void incrementTimeByMinute(int min){
        int sec = 60 * min;
        incrementTime(sec);
    }
    public void incrementTimeByHalfAnHour(int halfHour){
        int min = 30 * halfHour;
        incrementTimeByMinute(min);
    }
    public void incrementTimeByHour(int H){
        int min = 60 * H;
        incrementTimeByMinute(min);
    }
    public void incrementTimeByDay(int D){
        int H = 24 * D;
        incrementTimeByHour(H);
    }
    public void incrementTimeByWeek(int week){
        int D = 7 * week;
        incrementTimeByDay(D);
    }
    public void incrementTimeByMonth(int M){
        int D = 28 * M;
        incrementTimeByDay(D);
    }
    public void incrementTimeByYear(int Y){
        int M = 13 * Y;
        incrementTimeByMonth(M);
    }

    public int getHour(){
        return this.hour;
    }
    public void setHour(int x){
        if (x > 24){
            setIncrementDay(1);
            setHour(x - 24);
        }
        if (x > 0 && x <= 24)
            this.hour = x;
    }
    public void setIncrementHour(int x){
        if (x > 24){
            setIncrementDay(1);
            setIncrementHour(x - 24);
        }
        if (x > 0 && x <= 24)
            this.hour += x;
    }

    public int getMinute(){
        return this.minute;
    }
    public void setMinute(int x){
        if (x >= 60){
            setIncrementHour(1);
            setMinute(x - 60);
        }
        if (x >= 0 && x < 60)
            this.minute = x;
    }
    public void setIncrementMinute(int x){
        if (x >= 60){
            setIncrementHour(1);
            setIncrementMinute(x - 60);
        }
        if (x >= 0 && x < 60)
            this.minute += x;
    }

    public int getSecond(){
        return this.second;
    }
    public void setSecond(int x){
        if (x >= 60){
            setIncrementMinute(1);
            setSecond(x - 60);
        }
        if (x >= 0 && x < 60)
            this.second = x;
    }
    public void setIncrementSecond(int x){
        if (x >= 60){
            setIncrementMinute(1);
            setIncrementSecond(x - 60);
        }
        if (x >= 0 && x < 60)
            this.second += x;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if (day>=28) {
            setIncrementMonth(1);
            setDay(day - 28);
        }
        if (day>0&&day<=28)
            this.day = day;
    }
    public void setIncrementDay(int day){
        if (day > 28){
            setIncrementMonth(1);
            setIncrementDay(day - 28);
        }
        if (day>0&&day<=28)
            this.day += day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if (month > 13){
            setIncrementYear(1);
            setMonth(month - 13);
        }
        if (month>0&&month<=13)
            this.month = month;
    }
    public void setIncrementMonth(int month){
        if (month > 13){
            setIncrementYear(1);
            setIncrementMonth(month - 13);
        }
        if (month > 0 && month <= 13)
            this.month+=month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year>=0)
            this.year = year;
    }
    public void setIncrementYear(int year) {
        if (year > 0)
            this.year+=year;
    }

    public void setAllTime(int year,int month,int day,int hour, int minute, int second){
        setYear(year);
        setMonth(month);
        setDay(day);
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Time getCurrentTime(){
        time = new Time(getYear(),getMonth(),getDay(),getHour(),getMinute(),getSecond());
        return time;
    }

    public String toStringFull(){
        String date = "Date  "+format.format(day) +"."+format.format(month)+"."+f.format(year)+"    ";
        String time = date+"Time ("+format.format(hour) + ":" + format.format(minute) + ":" + format.format(second)+")";
        return time;
    }
    public String toStringDate(){
        String date = "Date  "+format.format(day) +"."+format.format(month)+"."+f.format(year);
        return date;
    }
    public String toStringTime(){
        String time = "Time ("+format.format(hour) + ":" + format.format(minute) + ":" + format.format(second)+")";
        return time;
    }
}
