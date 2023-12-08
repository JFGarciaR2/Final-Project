//Author: Juan Fernando Garcia Restrepo

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CSVCoder<Person> personCSVCoder = new PersonCSVCoder(';');
        CSVCoder<Dietitian> dietitianCSVCoder = new DietitianCSVCoder(';');
        CSVCoder<Patients> patientsCSVCoder = new PatientsCSVCoder(';');
        CSVCoder<Meal> mealCSVCoder = new MealCSVCoder(';');
        CSVCoder<DietPlan> dietPlanCSVCoder = new DietPlanCSVCoder(';');

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Agregar nuevo Nutricionista");
            System.out.println("2. Agregar nuevo Paciente");
            System.out.println("3. Agregar nueva Comida");
            System.out.println("4. Agregar nuevo Plan de Dieta");
            System.out.println("5. Mostrar información");
            System.out.println("6. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the \n character

            switch (choice) {
                case 1:
                    addDietitian(scanner, dietitianCSVCoder);
                    break;
                case 2:
                    addPatient(scanner, patientsCSVCoder);
                    break;
                case 3:
                    addMeal(scanner, mealCSVCoder);
                    break;
                case 4:
                    addDietPlan(scanner, dietPlanCSVCoder);
                    break;
                case 5:
                    displayInformation();
                    break;
                case 6:
                    saveDataToCSV(personCSVCoder, dietitianCSVCoder, patientsCSVCoder, mealCSVCoder, dietPlanCSVCoder);
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private static void addDietitian(Scanner scanner, CSVCoder<Dietitian> dietitianCSVCoder) {
        // Aquí puedes solicitar información al usuario para crear un nuevo Dietitian
        // Luego, crea una instancia de Dietitian y agrégala a la lista correspondiente
    }

    private static void addPatient(Scanner scanner, CSVCoder<Patients> patientsCSVCoder) {
        // Similar a addDietitian, pero para Patients
    }

    private static void addMeal(Scanner scanner, CSVCoder<Meal> mealCSVCoder) {
        // Similar a addDietitian, pero para Meal
    }

    private static void addDietPlan(Scanner scanner, CSVCoder<DietPlan> dietPlanCSVCoder) {
        // Similar a addDietitian, pero para DietPlan
    }

    private static void displayInformation() {
        // Aquí puedes mostrar información según tus necesidades
    }

    private static void saveDataToCSV(CSVCoder<Person> personCSVCoder,
                                      CSVCoder<Dietitian> dietitianCSVCoder,
                                      CSVCoder<Patients> patientsCSVCoder,
                                      CSVCoder<Meal> mealCSVCoder,
                                      CSVCoder<DietPlan> dietPlanCSVCoder) {
        try {
            personCSVCoder.writeToFile("persons.csv", Person.getPersonList());
            dietitianCSVCoder.writeToFile("dietitians.csv", Dietitian.getDietitianList());
            patientsCSVCoder.writeToFile("patients.csv", Patients.getPatientsList());
            mealCSVCoder.writeToFile("meals.csv", Meal.getMealList());
            dietPlanCSVCoder.writeToFile("dietplans.csv", DietPlan.getDietPlanList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
