package model.facilityUse;

import java.util.Date;

import model.constantValue.UsageType;

public class Usage {
    private int usageID;
    private UsageType usageType;
    private Date startDate;
    private Date endDate;
    private User user;

    public int getUserID() {
        return usageID;
    }

    public UsageType getUsageType() {
        return usageType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
