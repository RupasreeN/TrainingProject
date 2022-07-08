import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateTimeTesting {
	public static void main(String[] args) {
		Date parsedDate = null;
		DateFormat dateFormat = null;
		TimeZone central = null;
		try{
			
			 dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
			 central = TimeZone.getTimeZone("Asia/Kolkata");
			TimeZone.setDefault(central);			
			dateFormat.setTimeZone(central);
			parsedDate = dateFormat.parse("2020-05-22 17:10:00");
			System.out.println("string to date"+"\t"+parsedDate);
			String formattedDate = null;
			
			
			dateFormat = new SimpleDateFormat("dd/MMM/YYYY hh:mm:ss a z", Locale.ENGLISH);
			formattedDate = dateFormat.format(parsedDate);
			System.out.println(" date to string"+"\t"+formattedDate);
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error is :"+e);
			} 
	}


}
