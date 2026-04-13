import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Voting Eligibility Checker ===");
        
        System.out.print("Enter Voter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Citizenship (e.g., Indian): ");
        String citizen = scanner.next();

        System.out.print("Does the voter have a valid ID? (true/false): ");
        boolean idStatus = scanner.nextBoolean();

    
        Voter person = new Voter(name, age, citizen, idStatus);

        // Print the final result
        System.out.println("\n--- Result for " + person.getName() + " ---");
        System.out.println(person.checkEligibility());

        scanner.close();
    }
}