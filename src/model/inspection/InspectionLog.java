package model.inspection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InspectionLog {
   
    private List<Inspection> inspections;
    
    public InspectionLog(Inspection ... inspection) {
    	this.setInspections(Arrays.asList(inspection));
    }

    public LinkedList<Inspection> listInspection() {
        // TODO 
        return null;
    }

	public List<Inspection> getInspections() {
		return inspections;
	}

	public void setInspections(List<Inspection> inspections) {
		this.inspections = inspections;
	}


}
