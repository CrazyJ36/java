import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;;
import java.io.IOException;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;

class getUrlContent {
		int next;
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://feed.cnet.com/feed/news");

		BufferedReader reader = new BufferedReader(
			new InputStreamReader(url.openStream()));

		BufferedWriter writer = new  BufferedWriter(
			new FileWriter("file.txt"));

		String fileLine;

		while ((fileLine = reader.readLine()) != null) {
			writer.write(fileLine);
			writer.newLine();
		}
		reader.close(); writer.close();
		// To String
		List<String> fileText = Files.readAllLines(Paths.get("file.txt")); // list
		String[] text = fileText.toArray(new String[0]); // array
		String finalText = Arrays.toString(text); // string
		System.out.println(finalText);

    }
}
