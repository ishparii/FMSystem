package view;

//import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.facilityMaintenance.IMaintenance;
import model.facilityMaintenance.Request;

public class FacilityMaintenanceClient {
	
	public static void main(String[]args) throws Exception{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		 Date date1 = fmt.parse("2009-02-13");
		// Date date2 = fmt.parse("2013-10-10");
		 
		 //Timestamp timestamp = new Timestamp(date1.getTime());

		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        
        Request request1 = (Request) context.getBean("Request");
		request1.setRequestID(1004);
		request1.setDateRequested(date1);
		request1.setTextDescription("Broken Windows");
		
		IMaintenance maintenance1 = request1.getMaintenance();
		maintenance1.setMaintenanceID(4000);
		maintenance1.setIssueDescription("Need to fix broken windows");
		maintenance1.setPriority(true);
		maintenance1.setStatus("Pending");
		maintenance1.setMaintenanceType("Fixtures");
        
}
}