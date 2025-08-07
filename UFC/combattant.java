package UFC;

import java.util.ArrayList;
import java.util.List;

public class combattant {
    private final String id;
    private final String nom;
    private final String prenom;
    private final String surnom;
    private final double poids;
    private int victoires;
    private int defaites;
    private int egalites;
    private List<String> titres;

    public combattant(String id, String nom, String prenom, String surnom, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.surnom = surnom;
        this.poids = poids;
        this.victoires = 0;
        this.defaites = 0;
        this.egalites = 0;
        this.titres = new ArrayList<>();
    }

    public void ajouterVictoire() {
        victoires++;
    }

    public void ajouterDefaite() {
        defaites++;
    }

    public void ajouterEgalite() {
        egalites++;
    }

    public void ajouterTitre(String titre) {
        titres.add(titre);
    }

    // Getters
    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getSurnom() { return surnom; }
    public double getPoids() { return poids; }
    public int getVictoires() { return victoires; }
    public int getDefaites() { return defaites; }
    public int getEgalites() { return egalites; }
    public List<String> getTitres() { return titres; }

    @Override
    public String toString() {
        return surnom + " (" + prenom + " " + nom + ")";
    }
}