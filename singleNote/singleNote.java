import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class singleNote {
	
    public static void main(String[] args) throws IOException {
        File file = new File("note.txt");
        final FileWriter writer = new FileWriter(file);
        try { 
            writer.append("Latest: " + args[0].toString() + "\n");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Empty note. Enter any 'text' to put into note.txt");
        }
        writer.close();
        System.out.println("File updated");
    }
}



