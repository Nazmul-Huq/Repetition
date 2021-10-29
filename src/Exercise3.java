import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) throws FileNotFoundException {
        // get file from word and save to an arraylist
        ArrayList<String> wordsInFile = getWordsFromFile();

        //get no of words in file by getting the size of the wordsInFile
        int numberOfWordsInFile = wordsInFile.size();

        // print the number of word
        System.out.println(numberOfWordsInFile);


    }// end of main


    // read the strings.txt file
    // save each line in an arraylist, finally return the file
    static ArrayList<String> getWordsFromFile(){
        ArrayList<String> wordsInFile = new ArrayList<>(); // create an empty arraylist

        File stringsFile = new File("src/strings.txt"); // create file object
        try {
            Scanner scanner = new Scanner(stringsFile); // create scanner
            while (scanner.hasNextLine()){
                String individualString  = scanner.nextLine(); // make string from each line
                wordsInFile.add(individualString); // add string to the arraylist
            }
        } catch (FileNotFoundException e){
            System.out.println("File could not found");
        }
        return wordsInFile;
    }

} // end of class
