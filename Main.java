package Homework2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public final static String DATE_FORMAT = "dd/MMM/yyy";

	public static String PrintDate(Date date) {
		if (date == null)
			return "";
		SimpleDateFormat ft = new SimpleDateFormat(Main.DATE_FORMAT);
		return ft.format(date);
	}

	public static String PrintCheck(Object obj) {
		if (obj == null)
			return "";
		return obj + "";
	}

	public static String padRight(String s, int n) {
		return String.format("%1$-" + n + "s", s) + " : ";
	}

	public static Date NewDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(year, month - 1, day);
		return cal.getTime();
	}

	public static <Fiel> String printFielValue(Fiel Obj) {
		String Result = "";
		for (java.lang.reflect.Field field : Obj.getClass().getDeclaredFields()) {
			Result += field.getName() + ": \n";
		}
		return Result;
	}

}

