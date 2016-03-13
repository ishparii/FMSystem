package model.facility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.facilityUse.Usage;

public class Group extends Facility {

	private String facilityType;
	private ArrayList<Facility> facilities = new ArrayList<Facility>();

	@Override
	public Map<String, String> getFacilityInfo() {
		Map<String, String> info = new HashMap<String, String>();
		info.put("id", Integer.toString(this.getFacilityID()));
		info.put("name", this.getFacilityName());
		info.put("owner", this.getFacilityOwner());
		info.put("type", this.facilityType);
		info.put("manager", this.getManager().getfName() + " " + this.getManager().getlName());
		info.put("address", this.getAddress().toString());
		info.put("contains other facilities", Integer.toString(this.facilities.size()));

		
		for (Map.Entry<String, String> entry : info.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		return info;
	}

	public Facility addNewFacility(Facility facility) {
		facilities.add(facility);
		System.out.println("Facility with ID: " + facility.getFacilityID() + " was added.");
		return facility;
	}

	public void removeFacility(int id) {
		for (Facility r : facilities) {
			if (r.getFacilityID() == id) {
				facilities.remove(r);
				System.out.println("Facility with ID: " + id + " was removed from group " + getFacilityID());
				return;
			} else if (r instanceof Group) {
				((Group)r).removeFacility(id);
			}
		}
		System.out.println("Facility with ID: " + id + " was not found in the group " + getFacilityID());

	}

	// returns a list of rooms that are not currently in use
	public List<Facility> requestAvailFacility() {
		List<Facility> availableFacility = new ArrayList<>();
		for (Facility f : facilities) {
			Usage u = f.getUsageLog().getUsages().get(0);
			// available facility
			if (u.getEndDate() == null) {
				availableFacility.add(f);
			}
			if (f instanceof Group) {
				List<Facility> subFacilities = ((Group)f).requestAvailFacility();
				for(Facility subf : subFacilities) {
					availableFacility.add(subf);
				}
			}
		}
		return availableFacility;
	}

	// getters and setters
	public String getFacilityType() {
		return facilityType;
	}

	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
}
