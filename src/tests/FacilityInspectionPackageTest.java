package tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.*;

import model.inspection.*;
import model.facility.*;

public class FacilityInspectionPackageTest {
	Inspection inspection;
	Room room;
	
	@Before
	public void setUp() {
		inspection = new Inspection();
		room = new Room();
	}
	
	@After
	public void tearDown() {
		inspection = null;
	}
	
	
	@Test
	public void testAddInspection() throws ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = fmt.parse("2009-02-13");
		
		inspection.setInspectionID(85);
		inspection.setInspectionType("Insurance visit");
		inspection.setInspector("Quimby");
		inspection.setInspectionDate(date);
		inspection.setOutcome("Good Condition");

		List<Inspection> li = room.getInspectionLog().listInspection();
		
		assertFalse(li.contains(inspection));
		
		room.getInspectionLog().addInspection(inspection);
		
		assertTrue(li.contains(inspection));
	}
}
