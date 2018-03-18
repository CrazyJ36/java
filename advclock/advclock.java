import java.time.*;
public class advclock {
    public static void main(String args[]) {
        ZonedDateTime timeZone = ZonedDateTime.now();
        LocalDate monthDay = LocalDate.from(LocalDateTime.now());
            // Argument Usage Checks
        if (args.length < 1) {
            System.out.println("No arguments given, try \"java advclock -h.\"");
            System.exit(0);
        } else if (args[0].equals("-h") || args[0].equals("--help")) {
            help();
           //Time Related Tasks
        } else if (args[0].equals("timezone")) {
            System.out.println(timeZone.getZone());
        }
          else if (args[0].equals("number")) {
            System.out.println(monthDay.getDayOfMonth());
        } else if (args[0].equals("clock")) {
            System.out.println(LocalTime.now());
        } else {
	    help();
	}
    }
    public static void help() {
        System.out.println("Usable arguments are:\nclock   \t- ticking clock in seconds");
        System.out.println("timezone\t- show your timezone.\nnumber  \t- show numerical day of the month.");
        System.out.println("-h, --help\t- for this help text"); 
    }
}

/* NOTES:
more good arguments to add (find how to use in java.time api):

month */
