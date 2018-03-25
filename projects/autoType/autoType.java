public class autoType {
    public static void main(String args[])
        throws InterruptedException {
        char chars[] = {'h','e','l','l','o'};

        for (int i = 0; i < chars.length; i++) {
           Thread.sleep(200);
           System.out.print(chars[i]);
        }

        System.out.println();
    }
}
