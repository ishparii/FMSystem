package model.facilityMaintenance;

import java.util.Date;

public interface ISchedule {
	public int getScheduleID();
	public void setScheduleID(int scheduleID);
	public Date getDateScheduled();
	public void setDateScheduled(Date dateScheduled);
	public IService getService();
	public void setService(IService service);
}
