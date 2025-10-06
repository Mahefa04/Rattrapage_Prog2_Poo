import java.time.LocalDateTime;

public class Message {
    private String composant;
    private LocalDateTime dateEtHeureDeCreation;
    private Type type;
    private Utilisateur utilisateur;

    public Message(String composant, LocalDateTime dateEtHeureDeCreation, Type type, Utilisateur utilisateur) {
        this.composant = composant;
        this.dateEtHeureDeCreation = LocalDateTime.now();
        this.type = type;
        this.utilisateur = utilisateur;
    }

    public String getComposant() {
        return composant;
    }

    public LocalDateTime getDateEtHeureDeCreation() {
        return dateEtHeureDeCreation;
    }

    public Type getType() {
        return type;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
}
