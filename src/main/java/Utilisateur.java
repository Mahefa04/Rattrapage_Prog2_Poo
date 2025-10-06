public class Utilisateur {
    private Forme forme;

    public Utilisateur(Forme forme) {
        this.forme = forme;
    }

    public Forme getForme() {
        return forme;
    }

    public int getIdOfUtlisateurInscrit() {
        return Forme.UTILISATEUR_INSCRIT.getId();
    }

    public String getNameOfUtilisateurInscrit() {
        return Forme.UTILISATEUR_INSCRIT.getPrenom();
    }

    public String getIdOfUtilisateurAnonyme() {
        return Forme.UTILISATEUR_ANONYME.getId();
    }
}
