import java.io.*;

class readTxtFile {
    public static void main(String[]args) {
        //Setting A (String) as (f) equalling the file to be read.
        String f = "temp.txt";
        /*Apparently nulling the (BufferedReader) forces
        it to read one line at A time here*/
        String line = null;
        //Calling (try/catch) in case there is no file
        try {
            /*Defining/calling FileReader class from java.io.*
            as (fr) to "fileread" the file (f)*/
            FileReader fr = new FileReader(f);
            /*FileReader must always be Wrapped in Buffered Reader
            here BufferedReader (br) is using FileReader (fr)*/
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            /*Always close files when jobs is done and not needed*/
            br.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open '" + f + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading '" + f + "'");
            //print debugging stacktrace if IOException
            ex.printStackTrace();
        }
    }
}
