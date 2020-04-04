import java.util.*;

public class RefundsGalore{
	public static boolean isLeapYear(int year){
		if (year  % 4 == 0 && (year % 100 != 0)){
			return true;
		}
		else if (year % 400 == 0){
			return true;
		}
		else {
			return false;
		}
	}

	public static int daysInMonth(int month, int year){
		if (month!=2){
			if (month==4 || month==6 || month==9 || month==11){
				return 30;
			} 
			else {
				return 31;
			}
		}
		else {
			if (isLeapYear(year)){
				return 29;
			}
			else {
				return 28;
			}
		}
	}

	public static double fractionOfYearRemaining(int month, int day, int year){
		int daysPassed = 0;
		
		for (int i=1; i<month; i++){
			daysPassed += daysInMonth(i, year);
		}
		daysPassed += day;

		if (isLeapYear(year)){
			double daysRemaining = 366 - daysPassed;
			double percentageLeft = daysRemaining / 366; 
			return percentageLeft;
		}
		else {
			double daysRemaining = 365 - daysPassed;
			double percentageLeft = daysRemaining / 365; 
			return percentageLeft;
		}
	}


	public static void main(String[] args){
		System.out.println(fractionOfYearRemaining(1,1,2020));
		
	}
}
