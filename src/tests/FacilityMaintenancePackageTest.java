// package tests;
//
// import static org.junit.Assert.*;
//
// import java.text.SimpleDateFormat;
// import java.util.*;
//
// import org.junit.*;
//
// import model.facility.Room;
// import model.facilityMaintenance.*;
//
// public class FacilityMaintenancePackageTest {
// Room room1;
// Request request1, request2;
//
//
// @Before
// public void setUp() {
// room1 = new Room();
// request1 = new Request();
// request2 = new Request();
// }
//
// @After
// public void tearDown() {
// room1 = null;
// request1 = null;
// request2 = null;
// }
//
//
// @Test
// public void testMakeFacilityMaintRequest() {
// assertTrue(room1.getMaintenanceLog().getRequests().isEmpty());
// request1 = room1.getMaintenanceLog().makeFacilityMaintenanceRequest();
// assertFalse(room1.getMaintenanceLog().getRequests().isEmpty());
// }
//
// @Test
// public void testListFacilityProblems() throws Exception {
// SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
// Date date1 = fmt.parse("2015-01-01");
// Date date2 = fmt.parse("2015-12-27");
//
// request1.setRequestID(1004);
// request1.setDateRequested(date1);
// request1.setTextDescription("Broken Windows");
//
// request2.setRequestID(3001);
// request2.setDateRequested(date2);
// request2.setTextDescription("heating system broken");
//
// request2.getMaintenance().setStatus("done");
// room1.getMaintenanceLog().getRequests().add(request1);
// room1.getMaintenanceLog().getRequests().add(request2);
// List<Request> problems = room1.getMaintenanceLog().listFacilityProblems();
// assertTrue(problems.contains(request1));
// assertFalse(problems.contains(request2));
// }
//
// @Test
// public void testCalculateDowntime() throws Exception {
// SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
// Date start = fmt.parse("2015-01-01");
// Date end = fmt.parse("2015-12-27");
//
// Date date1 = fmt.parse("2015-04-10");
// Date date2 = fmt.parse("2015-04-16");
//
// Date date3 = fmt.parse("2015-06-20");
// Date date4 = fmt.parse("2015-07-20");
//
// room1.getMaintenanceLog().getRequests().add(request1);
// room1.getMaintenanceLog().getRequests().add(request2);
//
// request1.setDateRequested(date1);
// request1.getMaintenance().scheduleMaintenance(date2);
//
// request2.setDateRequested(date3);
// request2.getMaintenance().scheduleMaintenance(date4);
//
// int downtime = (int) room1.getMaintenanceLog().calcDowntime(start, end);
//
// assertEquals(downtime, 36);
// }
//
// @Test
// public void testCalcProblemRateForFacility() throws Exception {
// SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
// Date start = fmt.parse("2015-01-01");
// Date end = fmt.parse("2015-12-27");
//
// Date date1 = fmt.parse("2015-04-10");
// Date date2 = fmt.parse("2015-04-16");
//
// Date date3 = fmt.parse("2015-06-20");
// Date date4 = fmt.parse("2015-07-20");
//
// room1.getMaintenanceLog().getRequests().add(request1);
// room1.getMaintenanceLog().getRequests().add(request2);
//
// request1.setDateRequested(date1);
// request1.getMaintenance().scheduleMaintenance(date2);
//
// request2.setDateRequested(date3);
// request2.getMaintenance().scheduleMaintenance(date4);
//
// int rate = (int) room1.getMaintenanceLog().calcProblemRateForFacility(start,
// end);
//
// assertEquals(rate, 10);
// }
// }
