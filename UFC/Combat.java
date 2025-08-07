package UFC;

import java.time.LocalDate;

public class Combat {
    private final String id;
    private final LocalDate date;
    private final String lieu;
    private final combattant combattant1;
    private final combattant combattant2;
    private int pointsCombattant1;
    private int pointsCombattant2;
    private boolean estTermine;
    private combattant vainqueur;
    private boolean estEgalite;

    public Combat(String id, LocalDate date, String lieu, combattant combattant1, combattant combattant2) {
        this.id = id;
        this.date = date;
        this.lieu = lieu;
        this.combattant1 = combattant1;
        this.combattant2 = combattant2;
        this.pointsCombattant1 = 0;
        this.pointsCombattant2 = 0;
        this.estTermine = false;
        this.vainqueur = null;
        this.estEgalite = false;
    }

    public void ajouterPoints(combattant combattant, int points) {
        if (combattant.equals(combattant1)) {
            pointsCombattant1 += points;
        } else if (combattant.equals(combattant2)) {
            pointsCombattant2 += points;
        } else {
            throw new IllegalArgumentException("Le combattant ne participe pas à ce combat");
        }
    }

    public void terminer() {
        if (estTermine) return;

        estTermine = true;

        if (pointsCombattant1 > pointsCombattant2) {
            vainqueur = combattant1;
        } else if (pointsCombattant2 > pointsCombattant1) {
            vainqueur = combattant2;
        } else {
            estEgalite = true;
        }
    }

    public String getId() { return id; }
    public LocalDate getDate() { return date; }
    public String getLieu() { return lieu; }
    public combattant getCombattant1() { return combattant1; }
    public combattant getCombattant2() { return combattant2; }
    public int getPointsCombattant1() { return pointsCombattant1; }
    public int getPointsCombattant2() { return pointsCombattant2; }
    public boolean estTermine() { return estTermine; }
    public combattant getVainqueur() { return vainqueur; }
    public boolean estEgalite() { return estEgalite; }
}