package facility;

public abstract class Facility {
	private String name;
	private Address address;
	private String owner;
	private String constructionDate;

	public abstract Facility getFacilityInfo();
	public abstract void addFacilityDetail();

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public String getOwner() {
		return owner;
	}

	public String getConstructionDate() {
		return constructionDate;
	}
}
