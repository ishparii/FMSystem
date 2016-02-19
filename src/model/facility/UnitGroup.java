package model.facility;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UnitGroup extends Facility {

	public UnitGroup(Facility... facilities) {
		super();
		this.facilities = Arrays.asList(facilities);
	}

	private List<Facility> facilities;

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
		info.put("type", "group");		
		
		for (Map.Entry<String, String> entry : info.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		return info;
	}

	public List<Facility> listFacility() {
		for (Facility f: facilities) {
			System.out.println("Facility ID: " + f.getFacilityID());
			if (f instanceof UnitGroup) {
				System.out.println("Facility ID: " + f.getFacilityID() + " contains:");
				((UnitGroup) f).listFacility();				
			} else {
				System.out.println("Facility ID: " + f.getFacilityID() + ";");
			}
		}
		return facilities;
	}

	public LinkedList requestAvailFacility() {
		// TODO generate a LinkedList to return the available facility.
		return null;
	}

	public Facility addNewFacility(Facility facility) {
		facilities.add(facility);
		System.out.println("Facility with ID: " + facility.getFacilityID() + " was added");
		return facility;
	}

	public void removeFacility(int facilityID){
		for (Facility f: facilities) {
			if (f.getFacilityID() == facilityID) {
				facilities.remove(f);
				System.out.println("Facility with ID: " + facilityID + " was removed");
				return;
			} else if (f instanceof UnitGroup) {
				((UnitGroup) f).removeFacility(facilityID);				
			}
		}
	}

}
