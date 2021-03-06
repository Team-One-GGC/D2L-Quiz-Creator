package t1.dqc.xml.quiz.options;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import t1.dqc.xml.XmlNS;

/**
 * This class defines the <timestamp> xml tag
 * found within the <assess_procextension> section.
 * @author Jason
 *
 */
public class Date
{
    private Timestamp timeStamp;
    
    @XmlElement(name = "timestamp" , namespace = XmlNS.D2L_NS)
    public Timestamp getTimeStamp()
    {
        return timeStamp;
    }
    
    public void setTimeStamp(Timestamp timeStamp)
    {
        this.timeStamp = timeStamp;
    }
    
	@XmlRootElement(name="timestamp", namespace = XmlNS.D2L_NS)
	@XmlType(propOrder={"month", "day", "year", "hour", "minutes", "seconds"})
	public static class Timestamp
	{
		private int month;
		private int day;
		private int year;
		private int hour;
		private int minutes;
		private int seconds = 0;
		
		@XmlElement(name="month", namespace=XmlNS.D2L_NS)
		public int getMonth()
		{
			return month;
		}
		public void setMonth(int month)
		{
			this.month = month;
		}
		
		@XmlElement(name="day", namespace=XmlNS.D2L_NS)
		public int getDay()
		{
			return day;
		}
		public void setDay(int day)
		{
			this.day = day;
		}
		
		@XmlElement(name="year", namespace=XmlNS.D2L_NS)
		public int getYear()
		{
			return year;
		}
		public void setYear(int year)
		{
			this.year = year;
		}
		
		@XmlElement(name="hour", namespace=XmlNS.D2L_NS)
		public int getHour()
		{
			return hour;
		}
		public void setHour(int hour)
		{
			this.hour = hour;
		}
		@XmlElement(name="minutes", namespace=XmlNS.D2L_NS)
		public int getMinutes()
		{
			return minutes;
		}
		public void setMinutes(int minutes)
		{
			this.minutes = minutes;
		}
		
		@XmlElement(name="seconds", namespace=XmlNS.D2L_NS)
		public int getSeconds()
		{
			return seconds;
		}
		public void setSeconds(int seconds)
		{
			this.seconds = seconds;
		}
	}
}
