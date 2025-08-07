package UFC;

import java.time.LocalDate;

public class CombatAmical extends Combat {
    public CombatAmical(String id, LocalDate date, String lieu, combattant combattant1, combattant combattant2) {
        super(id, date, lieu, combattant1, combattant2);
    }

    @Override
    public void terminer() {
        super.terminer();
        
    }
}