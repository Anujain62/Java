import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
 public static void main(String[] args) {

  LocalDateTime dt=LocalDateTime.now();  // this is the date
  // System.out.println(dt);


  // DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");   // this is the format
  // String myDate1=dt.format(dtf);
  // System.out.println(myDate1);


  // DateTimeFormatter df=DateTimeFormatter.ISO_LOCAL_DATE;
  // String myDate2=dt.format(df);
  // System.out.println(myDate2);


  DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");    // it gives date with week day and time
  String myDate1=dt.format(dtf);
  System.out.println(myDate1);

 }
}
