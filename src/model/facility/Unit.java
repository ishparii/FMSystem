package model.facility;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import model.constantValue.UsageType;

public class Unit extends Facility {
	public Unit() {
		super();
	}

	private int unitNumber;
	private String usageType;


	@Override
	public Map<String, String> getFacilityInfo() {
		Map<String, String> info = new HashMap<String, String>();
		info.put("id", Integer.toString(this.getFacilityID()));
		info.put("name", this.getName());
		info.put("address", this.getAddress().toString());
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		info.put("constractionDate", df.format(this.getConstructionDate()));
		info.put("owner", this.getOwner());
		info.put("manager", this.getManager().getfName() + " " + this.getManager().getlName());
		info.put("unit", Integer.toString(this.getUnitNumber()));
		info.put("type", this.getUsageType());		
		
		for (Map.Entry<String, String> entry : info.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		return info;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

}
