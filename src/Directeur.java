import java.util.HashMap;
import java.util.Map;

public class Directeur extends Employe{

    private Map<String, Employe> employes;

    public Directeur(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.employes = new HashMap<>();
    }

    public void addEmploye(Employe e) {
        String key = e.getPrenom() + e.getNom() + e.getAge(); // Créer une clé unique
        if (!employes.containsKey(key)) { // Vérifier si la clé existe déjà
            employes.put(key, e);
            System.out.println("Nouveau employé : " + e.getPrenom() + " " + e.getNom());
        } else {
            System.out.println("L'employé : " + e.getPrenom() + " " + e.getNom() + " existe déjà");
        }

    }
    public void showEmployes() {
        System.out.println("\nListe de nouveaux employés ajoutés par " + getNom() + " sont :");
        for (Employe e : employes.values()) {
            System.out.println("* " + e.getPrenom() + " " + e.getNom() + ", " + e.getAge() + " ans");
        }
    }


    @Override
    public void poserConges() {
        System.out.println("Le directeur " + getPrenom() + " " + getNom() +
                " agé de " + getAge() + " ans pose de congés");
    }
}