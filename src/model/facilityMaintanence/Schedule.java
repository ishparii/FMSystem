package model.facilityMaintanence;

import java.util.Date;

public class Schedule {
	private int scheduleID;
    private Date dateScheduled;
    private Service service;
	public int getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}
	public Date getDateScheduled() {
		return dateScheduled;
	}
	public void setDateScheduled(Date dateScheduled) {
		this.dateScheduled = dateScheduled;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
    

}
