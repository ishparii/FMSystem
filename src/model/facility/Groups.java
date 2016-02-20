package model.facility;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public interface Groups extends Facility {
	public List<Facility> listFacility();
	public Map<String, String> getFacilityInfo();
	public Facility addNewFacility(Facility facility);
	public void removefacility(Facility facility);
	public LinkedList requestFacilityInfo();
}
