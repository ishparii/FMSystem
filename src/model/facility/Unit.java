package model.facility;

import model.constantValue.UsageType;

public class Unit extends Facility {
	private int unitID;
	private int unitNumber;
	private UsageType usageType;


	@Override
	public Facility getFacilityInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFacilityDetail() {
		// TODO Auto-generated method stub

	}
	
	public int getUnitID() {
		return unitID;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public UsageType getUsageType() {
		return usageType;
	}

}
