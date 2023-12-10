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
            case 1://PATIENTS

                //Write to CSV
                System.out.println("Patients");

                ArrayList<Patients> pList = Patients.patientsList(scanner);

                File f = new File("patients.csv");
                try (FileWriter fw = new FileWriter(f,true)) {
                    for (Patients p : pList) {
                    fw.write(p.toCSV());
                        }
                } catch (IOException e) {
                    System.out.println("Error");
                } 

                //Read from CSV
                
                ArrayList<Patients> pList2 = new ArrayList<Patients>();

                Patients p;
                String[] dataP;

                try (Scanner sc =  new Scanner(new File("patients.csv"))){
                    while (sc.hasNextLine()) {
                        dataP = sc.nextLine().split(";");
                        p = new Patients(option, dataP[0], dataP[1], dataP[2], dataP[3], dataP[4], dataP[5], option, dataP[6], option, option, option, option, option, option, option, option,opt);
                        pList2.add(p);
                    }
                } catch (IOException e) {
                    System.out.println("Error");
                }

                for (Patients p2 : pList2) {
                    System.out.println(p2);
                }
                
                break;

            case 2://DIETITIANS

                //Write to CSV
                System.out.println("Dietitians");

                ArrayList<Dietitian> dList = Dietitian.dietitianList(scanner);

                File f2 = new File("dietitians.csv");
                try (FileWriter fw = new FileWriter(f2,true)) {
                    for (Dietitian d : dList) {
                    fw.write(d.toCSV());
                        }
                } catch (IOException e) {
                    System.out.println("Error");
                }

                //Read from CSV
                /*
                ArrayList<Dietitian> dList2 = new ArrayList<Dietitian>();

                Dietitian d;
                String[] dataD;

                try (Scanner sc =  new Scanner(new File("patients.csv"))){
                    while (sc.hasNextLine()) {
                        dataD = sc.nextLine().split(";");
                        d = new Dietitian(option, dataD[0], dataD[1], dataD[2], dataD[3], dataD[4], dataD[5], option, dataD[6]);
                        dList2.add(d);
                    }
                } catch (IOException e) {
                    System.out.println("Error");
                }

                for (Dietitian d2 : dList2) {
                    System.out.println(d2);
                }
                */
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

    }
}
