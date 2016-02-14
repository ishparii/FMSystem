package facilityUse;

import constantValue.UsageType;

public class Usage {
    private int usageID;
    private UsageType usageType;
    private String startDate;
    private String endDate;

    public int getUserID() {
        return usageID;
    }

    public UsageType getUsageType() {
        return usageType;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
