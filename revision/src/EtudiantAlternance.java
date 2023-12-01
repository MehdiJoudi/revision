public class EtudiantAlternance extends Etudiant {

    private double salaire;

    public EtudiantAlternance(int id, String nom, String prenom, double moyenne, double salaire) {
        super(id, nom, prenom, moyenne);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public void ajouterUneAbsence() {
        this.salaire -= 50;
    }

    @Override
    public String toString() {
        return "EtudiantAlternance{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                ", salaire=" + salaire +
                '}';
    }
}
