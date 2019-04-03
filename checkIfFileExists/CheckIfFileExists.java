import java.io.File;

public class CheckIfFileExists {
    public static void main(String[] args) {
        File file = new File("file.txt");
        if (file.exists()) {
            System.out.println("File exists, delete it and try again to see the difference.");
        } else {
            System.out.println("File did not exist. Create A 'file.txt' to see the difference.");
        }
    }
}
