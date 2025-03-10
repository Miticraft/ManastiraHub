package DateTime;

import java.util.Date;
import java.util.Formatter;

public class Formater {
	public static void main(String[] args) {
		Date date = new Date();
		Formatter fm = new Formatter();
		fm.format("%tb", date);
		System.out.println(fm);
	}
}