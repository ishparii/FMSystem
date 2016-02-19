package model.facility;


import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class UnitGroup extends Facility {
	public UnitGroup(Facility... facilities) {
		super();
		this.facilities = Arrays.asList(facilities);
	}

	private int unitGroupID;
	private List<Facility> facilities;

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

	public Facility addNewFacility(Facility facility) {
		// TODO add a new Facility and return it
		return facility;
	}

	public void removeFacility(int facilityID){
		// TODO remove a facility and return it
	}

	public int getUnitGroupID() {
		return unitGroupID;
	}

	public void setUnitGroupID(int unitGroupID) {
		this.unitGroupID = unitGroupID;
	}
}
