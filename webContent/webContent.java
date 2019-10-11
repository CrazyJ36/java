import java.net.*;
import java.io.*;

public class webContent {
    public static void main(String[] args) throws Exception {
        URL site = new URL("https://www.york.ac.uk/teaching/cws/wws/webpage1.html");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(site.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
