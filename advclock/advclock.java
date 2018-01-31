import java.time.*;
class advclock {
    public static void main(String args[]) {
        ZonedDateTime timeZone = ZonedDateTime.now();
        LocalDate monthDay = LocalDate.from(LocalDateTime.now());
        if (args[0].equals("timezone")) {
        System.out.println(timeZone.getZone());
        } else if (args[0].equals("number")) {
        System.out.println(monthDay.getDayOfMonth());
        } else {
        System.out.println("Only lowercase 'type'. eg. timezone, clock, number, month..");
        }
    }
}