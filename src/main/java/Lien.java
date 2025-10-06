public class Lien {
    private Utilisateur utilisateur;
    private Message messages;

    public Lien(Utilisateur utilisateur, Message messages) {
        this.utilisateur = utilisateur;
        this.messages = messages;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Message getMessages() {
        return messages;
    }
}
