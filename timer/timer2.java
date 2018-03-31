public class timer2 {
    public static void main(String[] args) throws InterruptedException {
	int x = 0;
	while (x < 5) {
	    x++;
	    Thread.sleep(1000);
	    System.out.println(x);
        }
    }
}
