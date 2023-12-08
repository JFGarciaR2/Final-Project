import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of CSVCoder
        CSVCoder<Dietitian> dietitianCSVCoder = new DietitianCSVCoder(';');
        CSVCoder<Patients> patientsCSVCoder = new PatientsCSVCoder(';');
        CSVCoder<Meal> mealCSVCoder = new MealCSVCoder(';');
        CSVCoder<DietPlan> dietPlanCSVCoder = new DietPlanCSVCoder(';');

        // Create instances of your classes
        Dietitian dietitianInstance = new Dietitian(1, "John Doe", "123456789", "john@example.com", "Male", "123 Main St", "Occupation", 30, "Speciality");
        Patients patientsInstance = new Patients(2, "Jane Smith", "987654321", "jane@example.com", "Female", "456 Oak St", "Occupation", 35, "A+", "Condition", 70, 180);
        Meal mealInstance = new Meal(3, "Healthy Meal", "A nutritious meal", "Breakfast", 500, "Protein, Carbs, Fat", "Morning");
        DietPlan dietPlanInstance = new DietPlan(4, "Weight Loss Plan", "A plan for losing weight", "Weight Loss", "3 months", "$100", 1500, "40% Protein, 40% Carbs, 20% Fat", "Drink water", "John Doe", "Jane Smith", "Healthy Meal");

        // Read data from CSV file
       try {
            dietitianCSVCoder.readFromFile("DatesForProject.csv", dietitianInstance.getDietitianList());
            patientsCSVCoder.readFromFile("DatesForProject.csv", patientsInstance.getPatientsList());
            mealCSVCoder.readFromFile("DatesForProject.csv", mealInstance.getMealList());
            dietPlanCSVCoder.readFromFile("DatesForProject.csv", dietPlanInstance.getDietPlanList());
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de excepciones
        }

        //Menu
        int option;
        do {
            System.out.println("\n*** Menú Principal ***");
            System.out.println("1. Gestionar Dietitian");
            System.out.println("2. Gestionar Patients");
            System.out.println("3. Gestionar Meals");
            System.out.println("4. Gestionar Diet Plans");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    manageDietitians(scanner, dietitianCSVCoder);
                    break;
                case 2:
                    managePatients(scanner, patientsCSVCoder);
                    break;
                case 3:
                    manageMeals(scanner, mealCSVCoder);
                    break;
                case 4:
                    manageDietPlans(scanner, dietPlanCSVCoder);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (option != 0);

        // Write data to CSV file
        try {
            dietitianCSVCoder.writeToFile("DatesForProject.csv", dietitianInstance.getDietitianList());
            patientsCSVCoder.writeToFile("DatesForProject.csv", patientsInstance.getPatientsList());
            mealCSVCoder.writeToFile("DatesForProject.csv", mealInstance.getMealList());
            dietPlanCSVCoder.writeToFile("DatesForProject.csv", dietPlanInstance.getDietPlanList());
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }


    }

    private static void managePersons(Scanner scanner, CSVCoder<Person> personCSVCoder) {
        // Implementa lógica para gestionar Personas
    }

    private static void manageDietitians(Scanner scanner, CSVCoder<Dietitian> dietitianCSVCoder) {
        // Implementa lógica para gestionar Dietitians
    }

    private static void managePatients(Scanner scanner, CSVCoder<Patients> patientsCSVCoder) {
        // Implementa lógica para gestionar Patients
    }

    private static void manageMeals(Scanner scanner, CSVCoder<Meal> mealCSVCoder) {
        // Implementa lógica para gestionar Meals
    }

    private static void manageDietPlans(Scanner scanner, CSVCoder<DietPlan> dietPlanCSVCoder) {
        // Implementa lógica para gestionar Diet Plans
    }
    
   
}
