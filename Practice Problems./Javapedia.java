//This program uses the concept of 2D arrays and nested loops 
// to simulate a wikipedia that stores data within an array-based database

package Arrays;

import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {

        // Defining Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********JavaPedia**********" + "\nHow many historical figures will you register?");
        int numFigure = scanner.nextInt();
        scanner.nextLine();

        String[][] database = new String[numFigure][3];

        for (int i = 0; i < database.length; i++) {

            System.out.println("\n\tFigure " + (i + 1));
            System.out.print("\t - Name: ");
            database[i][0] = scanner.nextLine();

            System.out.print("\t - Date of birth: ");
            database[i][1] = scanner.nextLine();

            System.out.print("\t - Occupation: ");
            database[i][2] = scanner.nextLine();

        }

        System.out.println("\nThese are the values you stored: ");
        print2DArray(database);

        System.out.println("\nWhat do you want information on?");
        String person_info = scanner.nextLine();

        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(person_info)) {
                System.out.println("\n\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }

        scanner.close();
    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

        }
    }

}
