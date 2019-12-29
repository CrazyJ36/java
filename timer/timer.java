public class timer {
    public static void main(String[] args) throws InterruptedException {
        int x = 0;
        while (x < 10) {
            x++;
	    if (x == 1) {
		    System.out.println(x + " Started");
	    }
	    else if (x == 5) {
		    System.out.println(x + " Halfway");
	    }
	    else {
		    System.out.println(x);
	    }
            Thread.sleep(1000);
        }
	System.out.println("Done.");
	System.exit(0);
    }
}
