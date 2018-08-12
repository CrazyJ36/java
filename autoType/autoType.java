public class autoType {
    public static void main(String args[]) throws InterruptedException {

        char chars[] = {'h','e','l','l','o'};

        for (int i = 0; i < chars.length; i++) {
           Thread.sleep(300);
           System.out.print(chars[i]); // print character at 'i's index
        }

        System.out.println();

    }
}
