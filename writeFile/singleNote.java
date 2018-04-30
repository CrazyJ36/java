import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class singleNote {

    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileWriter writer = new FileWriter(file);
        try {
            writer.append("Latest: " + args[0].toString() + "\n");
 	    writer.close();
	    System.out.println("File updated");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Type any 'text' as parameter.");
        }
    }
}



