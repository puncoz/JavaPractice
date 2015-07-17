package calculateDifference;

import java.util.Calendar;

public class DateCalculation {

	public DateCalculation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String arg[]) {
		// Create Calendar instance
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		// Set the values for the calendar fields YEAR, MONTH and DAY_OF_MONTH
		calendar1.set(2015, 7, 17);
		calendar2.set(2015, 7, 18);
		
		/*
		 * Use getTimeInMillis() method to get the Calendar's time value in
		 * milliseconds. This method returns the current time as UTC
		 * milliseconds from the epoch
		 */
		long miliSecondForDate1 = calendar1.getTimeInMillis();
		long miliSecondForDate2 = calendar2.getTimeInMillis();
		
		// Calculate the difference in millisecond between two dates
		long diffInMilis = miliSecondForDate2 - miliSecondForDate1;
		
		long diffInSecond = diffInMilis / 1000;
		long diffInMinute = diffInMilis / (60 * 1000);
		long diffInHour = diffInMilis / (60 * 60 * 1000);
		long diffInDays = diffInMilis / (24 * 60 * 60 * 1000);
		
		System.out.println("Difference in Seconds : " + diffInSecond);
		System.out.println("Difference in Minutes : " + diffInMinute);
		System.out.println("Difference in Hour : " + diffInHour);
		System.out.println("Difference in Days : " + diffInDays);
	}

}
