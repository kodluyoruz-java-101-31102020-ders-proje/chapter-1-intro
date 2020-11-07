package com.chapter1.main.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Application {

	
	public static void main(String[] args) throws ParseException {
	
		//jdk7DateOperations();
		jdk8DateOperations();
	}
	
	private static void jdk8DateOperations() {
		
		// LocalDate samples
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString());
		
		LocalDate currentDate = LocalDate.of(2020, 03, 12);
		System.out.println(currentDate.toString());
		
		LocalDate definedDate = LocalDate.parse("2015-02-20");
		definedDate = definedDate.minusDays(5);
		System.out.println(definedDate.toString());
		
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println(tomorrow);
		
		DayOfWeek sunday = LocalDate.parse("2020-11-07").getDayOfWeek();
		System.out.println(sunday);
		
		boolean leapYear = LocalDate.now().isLeapYear();
		System.out.println(leapYear);
		
		// LocalDateTime samples
		
		LocalDateTime localDateTime = localDate.atTime(10, 45);
		System.out.println(localDateTime);
		
		localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}
	
	private static void jdk7DateOperations() throws ParseException {
		
		Date now = new Date();
		System.out.println(now);
		
		Date userDefinedDate = new Date(1092938102222l);
		System.out.println(userDefinedDate);
		
		System.out.println(userDefinedDate.after(now));
		
		System.out.println(userDefinedDate.compareTo(now));
		
		
		long nowAsMillisecond = now.getTime();
		System.out.println(nowAsMillisecond);
		
		Date definedNow = new Date(nowAsMillisecond);
		System.out.println(definedNow);
		
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = dateFormatter.format(definedNow);
		
		System.out.println(formattedDate);
		
		Date parsedDate = dateFormatter.parse(formattedDate);
		System.out.println(parsedDate);
		
		Calendar calendar = Calendar.getInstance(new Locale("tr", "TR"));
		calendar.set(2020, 9, 12, 2, 49);
		
		Date date = calendar.getTime();
		System.out.println(date);
		
		TimeZone timeZone = calendar.getTimeZone();
		int milliseconds = timeZone.getRawOffset();
		
		System.out.println(timeZone.toZoneId().getId());
		System.out.println(timeZone.getDisplayName());
		System.out.println(milliseconds);
	}

}
