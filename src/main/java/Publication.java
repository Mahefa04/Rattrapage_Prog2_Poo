public class Publication {
    private int id;
    private static Lien lien;

    public Publication(Lien lien, int id) {
        this.lien = lien;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Lien getLien() {
        return lien;
    }

    public static String trouverLAuteurDeLaPublication () {
        if (Forme.UTILISATEUR_INSCRIT.getPrenom().equals(lien.getUtilisateur().getNameOfUtilisateurInscrit().)) {
            return Forme.UTILISATEUR_INSCRIT.getPrenom().;
        }
    }


}
