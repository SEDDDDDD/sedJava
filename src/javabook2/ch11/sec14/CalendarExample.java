package javabook2.ch11.sec14;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사용가능한 타임존 지역 목록
		String[] local = TimeZone.getAvailableIDs();
		for(int i=0; i<local.length;i++) {
			System.out.println(local[i]);
		}
		
		//스위스 timezone 매개변수 : europ/zurich
		//다른시간대의 캘린더 객체를 얻음
		TimeZone timeZone = TimeZone.getTimeZone("Europe/Zurich");
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int month = now.get(Calendar.MONTH)+1;
		int week = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		String strWeek=null;
		
		switch(week) {
		case Calendar.MONDAY:
			strWeek="월";
			break;
		case Calendar.TUESDAY:
			strWeek="화";
			break;
		case Calendar.WEDNESDAY:
			strWeek="수";
			break;
		case Calendar.THURSDAY:
			strWeek="목";
			break;
		case Calendar.FRIDAY:
			strWeek="금";
			break;
		case Calendar.SATURDAY:
			strWeek="토";
			break;
		case Calendar.SUNDAY:
			strWeek="일";
			break;
		}
		
		String strAmPm = null; 
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		TimeZone timezon = TimeZone.getTimeZone("Switzerland/Bern");
		
		Calendar now1 = Calendar.getInstance(timezon);
		
		int amPm1 = now1.get(Calendar.AM_PM);
		int hour1 = now1.get(Calendar.HOUR);
		int minute1 = now1.get(Calendar.MINUTE);
		int second1 = now1.get(Calendar.SECOND);
		
		String strAmPm1 = null; 
		if (amPm1 == Calendar.AM) {
			strAmPm1 = "오전";
		} else {
			strAmPm1 = "오후";
		}
		System.out.println(strAmPm1);
		System.out.println(hour1+"시");
		System.out.println(minute1+"분");
		System.out.println(second1+"초");
		
		System.out.println("=====================");
		
		System.out.println(year);
		System.out.println(day);
		System.out.println(month);
		System.out.println(strWeek+"요일");
		System.out.println(strAmPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
				
		
		
	}

}
