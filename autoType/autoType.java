public class autoType {
    // announce throw of InterruptedException to for Thread to work without error later
    // since threads can cause troubles with the system, java doesn't allow this by default.
    public static void main(String args[]) throws InterruptedException {

        char chars[] = {'h','e','l','l','o'};

        for (int i = 0; i < chars.length; i++) {
           Thread.sleep(300);
           System.out.print(chars[i]); // print character at 'i's index
        }

        System.out.println();

    }
}
