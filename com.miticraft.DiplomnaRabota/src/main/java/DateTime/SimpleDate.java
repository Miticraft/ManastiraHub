package DateTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// initialize Date class
			Date date = new Date();
			// initialize SimpleDateFormat class it accepts the format of date
			// here it accepts the "MMM" format for month
			SimpleDateFormat month = new SimpleDateFormat("MMM");
			//"format" use to format the date in to string
			String currentMonth = month.format(date);
			System.out.println(currentMonth);
			
	}

}