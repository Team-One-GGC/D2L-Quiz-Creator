package t1.dqc.xml.quiz.options;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "assess_procextension")
public class Procextension
{
    private IntroMessage message;
    private String disableRightClick = "no";
    private String disablePagerAccess = "no";
    private String isActive;
    //Start Date goes here
    //End Date goes here    
    private String hasSceduleEvent = "no";
    private String password;
    private String isAttemptRldb = "no";
    private String isSubviewRldb = "no";
    private int timeLimit;
    private String showClock;
    private String gracePeriod;
    private int lateLimit = 0;
    private int lateLimitData = 0;
}
