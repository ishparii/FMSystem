package model.facilityUse;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "Usage")
public class Usage implements IUsage {
	private int usageID;
	private String usageType;
	private Date startDate;
	private Date endDate;
	private IUser user;


	public int getUsageID() {
		return usageID;
	}

	public void setUsageID(int usageID) {
		this.usageID = usageID;
	}

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public IUser getUser() {
		return user;
	}

	public void setUser(IUser user) {
		this.user = user;
	}
}
