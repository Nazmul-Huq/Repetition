import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // make an integer array list
        numbers = getNumber1To100(); //add numbers 1 to 100 to the array list

        printNumbers(numbers); // print the number list
        System.out.println(); // print a line break

        // ask user to choose a number
        System.out.println("Enter a number to remove its multiplications");
        int chosenNumber = Integer.parseInt(scanner.next());

        numbers = getListAfterRemoval(numbers, chosenNumber); // get the multiplication of chosen number removed
        printNumbers(numbers); // print the new number list

    } // end of main

    // remove multiplication of chosen number from a given number list and return the new number list
    static ArrayList<Integer> getListAfterRemoval(ArrayList<Integer> numbers, int chosenNumber){

        // initialize a variable to multiply the chosen number
        int timesOfMultiplication = 2;

        // start a while loop until all multiplications are removed
        // break the loop when value of multiplications/number to remove get higher than 100
        while (true){
            int numberToRemove = chosenNumber*timesOfMultiplication; // calculate the number to remove
            timesOfMultiplication++; // increase the value of multiplication by 1 each time the loop run

            // if number to remove get higher than 100 the break the loop
            //else remove the number from the list
            if (numberToRemove > 100) {
                break;
            } else {
                numbers.remove(new Integer(numberToRemove));
            }
        }
        return numbers;
    }

    // add numbers 1 to 100 t an array list and return it
    static ArrayList<Integer> getNumber1To100(){
        ArrayList<Integer> numbers1To100 = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            numbers1To100.add(i);
        }
        return numbers1To100;
    }

    // print the array list
    static void printNumbers(ArrayList<Integer> numbers){
        for (Integer number:numbers) {
            System.out.print(number + ", ");
        }
    }
} // end of class
