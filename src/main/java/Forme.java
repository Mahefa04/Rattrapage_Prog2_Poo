public enum Forme {
    public class UTILISATEUR_INSCRIT {
            private static int id;
            private static String prenom;
            private static String nom;
            private static String email;

        public UTILISATEUR_INSCRIT(int id, String prenom, String nom, String email) {
            this.id = id;
            this.prenom = prenom;
            this.nom = nom;
            this.email = email;
        }

        public static int getId() {
            return id;
        }

        public static String getPrenom() {
            return prenom;
        }

        public static String getNom() {
            return nom;
        }

        public static String getEmail() {
            return email;
        }
    },

    public class UTILISATEUR_ANONYME {
        private static String id;

        public UTILISATEUR_ANONYME(String id) {
            this.id = id;
        }

        public static String getId() {
            return id;
        }
    }
}
