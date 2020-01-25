package com.example.dates;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar(2018, 10, 11);
//		cal.set(2018, 11, 11);
//		cal.ge
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MMM dd");
//		System.out.println(simpleDateFormat.format(cal.getTime()));
//		System.out.println(simpleDateFormat.format(cal.get(Calendar.DAY_OF_WEEK)));
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(cal.getTime()).toUpperCase());
		
		System.out.println(new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());
		
		Date date = new Date();
		System.out.println("Date Class Test : "+date.toString());
		
		Calendar calendar = Calendar.getInstance(Locale.UK);
		System.out.println("Calendar Class Test : "+calendar.getTime());
		
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DATE_FIELD, Locale.UK);
		System.out.println("DateFormat Class Test : "+dateFormat.format(calendar.getTime()));
		
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.UK);
		System.out.println(numberFormat.format(555));
		
		NumberFormat numberCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		System.out.println(numberCurrencyFormat.format(555));
		
		NumberFormat numberCurrencyFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(numberCurrencyFormatUS.format(555));
		
		NumberFormat numberCurrencyFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(numberCurrencyFormatChina.format(555));
		
		NumberFormat numberCurrencyFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(numberCurrencyFormatFrance.format(555));

	}

}
