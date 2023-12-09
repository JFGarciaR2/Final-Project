import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Diet Plan App");
        System.out.println("Please enter your option: ");
        System.out.println("1. Create Patients");
        System.out.println("2. Create Dietitians");
        System.out.println("3. Create Diet Plans");
        System.out.println("4. Create Meals");
        System.out.println("5. Other Options");
        System.out.println("6. Exit");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Patients");

                ArrayList<Patients> pList = Patients.patientsList(scanner);

                File f = new File("patients.csv");
                try (FileWriter fw = new FileWriter(f)) {
                    for (Patients p : pList) {
                    fw.write(p.toCSV());
                        }
                } catch (IOException e) {
                    System.out.println("Error");
                } 

                break;
            case 2:
                System.out.println("Dietitians");
                break;
            case 3:
                System.out.println("Diet Plans");
                break;
            case 4:
                System.out.println("Meals");
                break;
            case 5:
                System.out.println("Other Options");
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }


        //DIETITIANS
        //ArrayList<Dietitian> dList = Dietitian.dietitianList(scanner);

    }
}
