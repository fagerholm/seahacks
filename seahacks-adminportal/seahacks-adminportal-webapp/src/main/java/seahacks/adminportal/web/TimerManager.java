package seahacks.adminportal.web;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import seahacks.adminportal.ejb.TimerSessionBean;

@ManagedBean
@SessionScoped
public class TimerManager {

    @EJB
    private TimerSessionBean timerSession;

    private String lastProgrammaticTimeout;
    private String lastAutomaticTimeout;

    /** Creates a new instance of TimerManager */
    public TimerManager() {
        this.lastProgrammaticTimeout = "never";
        this.lastAutomaticTimeout = "never";
    }

    /**
     * @return the lastTimeout
     */
    public String getLastProgrammaticTimeout() {
        lastProgrammaticTimeout = timerSession.getLastProgrammaticTimeout();
        return lastProgrammaticTimeout;
    }

    /**
     * @param lastTimeout the lastTimeout to set
     */
    public void setLastProgrammaticTimeout(String lastTimeout) {
        this.lastProgrammaticTimeout = lastTimeout;
    }

    public void setTimer() {
        long timeoutDuration = 8000;
        timerSession.setTimer(timeoutDuration);
    }

    /**
     * @return the lastAutomaticTimeout
     */
    public String getLastAutomaticTimeout() {
        lastAutomaticTimeout = timerSession.getLastAutomaticTimeout();
        return lastAutomaticTimeout;
    }

    /**
     * @param lastAutomaticTimeout the lastAutomaticTimeout to set
     */
    public void setLastAutomaticTimeout(String lastAutomaticTimeout) {
        this.lastAutomaticTimeout = lastAutomaticTimeout;
    }

}
