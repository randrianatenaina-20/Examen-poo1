package UFC;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       
        
        
        combattant mcgregor = new combattant("mcgregor", "McGregor", "Conor", "The Notorious", 70);
        combattant khabib = new combattant("khabib", "Nurmagomedov", "Khabib", "The Eagle", 70);
        
        UFC.ajouterCombattant(mcgregor);
        UFC.ajouterCombattant(khabib);
        
    
        CombatTitre combat = UFC.creerCombatTitre(
            "ufc229",
            LocalDate.of(2018, 10, 6),
            "Las Vegas",
            "mcgregor",
            "khabib",
            "Champion Poids Léger UFC"
        );
        
    
        combat.ajouterPoints(mcgregor, 8);
        combat.ajouterPoints(khabib, 10);
        combat.terminer();
        
    
        System.out.println("Vainqueur: " + combat.getVainqueur().getSurnom());
        System.out.println("Titres de Khabib: " + khabib.getTitres());
        System.out.printf("Palmarès de McGregor: %dV-%dD-%dE%n", 
            mcgregor.getVictoires(), mcgregor.getDefaites(), mcgregor.getEgalites());
    }
    
}