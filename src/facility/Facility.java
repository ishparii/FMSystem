package facility;

public abstract class Facility {
	int facilityID;
	String name;
	Address address;
	String onwer;
	String constructionDate;
	
	public abstract Facility getFacilityInfo();
	public abstract void addFacilityDetail();
}
