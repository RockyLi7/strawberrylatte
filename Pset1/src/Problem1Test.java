import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
class Problem1Test {
    /** Evaluates the method gigametertoLightSecond
     * @param gm is the input variable
     * @return the result of the expression after substituting gm
     */
    @org.junit.jupiter.api.Test
    void testsolvemethod() {
        assertAll(
                () -> assertEquals(3.3564, Problem1.gigameterToLightsecond(1), 0.1),
                () -> assertEquals(6.6712, Problem1.gigameterToLightsecond(2), 0.1));
    }
}