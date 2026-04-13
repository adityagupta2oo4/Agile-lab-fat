import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoterTest {
    @Test
    void testEligibility() {
        Voter v = new Voter("Amit", 20, "Indian", true);
        assertEquals("Eligible to vote.", v.checkEligibility());
    }
}