package model.facilityUse;

import java.util.Arrays;
import java.util.List;

import model.facility.*;

public class UsageLog {
    private List<Usage> usages;
	
	public UsageLog(Usage ... usage) {
    	this.setUsages(Arrays.asList(usage));
    }

    public Object calcUsageRate() {
        // TODO
        return null;
    }

    public Object listActualUsage() {
        // TODO
        return null;
    }

    public Object vacateFacility(Facility facility) {
        // TODO
        return facility;
    }

    public Object assignFacilityToUse(Facility facility) {
        // TODO
        return facility;
    }

    public Object isInUseDuringInterval() {
        // TODO
        return null;
    }

	public List<Usage> getUsages() {
		return usages;
	}

	public void setUsages(List<Usage> usages) {
		this.usages = usages;
	}

}
