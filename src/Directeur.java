import java.util.ArrayList;
import java.util.List;

public class Directeur extends Employe{

    private List<Employe> employes;  // Liste d'employés

    public Directeur(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.employes = new ArrayList<>(); // Initialiser la liste
    }

    public void addEmploye(Employe e) {
        employes.add(e); // Ajout simple sans contrôle
        System.out.println("Nouveau employé : " + e.getPrenom() + " " + e.getNom());
    }
    public void showEmployes() {
        System.out.println("\nListe de nouveaux employés ajoutés par " + getNom() + " sont :");
        for (Employe e : employes) {
            System.out.println("* " + e.getPrenom() + " " + e.getNom() + ", " + e.getAge() + " ans");
        }
    }


    @Override
    public void poserConges() {
        System.out.println("Le directeur " + getPrenom() + " " + getNom() +
                " agé de " + getAge() + " ans pose de congés" );
    }
}