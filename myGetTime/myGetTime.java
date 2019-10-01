import java.util.Calendar;

public class myGetTime {
  public static void main(String args[]) {
    Calendar x = Calendar.getInstance();

    String amOrPm = "";
    if (Calendar.AM_PM == 0) {
        amOrPm = "AM";
    } else {
        amOrPm = "PM";
    }

    System.out.println("The time of day is: " +
        x.get(Calendar.HOUR) +
        ":" +
        x.get(Calendar.MINUTE) +
        amOrPm
        );

  }

}
