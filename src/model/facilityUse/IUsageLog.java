package model.facilityUse;

import java.util.Date;
import java.util.List;

public interface IUsageLog {
	public List<IUsage> getUsages();
	public void setUsages(List<IUsage> usages);
	public double calcUsageRate(Date start, Date end);
	public List<IUsage> listActualUsage();
	public IUsage vacateFacility();
	public IUsage assignFacilityToUse();
	public boolean isInUseDuringInterval(Date start, Date end);
}
