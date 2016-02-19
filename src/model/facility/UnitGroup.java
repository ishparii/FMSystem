package model.facility;

import java.util.Date;
import java.util.LinkedList;

public class UnitGroup extends Facility {
	public UnitGroup(String name, Address address, String owner, Date date, Manager manager, Facility facility) {
		super(name, address, owner, date, manager);
		this.facility = facility;
	}

	private int unitGroupID;
	private Facility facility;

	@Override
	public Facility getFacilityInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFacilityDetail() {
		// TODO Auto-generated method stub

	}

	public LinkedList listFacility() {
		// TODO generate a LinkedList to return the list of Facilities.
		return null;
	}

	public LinkedList requestAvailFacility() {
		// TODO generate a LinkedList to return the available facility.
		return null;
	}

	public Facility addNewFacility() {
		// TODO add a new Facility and return it
		return facility;
	}

	public Facility removeFacility(int facilityID){
		// TODO remove a facility and return it
		return facility;
	}

	public int getUnitGroupID() {
		return unitGroupID;
	}

	public void setUnitGroupID(int unitGroupID) {
		this.unitGroupID = unitGroupID;
	}
}
