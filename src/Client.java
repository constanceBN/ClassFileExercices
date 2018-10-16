// Exercice 1: Ecrire un simple fichier texte.

public class Client {

	// Créer 3 attributs:
	int reference;
	String nom;
	String prenom;

	// Créer 1 constructeur à 3 paramètres:
	public Client(int reference, String nom, String prenom) {
		super();
		this.reference = reference;
		this.nom = nom;
		this.prenom = prenom;
	}

	// Génèrer les 3 acccesseurs (ou Getters) en lecture. Cela veut dire qu'on
	// génère les Getters sans les Setters. /!\ Les mutateurs sont appelés plus
	// communément Settters.
	public int getReference() {
		return reference;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	// Méthode toString()
	@Override
	public String toString() {
		return reference + ":" + prenom + ":" + nom;
	}

}
