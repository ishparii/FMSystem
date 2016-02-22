package test.facility;

import static org.junit.Assert.*;

import org.junit.Test;

import model.facility.Manager;

public class ManagerTest {

	@Test
	public void testGetManagerID() {
		Manager manager= new Manager();
		manager.setManagerID(1);
		assertEquals(1,manager.getManagerID());
	}
	
	@Test
	public void testGetFName(){
		Manager manager= new Manager();
		manager.setfName("Ana");
		assertEquals("Ana",manager.getfName());
		
	}
	
	@Test
	public void testGetLName(){
		Manager manager= new Manager();
		manager.setlName("Peter");
		assertEquals("Peter",manager.getlName());
	}
	
	@Test
	public void testGetCompanyName(){
		Manager manager= new Manager();
		manager.setCompanyName("xyz");
		assertEquals("xyz",manager.getCompanyName());
	}
	
	@Test
	public void testGetPhone(){
		Manager manager= new Manager();
		manager.setPhone("123456789");
		assertEquals("123456789", manager.getPhone());
		
	}
}
