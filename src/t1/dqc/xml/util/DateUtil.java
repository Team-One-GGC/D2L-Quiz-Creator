package t1.dqc.xml.util;

import java.time.LocalDate;

import t1.dqc.xml.quiz.options.Date.Timestamp;

public class DateUtil
{
    private Timestamp timeStamp;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int min;
    
    public DateUtil(Timestamp timeStamp) throws NullPointerException
    {
        if(timeStamp == null) throw new NullPointerException("Timestamp cannot be null");
        this.timeStamp = timeStamp;
        convertTimestamp();
    }
    
    private void convertTimestamp()
    {
        this.year = timeStamp.getYear();
        this.month = timeStamp.getMonth();
        this.day = timeStamp.getDay();
        this.hour = timeStamp.getHour();
        this.min = timeStamp.getMinutes();
    }
    
    public LocalDate getDate()
    {
        return LocalDate.of(year, month, day);
    }

    public int getHour()
    {
        return hour;
    }

    public int getMin()
    {
        return min;
    }
}
