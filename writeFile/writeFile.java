import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class writeFile {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileWriter write = new FileWriter(file);
        //write.write();
    }
}
