public class Etudiant3eme extends Etudiant {

    public Etudiant3eme(int id, String nom, String prenom, double moyenne) {
        super(id, nom, prenom, moyenne);
    }

    @Override
    public void ajouterUneAbsence() {
        this.moyenne -= 0.5;
    }
}
