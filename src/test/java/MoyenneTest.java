import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoyenneTest {

    @Test
    void calculeLaMoyenne() {
        assertEquals(12.0, Moyenne.calculer(new double[]{10, 12, 14}), 0.001);
    }

    @Test
    void listeVideDonneZero() {
        assertEquals(0.0, Moyenne.calculer(new double[]{}), 0.001);
    }

    @Test
    void dixEstAdmis() {
        assertEquals("Admis", Moyenne.mention(10));
    }

    @Test
    void neufVirguleCinqEstRefuse() {
        assertEquals("Refuse", Moyenne.mention(9.5));
    }
}
