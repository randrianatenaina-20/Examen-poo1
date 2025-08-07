package UFC;

import java.time.LocalDate;

public class CombatTitre extends Combat {
    private final String titre;

    public CombatTitre(String id, LocalDate date, String lieu, combattant combattant1, combattant combattant2, String titre) {
        super(id, date, lieu, combattant1, combattant2);
        this.titre = titre;
    }

    @Override
    public void terminer() {
        super.terminer();

        if (estEgalite()) {
            getCombattant1().ajouterEgalite();
            getCombattant2().ajouterEgalite();
        } else if (getVainqueur() != null) {
            getVainqueur().ajouterVictoire();
            getVainqueur().ajouterTitre(titre);
            
            if (getVainqueur().equals(getCombattant1())) {
                getCombattant2().ajouterDefaite();
            } else {
                getCombattant1().ajouterDefaite();
            }
        }
    }

    public String getTitre() {
        return titre;
    }
}