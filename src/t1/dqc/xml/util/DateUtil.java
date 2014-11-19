package t1.dqc.xml.util;
/**
 * This class is used for converting start and end dates
 * into usable text inside the GUI.
 */

import java.text.DecimalFormat;
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
    private String timeOfDay;
    
    public DateUtil(Timestamp timeStamp) throws NullPointerException
    {
        if(timeStamp == null) throw new NullPointerException("Timestamp cannot be null");
        this.timeStamp = timeStamp;
        convertTimestamp();
        convert12Hour();
    }
    
    private void convertTimestamp()
    {
        this.year = timeStamp.getYear();
        this.month = timeStamp.getMonth();
        this.day = timeStamp.getDay();
        this.hour = timeStamp.getHour();
        this.min = timeStamp.getMinutes();
    }
    
    private void convert12Hour()
    {
        if(hour > 12)
        {
            timeOfDay = "PM";
            hour -= 12;
        }
        else if(hour == 12)
            timeOfDay = "PM";
        else
            timeOfDay = "AM";
    }
    
    public LocalDate getDate()
    {
        return LocalDate.of(year, month, day);
    }

    public String getHour()
    {
        return Integer.toString(hour);
    }

    public String getMin()
    {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        return decimalFormat.format(min);
    }
    
    public String getTimeOfDay()
    {
        return timeOfDay;
    }
}
