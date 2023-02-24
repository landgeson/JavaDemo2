package Calender;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ///year,month,day,week,time
		LocalDate localdate1=LocalDate.now();
		System.out.println("Todays date ;"+localdate1);
		LocalDate localdate2=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Todays date ;"+localdate2);
		
		LocalTime localtime1=LocalTime.now();
		System.out.println("Todays time ;"+localtime1);
		LocalTime localtime2=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Todays time ;"+localtime2);
		
		
		LocalDateTime localdatetime1=LocalDateTime.now();
		System.out.println("Todays time ;"+localdatetime1);
		LocalDateTime localdatetime2=LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Todays time ;"+localdatetime2);
		
		LocalDateTime anotherSummerDay = LocalDateTime.now();
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));
		
	}
}
