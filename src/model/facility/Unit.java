package model.facility;

import java.util.HashMap;
import java.util.Map;

public class Unit extends Facility {
	@Override
	public Map<String, String> getFacilityInfo() {
		Map<String, String> info = new HashMap<String, String>();
		info.put("id", Integer.toString(this.getFacilityID()));
		info.put("name", this.getFacilityName());
		info.put("owner", this.getFacilityOwner());
		info.put("type", "unit");
		info.put("manager", this.getManager().getfName() + " " + this.getManager().getlName());
		info.put("address", this.getAddress().toString());

		for (Map.Entry<String, String> entry : info.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		return info;
	}

}
