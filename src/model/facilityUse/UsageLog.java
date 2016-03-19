package model.facilityUse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class UsageLog implements IUsageLog {
	private int usageLogID;
	
	private List<IUsage> usages;
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	// calculates usage rate in percentages during given interval
	// assuming facility can have one usage at a time
	public double calcUsageRate(Date start, Date end) {
		int diffInDays = (int) ((end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24));
		int usageDays = 0;
		for (IUsage u : usages) {
			Date usageStartDate = u.getStartDate();
			Date usageEndDate = u.getEndDate();
			int currentUsageInDays = 0;
			if (usageStartDate.after(start) && usageStartDate.before(end)) {
				if (usageEndDate != null && usageEndDate.before(end)) {
					currentUsageInDays = (int) ((usageEndDate.getTime() - usageStartDate.getTime())
							/ (1000 * 60 * 60 * 24));
				} else {
					currentUsageInDays = (int) ((end.getTime() - usageStartDate.getTime()) / (1000 * 60 * 60 * 24));
				}

			} else if (usageStartDate.before(start)) {
				if (usageEndDate == null) {
					currentUsageInDays = diffInDays;
				} else if (usageEndDate.after(start)) {
					currentUsageInDays = (int) ((usageEndDate.getTime() - start.getTime()) / (1000 * 60 * 60 * 24));
				}
			}
			usageDays += currentUsageInDays;
		}
		return ((double) usageDays) / diffInDays * 100.0;
	}

	// prints to console info about all usages of the facility
	// and returns the list of them
	public List<IUsage> listActualUsage() {
		for (IUsage u : usages) {
			System.out.print(u.getUser().getfName() + " " + u.getUser().getlName() + " started using this facility on "
					+ df.format(u.getStartDate()) + " for " + u.getUsageType() + " purpose");
			if (u.getEndDate() != null) {
				System.out.println(" and was using it until " + df.format(u.getEndDate()));
			} else {
				System.out.println();
			}
		}
		return usages;
	}

	// sets the most recent Usage end usage date to todays date
	// and return that Usage
	public IUsage vacateFacility() {
		IUsage currentUsage = usages.get(0);
		if (currentUsage.getEndDate() == null) {
			Date todaysDate = Calendar.getInstance().getTime();
			currentUsage.setEndDate(todaysDate);
			System.out.println("The facility has been vacated!");
		} else {
			System.out.println("The facility is currently vacant!");
		}
		return currentUsage;
	}

	// creates new Usage object
	// and returns it back
	public IUsage assignFacilityToUse() {
		IUsage newUsage = new Usage();
		usages.add(0, newUsage);
		return newUsage;
	}

	// returns true if the facility was in use (even partially) during given
	// interval
	public boolean isInUseDuringInterval(Date start, Date end) {
		for (IUsage u : usages) {
			Date usageStartDate = u.getStartDate();
			Date usageEndDate = u.getEndDate();
			if (usageStartDate.after(start) && usageStartDate.before(end)) {
				return true;
			} else if (usageStartDate.before(start) && ((usageEndDate == null) || usageEndDate.after(start))) {
				return true;
			}
		}
		return false;
	}

	public List<IUsage> getUsages() {
		return usages;
	}

	public void setUsages(List<IUsage> usages) {
		this.usages = usages;
	}

	public int getUsageLogID() {
		return usageLogID;
	}

	public void setUsageLogID(int usageLogID) {
		this.usageLogID = usageLogID;
	}

}
