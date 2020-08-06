package calenderAPI;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;

public class ScannerTimeInput {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
			
		Event event = new Event().setSummary("Meet").setLocation("ICICI Bank Manipal, Udupi, Karnataka-576102")
				.setDescription("Video Call with Bank RM");
		
	       Scanner scan =new Scanner(System.in);
		   String endDateTime = scan.nextLine();
		   SimpleDateFormat input =new SimpleDateFormat("yyyy-MM-dd");
		   SimpleDateFormat output =new SimpleDateFormat("yyyy-MM-dd'T' HH:mm:ss.SSSXXX");
		   Date date = input.parse(endDateTime);
		   String formatedIsodate = output.format(date);
		   
		   Timestamp timeStampDate = new Timestamp(date.getTime());
		   
		   System.out.println("formatedIsodate" + timeStampDate);
		   
		   //EventDateTime start = new EventDateTime() .setDateTime(formatedIsodate)
					  //.setTimeZone("Asia/Kolkata"); event.setStart(start);
		   
		  //DateTime startDateTime = new DateTime("2020-07-31T09:00:00+05:30");

		//  System.out.println("startDateTime" + startDateTime);
		  
		/*
		 * DateTime endDateTime = new DateTime("2020-07-31T10:00:00+05:30");
		 * 
		 * System.out.println("endDateTime" + endDateTime);
		 */
	}

}
