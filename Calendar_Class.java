// calendar is a abstract class type class

// CALENDAR

// import java.util.Calendar;
// import java.util.TimeZone;

// public class Calendar_Class {
//  public static void main(String[] args) {

//  Calendar c= Calendar.getInstance();
//   System.out.println(c.getCalendarType());
//   System.out.println(c.getTimeZone());

//   System.out.println(c.getTimeZone().getID());


//   }
// }





// GREGORIAN CALENDAR

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar_Class {

 public static void main(String[] args) {

  // Calendar c=Calendar.getInstance();
  // System.out.println(c.getTime());
  // System.out.println(c.get(Calendar.DATE));
  // System.out.println(c.get(Calendar.SECOND));
  // System.out.println(c.get(Calendar.MINUTE));
  // System.out.println(c.get(Calendar.HOUR));
  // System.out.println(c.get(Calendar.DAY_OF_WEEK));


  GregorianCalendar cal=new GregorianCalendar();
  System.out.println(cal.isLeapYear(2018));

  System.out.println(TimeZone.getAvailableIDs()[0]);

 }
}











