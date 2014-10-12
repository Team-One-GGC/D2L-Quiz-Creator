package t1.dqc.xml.quiz.options;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.sun.xml.internal.bind.XmlAccessorFactory;


public abstract class Date
{
	@XmlRootElement(name="timestamp")
	@XmlType(propOrder={"month", "day", "year", "hour", "minutes", "seconds"})
	private abstract class Timestamp
	{
		private int month;
		private int day;
		private int year;
		private int hour;
		private int minutes;
		private int seconds;
		
		@XmlElement(name="d2l_2p0:month")
		public int getMonth()
		{
			return month;
		}
		public void setMonth(int month)
		{
			this.month = month;
		}
		
		@XmlElement(name="d2l_2p0:day")
		public int getDay()
		{
			return day;
		}
		public void setDay(int day)
		{
			this.day = day;
		}
		
		@XmlElement(name="d2l_2p0:year")
		public int getYear()
		{
			return year;
		}
		public void setYear(int year)
		{
			this.year = year;
		}
		
		@XmlElement(name="d2l_2p0:hour")
		public int getHour()
		{
			return hour;
		}
		public void setHour(int hour)
		{
			this.hour = hour;
		}
		//name="minutes", namespace="http://desire2learn.com/xsd/d2lcp_v2p0"
		@XmlElement(name="d2l_2p0:minutes")
		public int getMinutes()
		{
			return minutes;
		}
		public void setMinutes(int minutes)
		{
			this.minutes = minutes;
		}
		
		@XmlElement(name="d2l_2p0:seconds")
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
