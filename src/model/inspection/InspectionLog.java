package model.inspection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class InspectionLog {
   
    private List<Inspection> inspections;
    
    public InspectionLog(Inspection ... inspection) {
    	this.setInspections(Arrays.asList(inspection));
    }

    public List<Inspection> listInspection() {
    	DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        for (Inspection i : inspections) {        	
        	System.out.println("Inspection " + i.getInspectionID() + " of " + i.getInspectionType() + " type was done by " + i.getInspector() + " on "+ df.format(i.getInspectionDate()) + " with " + i.getOutcome() + " outcome.");
        }
        return inspections;
    }

//	public List<Inspection> getInspections() {
//		return inspections;
//	}

	public void setInspections(List<Inspection> inspections) {
		this.inspections = inspections;
	}


}
