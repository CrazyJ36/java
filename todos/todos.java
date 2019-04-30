import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

class todos {
	static final File file = new File("file.txt");
    public static void main(String[] args) throws IOException {
        System.out.println("1. new entry\n2. read entries");
        Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		
        if (choice.equals("1")) {
            newEntry();
		} else if (choice.equals("2")) {
			readEntries();
		} else {
			System.out.println("Invalid option... Exiting.");
		}
		System.exit(0);
	}
	public static void newEntry() throws IOException {
		
	    FileWriter writer = new FileWriter(file);
		Scanner note = new Scanner(System.in);
		writer.append(note.nextLine());
		writer.close();
	}
	public static void readEntries() throws IOException {
		
	    FileReader reader = new FileReader(file);
		BufferedReader readBuff = new BufferedReader(reader);
		String line = null;
		while((line = readBuff.readLine()) != null) {
                System.out.println(line);
		}
		reader.close();
		readBuff.close();
	}
}
