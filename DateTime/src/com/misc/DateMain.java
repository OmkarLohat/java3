package com.misc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateMain {
	public static void main(String args[])
	{
		LocalDate now,bDate, nowPlusMonth ;
		
		now=LocalDate.now();
		System.out.println("Now: "+now);
		bDate =LocalDate.of(1995,  5, 23);
		
		System.out.println("Java's Bday: " + bDate);
		System.out.println("Is Java's Bday in the past? " + bDate.isBefore(now));
		System.out.println("Is Java's Bday in a leap year? " + bDate.isLeapYear());
		System.out.println("Java's Bday day of the week: " + bDate.getDayOfWeek());
		nowPlusMonth = now.plusMonths(1);
		System.out.println("The date a month from now: " + nowPlusMonth);
		
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfWeek());
		
		System.out.println(LocalTime.now());
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-YY");
		System.out.println(formatter.format(now));
		
		System.out.println(LocalDateTime.now());
		
		
	}
}
