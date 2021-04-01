package calendar;

import java.util.Random;

public class calendar implements Comparable<CalendarDate> {
	 int month;
	 int date;

	 public  CalendarDate() {
	 this.month = 5;
	 this.date = (new Random()).nextInt(30) + 1;
	 }

	 public  CalendarDate(int m, int d) {
	 if(m < 1 || m > 12) {
	 throw new IllegalArgumentException();
	 }
	 month = m;
	 date = d;
	 }

	 public int compareTo(CalendarDate other) {
	 int ret = 0;
	 if (this.month == other.month && this.date == other.date) {
	 ret = 0;
	 } else if(this.month > other.month
	 || this.month == other.month && this.date > other.date) {
	 ret = 1;
	 } else if(this.month < other.month
	 || this.month == other.month && this.date < other.date) {
	 ret = -1;
	 }
	 return ret;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
