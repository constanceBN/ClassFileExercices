
public class Client {

	int reference;
	String nom;
	String prenom;

	// Constructor
	public Client(int reference, String nom, String prenom) {
		super();
		this.reference = reference;
		this.nom = nom;
		this.prenom = prenom;
	}

	// Getters
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
