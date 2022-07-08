package dateVerify;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String date = "2021-04-15T12:32:51.399Z";
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		Date parsedDate = inputFormat.parse(date);
		String formattedDate = outputFormat.format(parsedDate);
		System.out.println(formattedDate);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
