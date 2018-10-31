import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

class fileContentToStr {
	public static void main(String[] args) {
		// A file named "file.txt" with some content should already be created for this example
		try {
			List<String> fileContent = Files.readAllLines( Paths.get("file.txt") );
			System.out.println(fileContent + "\n");
		} catch (IOException ioException) {
			System.out.println("Fix this: " + ioException.getLocalizedMessage() );
        }
	}
}
