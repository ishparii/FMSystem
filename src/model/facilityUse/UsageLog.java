package model.facilityUse;

import model.facility.*;

public class UsageLog {
    private Usage usage;
    private Facility facility;

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

	public Usage getUsage() {
		return usage;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}
}
