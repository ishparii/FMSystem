package model.facilityUse;

import java.util.Date;

public interface IUsage {
	public int getUsageID();
	public void setUsageID(int usageID);
	public String getUsageType();
	public void setUsageType(String usageType);
	public Date getStartDate();
	public void setStartDate(Date startDate);
	public Date getEndDate();
	public void setEndDate(Date endDate);
	public IUser getUser();
	public void setUser(IUser user);
}
