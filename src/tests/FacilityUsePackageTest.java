package tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.*;

import model.facilityUse.*;
import model.facility.*;

public class FacilityUsePackageTest {
	Usage usage1, usage2;
	Room room1, room2;
	
	@Before
	public void setUp() {
		usage1 = new Usage();
		usage2 = new Usage();
		room1 = new Room();
		room2 = new Room();
	}
	
	@After 
	public void tearDown() {
		usage1 = null;
		usage2 = null;
		room1 = null;
		room2 = null;
	}
	
	
	@Test
	public void testAssignFacilityToUse() {
		assertTrue(room1.getUsageLog().getUsages().isEmpty());
		usage1 = room1.getUsageLog().assignFacilityToUse();
		assertFalse(room1.getUsageLog().getUsages().isEmpty());
	}
	
	@Test
	public void testVacateFacility() {
		usage1 = room1.getUsageLog().assignFacilityToUse();
		usage1 = room1.getUsageLog().vacateFacility();
		assertFalse(room1.getUsageLog().getUsages().get(0).getEndDate() == null);	
	}
	
	@Test
	public void testIsInUseDuringInterval() throws ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = fmt.parse("2016-02-13");
		Date date2 = fmt.parse("2016-02-20");
		
		Date date3 = fmt.parse("2016-02-14");
		Date date4 = fmt.parse("2009-02-13");
		
		Date date5 = fmt.parse("2013-10-10");
		Date date6 = fmt.parse("2016-02-16");
		
		usage1.setStartDate(date3);
		usage1.setEndDate(date6);
		usage2.setStartDate(date4);
		usage2.setEndDate(date5);
		
		room1.getUsageLog().getUsages().add(usage1);
		room2.getUsageLog().getUsages().add(usage2);
		
		assertTrue(room1.getUsageLog().isInUseDuringInterval(date1, date2));
		assertFalse(room2.getUsageLog().isInUseDuringInterval(date1, date2));
	}
	
	@Test
	public void testCalcUsageRate() throws Exception {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date start = fmt.parse("2015-01-01");
		Date end = fmt.parse("2015-12-27");
		
		Date date1 = fmt.parse("2015-04-10");
		Date date2 = fmt.parse("2015-04-16");
		
		Date date3 = fmt.parse("2015-06-20");
		Date date4 = fmt.parse("2015-07-20");
		
		usage1.setStartDate(date1);
		usage1.setEndDate(date2);
		usage2.setStartDate(date3);
		usage2.setEndDate(date4);
		
		room1.getUsageLog().getUsages().add(usage1);
		room1.getUsageLog().getUsages().add(usage2);
		
		int days = (int)room1.getUsageLog().calcUsageRate(start, end);
		assertEquals(days, 10);
	}
	
	

}
