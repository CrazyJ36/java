import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;;
import java.io.IOException;

class getUrlContent {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.msn.com");
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(url.openStream()));
		BufferedWriter writer = new  BufferedWriter(
			new FileWriter("content.html"));
		String line;
		while ((line = reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();
		}
		reader.close(); writer.close();
    }
}
