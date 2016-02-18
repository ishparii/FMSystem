package model.facilityMaintenance;

import java.util.Date;

public class Schedule {
	private int scheduleID;
    private Date dateScheduled;
    private Service service;
    
    public int getScheduleID() {
    	return scheduleID;
    }
    
    public Date getDateScheduled() {
        return dateScheduled;
    }
}
