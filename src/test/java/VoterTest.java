import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoterTest {

    @Test
    void testEligibleVoter() {
        Voter v = new Voter("Raj", 25, "Indian", true);
        assertEquals("Eligible to vote!", v.checkEligibility());
    }

    @Test
    void testUnderageVoter() {
        Voter v = new Voter("Sara", 17, "Indian", true);
        assertEquals("Ineligible: Underage (Must be 18+).", v.checkEligibility());
    }

    @Test
    void testForeignCitizen() {
        Voter v = new Voter("John", 30, "Canadian", true);
        assertEquals("Ineligible: Not an Indian citizen.", v.checkEligibility());
    }

    @Test
    void testInvalidID() {
        Voter v = new Voter("Ali", 22, "Indian", false);
        assertEquals("Ineligible: Voter ID is invalid or missing.", v.checkEligibility());
    }
}