import java.util.ArrayList;

public class Ecole {

    private String nom;
    private ArrayList<Etudiant> etudiants;

    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants = new ArrayList<Etudiant>(500);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public boolean ajouterEtudiant(Etudiant e) throws EtudiantExisteException {
        if (this.etudiants.contains(e)) {
            throw new EtudiantExisteException();
        }
        return false;
    }}
