public class timer {

    public static void main(String[] args) throws InterruptedException {
        int x = 0;
        while (x < 10) {
            x++;
            if (x == 8) {
                System.out.print("Almost Done: ");
            }
            System.out.println(x);
            Thread.sleep(1000);
        }
    }
}
