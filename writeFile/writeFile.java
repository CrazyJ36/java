import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) throws IOException {
        // Instantiate A file with name 'file'. The filename will be 'file.txt' 
        File file = new File("file.txt");
        // Call new FileWriter with name writer to write the file 'file'
        FileWriter writer = new FileWriter(file);
        // write some text to the file.
        writer.write("Content text\n");
        // close the FileWriter as to not continue using it's resources.
        writer.close();
    }
}
