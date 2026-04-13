public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private boolean hasValidID;

    // Constructor: Initializes the voter details
    public Voter(String name, int age, String citizenship, boolean hasValidID) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.hasValidID = hasValidID;
    }

    // Business Logic: Determines eligibility and returns the specific reason if ineligible
    public String checkEligibility() {
        if (age < 18) {
            return "Ineligible: Underage (Must be 18+).";
        }
        if (!citizenship.equalsIgnoreCase("Indian")) {
            return "Ineligible: Not an Indian citizen.";
        }
        if (!hasValidID) {
            return "Ineligible: Voter ID is invalid or missing.";
        }
        return "Eligible to vote!";
    }

    public String getName() { return name; }
}