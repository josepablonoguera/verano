/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Files;

/**
 *
 * @author pablonoguera
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
/*Note: There are many available classes in the Java API 
that can be used to read and write files in Java: FileReader, BufferedReader, Files,
Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, 
etc. Which one to use depends on the Java version you're 
working with and whether you need to read bytes or characters, and the size of the file/lines etc.*/
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;
/**
 * This class allows us to explore different behaviors and instructions that we can implement with Java files.
 * @author pablonoguera
 */
public class Files {

    private final Timer timer;

    public Files(int seconds) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new RemindTask(seconds), 0, 1000);
    }

    private void end() {
        this.timer.cancel();
    }

    public static void main(String[] args) {
        createFile();
        writeToFile();
        readFile();
        getInfoFile();
        try {

            Files t = new Files(8);
            System.out.println("now let's delete the file...");
            Thread.sleep(8000);
            t.end();
            deleteFile();
        } catch (InterruptedException ex) {
            Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private static void createFile() {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    private static void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    private static void readFile() {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            System.out.println("\nText from file");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }

    private static void getInfoFile() {
        System.out.println("\n**** Information ***** \n");
        try {
            File myObj = new File("filename.txt");
            if (myObj.exists()) {
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                System.out.println("File size in bytes " + myObj.length());
                
                System.out.println("\n**** EOF ***** \n");
            } else {
                System.out.println("The file does not exist.");
            }
        } catch (Exception e) {
        }
    }

    private static void deleteFile() {
        try {
            File myObj = new File("filename.txt");
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
        }
    }
}
/**
 * Class to indicate how many minutes remain 
 * @author pablonoguera
 */
class RemindTask extends TimerTask {

    private volatile int remainingTimeInSeconds;

    public RemindTask(int remainingTimeInSeconds) {
        this.remainingTimeInSeconds = remainingTimeInSeconds;
    }

    public void run() {
        if (remainingTimeInSeconds != 0) {
            System.out.println(remainingTimeInSeconds + " ...");
            remainingTimeInSeconds -= 1;
        }
    }
}
