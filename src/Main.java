public class Main {
    public static void main(String[] args){
        Employe employe = new Employe("Hamdi", "Ali", 32);
        System.out.println(employe);
        employe.poserConges();

        Directeur directeur = new Directeur("Koffi", "Stephane", 42);
        System.out.println(directeur);
        directeur.poserConges();

        // Ajout d'employés par le directeur
        directeur.addEmploye(new Employe("Ben Ali", "Myriam", 24));
        directeur.addEmploye(new Employe("Mejri", "Ahmed", 30));
        directeur.addEmploye(new Employe("Diallo", "Ameline", 28));

        //afficher les employés
        directeur.showEmployes();
    }
}