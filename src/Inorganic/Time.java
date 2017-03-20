package Inorganic;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by student5 on 3/15/17.
 */
public class Time {
    DecimalFormat format = new DecimalFormat("00");
    DecimalFormat f = new DecimalFormat("0000");
    public ArrayList<Event> eventsSecond = new ArrayList<>();
    public ArrayList<Event> eventsMinutes = new ArrayList<>();
    public ArrayList<Event> eventsHour = new ArrayList<>();
    public ArrayList<Event> eventsDay = new ArrayList<>();
    public ArrayList<Event> eventsMonth = new ArrayList<>();
    public ArrayList<Event> eventsYear = new ArrayList<>();
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
        if (eventsSecond.size() > 0)
            checkSecondEvents(getCurrentTime());
        if (second >= 60){
            setSecond(0);
            minute++;
            if (eventsMinutes.size() > 0)
                checkMinuteEvents(getCurrentTime());
            if (minute >= 60){
                setMinute(0);
                hour++;
                if (eventsHour.size() > 0)
                    checkHourEvents(getCurrentTime());
                if (hour > 24) {
                    setHour(1);
                    day++;
                    if (eventsDay.size() > 0)
                        checkDayEvents(getCurrentTime());
                    if (day > 28){
                        setDay(1);
                        month++;
                        if (eventsMonth.size() > 0)
                            checkMonthEvents(getCurrentTime());
                        if (month > 13){
                            setMonth(1);
                            year++;
                            if (eventsYear.size() > 0)
                                checkYearEvents(getCurrentTime());
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

    private void checkSecondEvents(Time currentTime){
        for (int x = 0;x < eventsSecond.size();x++){
            if (currentTime.getSecond() == eventsSecond.get(x).getTime().getSecond()){
                if (currentTime.getMinute() == eventsSecond.get(x).getTime().getMinute()){
                    if (currentTime.getHour() == eventsSecond.get(x).getTime().getHour()){
                        if (currentTime.getDay() == eventsSecond.get(x).getTime().getDay()){
                            if (currentTime.getMonth() == eventsSecond.get(x).getTime().getMonth()){
                                if (currentTime.getYear() == eventsSecond.get(x).getTime().getYear()){
                                    checkSecondEvents(eventsSecond.get(x).getTime(),x + 1);
                                    x+=eventsSecond.size();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    private void checkSecondEvents(Time currentTime,int x){
        if (currentTime.getSecond() == eventsSecond.get(x).getTime().getSecond()){
            if (currentTime.getMinute() == eventsSecond.get(x).getTime().getMinute()){
                if (currentTime.getHour() == eventsSecond.get(x).getTime().getHour()){
                    if (currentTime.getDay() == eventsSecond.get(x).getTime().getDay()){
                        if (currentTime.getMonth() == eventsSecond.get(x).getTime().getMonth()){
                            if (currentTime.getYear() == eventsSecond.get(x).getTime().getYear()){
                                checkSecondEvents(eventsSecond.get(x).getTime(),x + 1);
                            }
                        }
                    }
                }
            }
        }
    }

    private void checkMinuteEvents(Time currentTime){
        for (int x = 0;x < eventsMinutes.size();x++){
            if (currentTime.getMinute() == eventsMinutes.get(x).getTime().getMinute()){
                if (currentTime.getHour() == eventsMinutes.get(x).getTime().getHour()){
                    if (currentTime.getDay() == eventsMinutes.get(x).getTime().getDay()){
                        if (currentTime.getMonth() == eventsMinutes.get(x).getTime().getMonth()){
                            if (currentTime.getYear() == eventsMinutes.get(x).getTime().getYear()){
                                checkMinuteEvents(eventsMinutes.get(x).getTime(),x + 1);
                                x+=eventsMinutes.size();
                            }
                        }
                    }
                }
            }
        }
    }
    private void checkMinuteEvents(Time currentTime,int x){
        if (currentTime.getMinute() == eventsMinutes.get(x).getTime().getMinute()){
            if (currentTime.getHour() == eventsMinutes.get(x).getTime().getHour()){
                if (currentTime.getDay() == eventsMinutes.get(x).getTime().getDay()){
                    if (currentTime.getMonth() == eventsMinutes.get(x).getTime().getMonth()){
                        if (currentTime.getYear() == eventsMinutes.get(x).getTime().getYear()){
                            checkMinuteEvents(eventsMinutes.get(x).getTime(),x + 1);
                        }
                    }
                }
            }
        }
    }

    private void checkHourEvents(Time currentTime){
        for (int x = 0;x < eventsHour.size();x++){
            if (currentTime.getHour() == eventsHour.get(x).getTime().getHour()){
                if (currentTime.getDay() == eventsHour.get(x).getTime().getDay()){
                    if (currentTime.getMonth() == eventsHour.get(x).getTime().getMonth()){
                        if (currentTime.getYear() == eventsHour.get(x).getTime().getYear()){
                            checkHourEvents(eventsHour.get(x).getTime(),x + 1);
                            x+=eventsHour.size();
                        }
                    }
                }
            }
        }
    }
    private void checkHourEvents(Time currentTime,int x){
        if (currentTime.getHour() == eventsHour.get(x).getTime().getHour()){
            if (currentTime.getDay() == eventsHour.get(x).getTime().getDay()){
                if (currentTime.getMonth() == eventsHour.get(x).getTime().getMonth()){
                    if (currentTime.getYear() == eventsHour.get(x).getTime().getYear()){
                        checkHourEvents(eventsHour.get(x).getTime(),x + 1);
                    }
                }
            }
        }
    }

    private void checkDayEvents(Time currentTime){
        for (int x = 0;x < eventsDay.size();x++){
            if (currentTime.getDay() == eventsDay.get(x).getTime().getDay()){
                if (currentTime.getMonth() == eventsDay.get(x).getTime().getMonth()){
                    if (currentTime.getYear() == eventsDay.get(x).getTime().getYear()){
                        checkDayEvents(eventsDay.get(x).getTime(),x + 1);
                        x+=eventsDay.size();
                    }
                }
            }
        }
    }
    private void checkDayEvents(Time currentTime,int x){
        if (currentTime.getDay() == eventsDay.get(x).getTime().getDay()){
            if (currentTime.getMonth() == eventsDay.get(x).getTime().getMonth()){
                if (currentTime.getYear() == eventsDay.get(x).getTime().getYear()){
                    checkDayEvents(eventsDay.get(x).getTime(),x + 1);
                }
            }
        }

    }

    private void checkMonthEvents(Time currentTime){
        for (int x = 0;x < eventsMonth.size();x++){
            if (currentTime.getMonth() == eventsMonth.get(x).getTime().getMonth()){
                if (currentTime.getYear() == eventsMonth.get(x).getTime().getYear()){
                    checkMonthEvents(eventsMonth.get(x).getTime(),x + 1);
                    x+=eventsMonth.size();
                }
            }
        }
    }
    private void checkMonthEvents(Time currentTime,int x){
        if (currentTime.getMonth() == eventsMonth.get(x).getTime().getMonth()){
            if (currentTime.getYear() == eventsMonth.get(x).getTime().getYear()){
                checkMonthEvents(eventsMonth.get(x).getTime(),x + 1);
            }
        }
    }

    private void checkYearEvents(Time currentTime){
        for (int x = 0;x < eventsYear.size();x++){
            if (currentTime.getYear() == eventsYear.get(x).getTime().getYear()){
                checkYearEvents(eventsYear.get(x).getTime(),x + 1);
                x+=eventsYear.size();
            }
        }
    }
    private void checkYearEvents(Time currentTime,int x){
        if (currentTime.getYear() == eventsYear.get(x).getTime().getYear()){
            checkYearEvents(eventsYear.get(x).getTime(),x + 1);
        }
    }

    public void addSecondEvents(Event event){
        boolean finder = true;
        for (int x = 0;x < eventsSecond.size();x++){
            if (event.getTime().getSecond() <= eventsSecond.get(x).getTime().getSecond()){
                if (event.getTime().getMinute() <= eventsSecond.get(x).getTime().getMinute()){
                    if (event.getTime().getHour() <= eventsSecond.get(x).getTime().getHour()){
                        if (event.getTime().getDay() <= eventsSecond.get(x).getTime().getDay()){
                            if (event.getTime().getMonth() <= eventsSecond.get(x).getTime().getMonth()){
                                if (event.getTime().getYear() <= eventsSecond.get(x).getTime().getYear()){
                                    eventsSecond.add(x,event);
                                    finder = false;
                                    x+=eventsSecond.size();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (finder)
            eventsSecond.add(event);
    }
    public void addMinuteEvents(Event event){
        boolean finder = true;
        for (int x = 0;x < eventsMinutes.size();x++){
            if (event.getTime().getMinute() <= eventsMinutes.get(x).getTime().getMinute()){
                if (event.getTime().getHour() <= eventsMinutes.get(x).getTime().getHour()){
                    if (event.getTime().getDay() <= eventsMinutes.get(x).getTime().getDay()){
                        if (event.getTime().getMonth() <= eventsMinutes.get(x).getTime().getMonth()){
                            if (event.getTime().getYear() <= eventsMinutes.get(x).getTime().getYear()){
                                eventsMinutes.add(x,event);
                                finder = false;
                                x+=eventsMinutes.size();
                            }
                        }
                    }
                }
            }
        }
        if (finder)
            eventsMinutes.add(event);
    }
    public void addHourEvents(Event event){
        boolean finder = true;
        for (int x = 0;x < eventsHour.size();x++){
            if (event.getTime().getHour() <= eventsHour.get(x).getTime().getHour()){
                if (event.getTime().getDay() <= eventsHour.get(x).getTime().getDay()){
                    if (event.getTime().getMonth() <= eventsHour.get(x).getTime().getMonth()){
                        if (event.getTime().getYear() <= eventsHour.get(x).getTime().getYear()){
                            eventsHour.add(x,event);
                            finder = false;
                            x+=eventsHour.size();
                        }
                    }
                }
            }
        }
        if (finder)
            eventsHour.add(event);
    }
    public void addDayEvents(Event event){
        boolean finder = true;
        for (int x = 0;x < eventsDay.size();x++){
            if (event.getTime().getDay() <= eventsDay.get(x).getTime().getDay()){
                if (event.getTime().getMonth() <= eventsDay.get(x).getTime().getMonth()){
                    if (event.getTime().getYear() <= eventsDay.get(x).getTime().getYear()){
                        eventsDay.add(x,event);
                        finder = false;
                        x+=eventsDay.size();
                    }
                }
            }
        }
        if (finder)
            eventsDay.add(event);
    }
    public void addMonthEvents(Event event){
        boolean finder = true;
        for (int x = 0;x < eventsMonth.size();x++){
            if (event.getTime().getMonth() <= eventsMonth.get(x).getTime().getMonth()){
                if (event.getTime().getYear() <= eventsMonth.get(x).getTime().getYear()){
                    eventsMonth.add(x,event);
                    finder = false;
                    x+=eventsMonth.size();
                }
            }
        }
        if (finder)
            eventsMonth.add(event);
    }
    public void addYearEvents(Event event){
        boolean finder = true;
        for (int x = 0;x < eventsYear.size();x++){
            if (event.getTime().getYear() <= eventsYear.get(x).getTime().getYear()){
                eventsYear.add(x,event);
                finder = false;
                x+=eventsYear.size();
            }
        }
        if (finder)
            eventsYear.add(event);
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
