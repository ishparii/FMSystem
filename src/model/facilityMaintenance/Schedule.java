package model.facilityMaintenance;

import java.util.Date;

public class Schedule implements ISchedule {
	private int scheduleID;
	private Date dateScheduled;
	private IService service;

	public Schedule(Date date) {
		setDateScheduled(date);
		setService(new Service());
	}

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

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}
}
