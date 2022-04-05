package functions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class WorkingWithDate {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date morteDecristo = Date.from(Instant.parse("2022-04-16T18:00:00Z"));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(morteDecristo);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("Dia da celeb " + day);
		
		System.out.println("Horario da Celebração: " + sdf2.format(morteDecristo));
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		System.out.println("x1: " + sdf1.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("-----------------------");
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
	} 

}
