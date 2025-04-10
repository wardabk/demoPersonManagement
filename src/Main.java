public class Main {
    public static void main(String[] args){
        Employe employe = new Employe("Hamdi", "Ali", 32);
        System.out.println(employe);
        employe.poserConges();

        Directeur directeur = new Directeur("Koffi", "Stephane", 42);
        System.out.println(directeur);
        directeur.poserConges();


        Employe employe1 = new Employe("Ben Ali", "Myriam", 24);
        Employe employe2 = new Employe("Mejri", "Ahmed", 30);
        Employe employe3 = new Employe("Ben Ali", "Myriam", 24);

        // Ajout d'employés par le directeur
        directeur.addEmploye(employe1);
        directeur.addEmploye(employe2);
        directeur.addEmploye(employe3);

        //afficher les employés
        directeur.showEmployes();
    }
}
