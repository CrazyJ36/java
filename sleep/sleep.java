public class sleep {
	
    public static void main(String args[]) throws InterruptedException {
		
        char chars[] = {'A','B','C','D'};
		int i = 0;
        while(i < chars.length) {
            System.out.print(chars[i]);
			i++;
			Thread.sleep(1000);
        }
		System.exit(0);
    }
}