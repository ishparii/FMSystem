// package tests;
//
// import static org.junit.Assert.*;
//
// import java.text.ParseException;
// import java.text.SimpleDateFormat;
// import java.util.*;
//
// import org.junit.*;
//
// import model.facility.*;
// import model.facilityUse.*;
//
// public class FacilityPackageTest {
// Facility group;
// Facility building;
// Facility room1, room2;
// Manager manager;
// Address address;
// Usage usage1, usage2;
//
//
// @Before
// public void setUp() {
// group = new Group();
// building = new Building();
// room1 = new Room();
// room2 = new Room();
// manager = new Manager();
// address = new Address();
// usage1 = new Usage();
// usage2 = new Usage();
// }
//
// @After
// public void tearDown() {
// group = null;
// building = null;
// room1 = null;
// manager = null;
// address = null;
// }
//
//
// @Test
// public void testGetFacilityInfo() {
// ((Room)room1).setFacilityID(1);
// ((Room)room1).setRoomName("Spring");
// ((Room)room1).setRoomOwner("Ross");
// ((Room)room1).setUsageType("Residential");
// address.setAddressID(1);
// address.setUnitNumber(1);
// address.setStreetNumber(65);
// address.setStreet("Ashland");
// address.setCity("Chicago");
// address.setStateProvince("Illinois");
// address.setZipCode(66002);
// manager.setManagerID(123);
// manager.setfName("Philip");
// manager.setlName("White");
// manager.setCompanyName("Water Tower");
// manager.setPhone("1234567890");
//
// ((Room)room1).setManager(manager);
// ((Room)room1).setAddress(address);
//
// Map<String, String> fi = room1.getFacilityInfo();
//
// assertEquals(fi.get("id"), "1");
// assertEquals(fi.get("name"), "Spring");
// assertEquals(fi.get("address"), address.toString());
// assertEquals(fi.get("owner"), "Ross");
// assertEquals(fi.get("manager"), "Philip White");
// assertEquals(fi.get("type"), "Residential");
// }
//
// @Test
// public void testAddRemoveNewFacility() {
// ((Room)room1).setFacilityID(3);
// ((Building)building).addNewFacility(room1);
//
// assertTrue(((Building)building).getRooms().contains(room1));
//
// ((Building)building).removeFacility(room1.getFacilityID());
// assertFalse(((Building)building).getRooms().contains(room1));
// }
//
// @Test
// public void testRequestAvailFacility() throws ParseException {
// SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
// Date date1 = fmt.parse("2009-02-13");
//
// usage1.setEndDate(date1);
//
// ((Room)room1).getUsageLog().getUsages().add(usage1);
// ((Room)room2).getUsageLog().getUsages().add(usage2);
// ((Building)building).addNewFacility(room1);
// ((Building)building).addNewFacility(room2);
//
// List<Facility> li = ((Building)building).requestAvailFacility();
//
// assertFalse(li.contains(room1));
// assertTrue(li.contains(room2));
// }
// }
