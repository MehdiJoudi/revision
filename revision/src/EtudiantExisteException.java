public class EtudiantExisteException extends Exception {

    public EtudiantExisteException() {
        super("L'étudiant existe déjà.");
    }
}
