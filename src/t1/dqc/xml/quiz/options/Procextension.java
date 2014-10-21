package t1.dqc.xml.quiz.options;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.XmlNS;
import t1.dqc.xml.quiz.Assessment;

/**
 * The class representation of the <assess_procextension> Xml tag.
 * This tag is found within the <assessment> tag, see {@link Assessment}
 * @author Derek
 *
 */
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
    private String enforceTimeLimit;
    private String gracePeriod;
    private int lateLimit = 0;
    private int lateLimitData = 0;
    private int attemptsAllowed = 1;
    private String attemptRestrictions;
    private int markCalculationType = 1;
    private String isForwardOnly = "no";
    
    public Procextension(){}

    @XmlElement(name = "intro_message", namespace = XmlNS.D2L_NS)
    public IntroMessage getMessage()
    {
        return message;
    }

    public void setMessage(IntroMessage message)
    {
        this.message = message;
    }

    @XmlElement(name = "disable_right_click", namespace = XmlNS.D2L_NS)
    public String getDisableRightClick()
    {
        return disableRightClick;
    }

    public void setDisableRightClick(String disableRightClick)
    {
        this.disableRightClick = disableRightClick;
    }

    @XmlElement(name = "disable_pager_access", namespace = XmlNS.D2L_NS)
    public String getDisablePagerAccess()
    {
        return disablePagerAccess;
    }

    public void setDisablePagerAccess(String disablePagerAccess)
    {
        this.disablePagerAccess = disablePagerAccess;
    }

    @XmlElement(name = "is_active", namespace = XmlNS.D2L_NS)
    public String getIsActive()
    {
        return isActive;
    }

    public void setIsActive(String isActive)
    {
        this.isActive = isActive;
    }

    //Date stuff goes here
    
    @XmlElement(name = "has_schedule_even", namespace = XmlNS.D2L_NS)
    public String getHasSceduleEvent()
    {
        return hasSceduleEvent;
    }

    public void setHasSceduleEvent(String hasSceduleEvent)
    {
        this.hasSceduleEvent = hasSceduleEvent;
    }

    @XmlElement(name = "password", namespace = XmlNS.D2L_NS)
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @XmlElement(name = "is_attempt_Rldb", namespace = XmlNS.D2L_NS)
    public String getIsAttemptRldb()
    {
        return isAttemptRldb;
    }

    public void setIsAttemptRldb(String isAttemptRldb)
    {
        this.isAttemptRldb = isAttemptRldb;
    }

    @XmlElement(name = "is_subview_Rldb", namespace = XmlNS.D2L_NS)
    public String getIsSubviewRldb()
    {
        return isSubviewRldb;
    }

    public void setIsSubviewRldb(String isSubviewRldb)
    {
        this.isSubviewRldb = isSubviewRldb;
    }

    @XmlElement(name = "time_limit", namespace = XmlNS.D2L_NS)
    public int getTimeLimit()
    {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit)
    {
        this.timeLimit = timeLimit;
    }

    @XmlElement(name = "show_clock", namespace = XmlNS.D2L_NS)
    public String getShowClock()
    {
        return showClock;
    }

    public void setShowClock(String showClock)
    {
        this.showClock = showClock;
    }
    
    @XmlElement(name = "enforce_time_limit", namespace = XmlNS.D2L_NS)
    public String getEnforceTimeLimit()
    {
        return enforceTimeLimit;
    }

    public void setEnforceTimeLimit(String enforceTimeLimit)
    {
        this.enforceTimeLimit = enforceTimeLimit;
    }

    @XmlElement(name = "grace-period", namespace = XmlNS.D2L_NS)
    public String getGracePeriod()
    {
        return gracePeriod;
    }

    public void setGracePeriod(String gracePeriod)
    {
        this.gracePeriod = gracePeriod;
    }

    @XmlElement(name = "late_limit", namespace = XmlNS.D2L_NS)
    public int getLateLimit()
    {
        return lateLimit;
    }

    public void setLateLimit(int lateLimit)
    {
        this.lateLimit = lateLimit;
    }

    @XmlElement(name = "late_limit_data", namespace = XmlNS.D2L_NS)
    public int getLateLimitData()
    {
        return lateLimitData;
    }

    public void setLateLimitData(int lateLimitData)
    {
        this.lateLimitData = lateLimitData;
    }

    @XmlElement(name = "attempts_allowed", namespace = XmlNS.D2L_NS)
    public int getAttemptsAllowed()
    {
        return attemptsAllowed;
    }

    public void setAttemptsAllowed(int attemptsAllowed)
    {
        this.attemptsAllowed = attemptsAllowed;
    }

    @XmlElement(name = "attempt_restrictions", namespace = XmlNS.D2L_NS)
    public String getAttemptRestrictions()
    {
        return attemptRestrictions;
    }

    public void setAttemptRestrictions(String attemptRestrictions)
    {
        this.attemptRestrictions = attemptRestrictions;
    }

    @XmlElement(name = "mark_calculation_type", namespace = XmlNS.D2L_NS)
    public int getMarkCalculationType()
    {
        return markCalculationType;
    }

    public void setMarkCalculationType(int markCalculationType)
    {
        this.markCalculationType = markCalculationType;
    }

    @XmlElement(name = "is_forward_only", namespace = XmlNS.D2L_NS)
    public String getIsForwardOnly()
    {
        return isForwardOnly;
    }

    public void setIsForwardOnly(String isForwardOnly)
    {
        this.isForwardOnly = isForwardOnly;
    }
}
