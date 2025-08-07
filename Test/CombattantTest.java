package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;  
import UFC.Combat;
import UFC.CombatAmical;
import UFC.CombatTitre;


import UFC.combattant;


class CombattantTest {
    private combattant combattant;

    @BeforeEach
    void setUp() {
        combattant = new combattant("c1", "Doe", "John", "The Beast", 70.5);
    }

    @Test
    void devraitInitialiserAvecValeursCorrectes() {
        assertEquals("c1", combattant.getId());
        assertEquals(0, combattant.getVictoires());
        assertTrue(combattant.getTitres().isEmpty());
    }//

    @Test
    void devraitAjouterVictoireCorrectement() {
        combattant.ajouterVictoire();
        assertEquals(1, combattant.getVictoires());
    }

    @Test
    void devraitAjouterTitreCorrectement() {
        combattant.ajouterTitre("Champion");
        assertEquals(1, combattant.getTitres().size());
        assertEquals("Champion", combattant.getTitres().get(0));
    }
}