public class Employe extends Personne{
    public Employe(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public void poserConges(){
        System.out.println("L'employé " + getPrenom() + " " + getNom() + " agé de " +
                getAge() + " ans pose de congés");
    }

    @Override
    public String toString() {
        return "Employe{" + getPrenom() + " " + getNom() + " , " + getAge() + " ans}";
    }


}