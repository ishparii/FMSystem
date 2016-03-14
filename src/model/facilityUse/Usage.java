package model.facilityUse;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "USAGE")
public class Usage {
    @Id
    @Column(name = "USAGE_ID", unique = true, nullable = false)
    private int usageID;
    @Column(name = "USAGETYPE")
    private String usageType;
    @Column(name = "STARTDATE")
    private Date startDate;
    @Column(name = "ENDDATE")
    private Date endDate;
    
    // TODO FK
    private User user;
    
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
