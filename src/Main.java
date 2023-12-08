import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of CSVCoder
        CSVCoder<Person> personCSVCoder = new PersonCSVCoder(';');
        CSVCoder<Dietitian> dietitianCSVCoder = new DietitianCSVCoder(';');
        CSVCoder<Patients> patientsCSVCoder = new PatientsCSVCoder(';');
        CSVCoder<Meal> mealCSVCoder = new MealCSVCoder(';');
        CSVCoder<DietPlan> dietPlanCSVCoder = new DietPlanCSVCoder(';');

        // Read data from CSV file
        try {
            personCSVCoder.readFromFile("DatesForProject.csv", Person.getPersonList());
            dietitianCSVCoder.readFromFile("DatesForProject.csv", Dietitian.getDietitianList());
            patientsCSVCoder.readFromFile("DatesForProject.csv", Patients.getPatientsList());
            mealCSVCoder.readFromFile("DatesForProject.csv", Meal.getMealList());
            dietPlanCSVCoder.readFromFile("DatesForProject.csv", DietPlan.getDietPlanList());
        } catch (Exception e) {
            System.out.println("Error al leer desde el archivo CSV: " + e.getMessage());
        }

        //Menu
        int option;
        do {
            System.out.println("\n*** Menú Principal ***");
            System.out.println("1. Gestionar Personas");
            System.out.println("2. Gestionar Dietitian");
            System.out.println("3. Gestionar Patients");
            System.out.println("4. Gestionar Meals");
            System.out.println("5. Gestionar Diet Plans");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    managePersons(scanner, personCSVCoder);
                    break;
                case 2:
                    manageDietitians(scanner, dietitianCSVCoder);
                    break;
                case 3:
                    managePatients(scanner, patientsCSVCoder);
                    break;
                case 4:
                    manageMeals(scanner, mealCSVCoder);
                    break;
                case 5:
                    manageDietPlans(scanner, dietPlanCSVCoder);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (option != 0);

        // Write data to CSV file
        try {
            personCSVCoder.writeToFile("DatesForProject.csv", Person.getPersonList());
            dietitianCSVCoder.writeToFile("DatesForProject.csv", Dietitian.getDietitianList());
            patientsCSVCoder.writeToFile("DatesForProject.csv", Patients.getPatientsList());
            mealCSVCoder.writeToFile("DatesForProject.csv", Meal.getMealList());
            dietPlanCSVCoder.writeToFile("DatesForProject.csv", DietPlan.getDietPlanList());
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
