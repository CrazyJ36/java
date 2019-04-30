import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Exception;
import java.nio.file.Paths;

class MyNotes {
	static final String name = "notes.txt";
	final String dir = System.getProperty("user.dir");
	static final String path = Paths.get(".").toAbsolutePath().normalize().toString();
	static final File file = new File(path + "/" + name);
	static FileWriter writer;
	
    public static void main(String[] args) {
		System.out.print(name + " at: " + path + "\nEnter an option:\n");
		try {
		    writer = new FileWriter(file, true);
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
			writer.close();
		} catch (Exception exception) {
			System.out.println("Cancelled..");
		}
		System.exit(0);
	}
	
	public static void newEntry() throws IOException {
		try {
			System.out.print("Type A new note: ");
			Scanner note = new Scanner(System.in);
			String newText = "-  " + note.nextLine() + "\r\n";
			writer.append(newText);
		} catch (Exception exeption) {
			System.out.println("Cancelled..");
		}
	}
	
	public static void readEntries() throws IOException {
	    FileReader reader = new FileReader(file);
		BufferedReader readBuff = new BufferedReader(reader);
		System.out.println("All of your notes are shown: ");
		String line = null;
		while((line = readBuff.readLine()) != null) {
                System.out.println(line);
		}
		reader.close();
		readBuff.close();
	}
}
