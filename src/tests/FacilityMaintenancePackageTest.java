package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.facility.Room;
import model.facilityMaintenance.*;

public class FacilityMaintenancePackageTest {
	Room room1;
	Request request1, request2;
	
	
	@Before
	public void setUp() {
		room1 = new Room();
		request1 = new Request();
		request2 = new Request();
	}
	
	@After
	public void tearDown() {
		room1 = null;
		request1 = null;
		request2 = null;
	}
	
	
	@Test
	public void testMakeFacilityMaintRequest() {
		assertTrue(room1.getMaintenanceLog().getRequests().isEmpty());
		request1 = room1.getMaintenanceLog().makeFacilityMaintenanceRequest();
		assertFalse(room1.getMaintenanceLog().getRequests().isEmpty());
	}
	
	

}
