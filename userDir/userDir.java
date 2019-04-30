/* Prints current users path in command line.
   Run in command-line pointing classpath to class like:
   'java -cp ./java/userDir userDir'
   where classpath is where the actuall userDir.class is located.
*/
public class userDir {
    public static void main(String[] args) {
	    String homeDir = System.getProperty("user.dir");
		System.out.println("Current path is: " + homeDir);
	}
}