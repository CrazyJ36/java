package com.crazyj36.systemCommands;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class systemCommands {
    public static void main(String[] args) {

        String myDir = "C:\\Users\\thomas\\file.txt";
        File fileStr = new File(myDir);
        String program = "notepad " + fileStr;
        String text = args[0] + System.lineSeparator();
        try {
            System.out.println("Adding Note: " + text);

        } catch (ArrayIndexOutOfBoundsException argIndexException) {
            System.out.println("You didn't type an argument to put into notes!");
            System.exit(0);
        }
       
        try {
            FileWriter fileWriter = new FileWriter(fileStr, true); // The 'true' parameter turns on append mode, not deleting the contents
            fileWriter.append(text);
            fileWriter.close(); 
        } catch (IOException ioException) {
            System.out.println("Write, Append to, or access file.txt Personal Folder (IOException");
            System.exit(0);
        }

        try {
            Runtime.getRuntime().exec(program);
        } catch (IOException ioException) {
            System.out.println("Couldn't Run Notepad.");
            System.exit(0);
        }
        
    }
}