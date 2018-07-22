import java.time.*;
import java.time.format.*;

public class advclock {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("No arguments given, try 'java advclock help'.");
            System.exit(0);
        } else if (args[0].equals("zone")) {
            System.out.println(ZonedDateTime.now().getZone());
        } else if (args[0].equals("num")) {
            System.out.println(MonthDay.now().getDayOfMonth());
        } else if (args[0].equals("clock")) {
            LocalTime utime = LocalTime.now();
            DateTimeFormatter time = DateTimeFormatter.ofPattern("h"+":"+"m"+" "+"a");
            String mtime = utime.format(time);
            System.out.println(mtime);
        } else if (args[0].equals("month")) {
            String month = YearMonth.now().getMonth().toString().toLowerCase();
            char fl = month.charAt(0);
            char flu = Character.toUpperCase(fl);
            String fmonth = month.replace(fl, flu);
            System.out.println(fmonth);
        } else {
            help();
	    System.exit(0);
        }
    }
    public static void help() {
        System.out.println("To show useful info, usable arguments are:\n");
        System.out.println("clock    \t- current time of day.");
        System.out.println("zone     \t- your timezone.");
        System.out.println("num      \t- numerical day of the month.");
        System.out.println("month    \t- month of the year.");
        System.out.println("help     \t- this help.");
    }
}
