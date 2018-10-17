import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Exercice 2: Lire un simple fichier texte.

public class RFichierClient {

	public static int compterLignes(BufferedReader br) throws IOException {
		// Premet de stocker le contenu de chaque ligne.
		String line;

		// Permet de stocker le nombre de ligne.
		int nbLines = 0;

		// On parcourt le fichier pour connaître le nombre de lignes afin de définir la
		// taille du tableau.
		while ((line = br.readLine()) != null) {
			nbLines++;
		}
		br.close();
		return nbLines;
	}

	// Créer une méthode qui devra lire un tableau de "Client" dans un fichier
	// myFile.
	public static Client[] lire(String myFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File(myFile)));

		// Déclarer un tableau de "Client" avec pour taille le retour de la méthode
		// compterLignes() (c'est à dire, le nombre de lignes de mon fichier).
		Client[] tableauClient = new Client[compterLignes(br)];
    
		br = new BufferedReader(new FileReader(new File(myFile)));
		String line;
		int i = 0;
		while ((line = br.readLine()) != null) {

			// On découpe la ligne en substring grace au caractère ':' chaque substring est
			// utilisée en argument du constructeur de la classe Client.
			tableauClient[i] = new Client(
					// Argument 1: Reference.
					Integer.parseInt(line.substring(0, line.indexOf(':'))),
					// Argument 2: Nom.
					line.substring(line.indexOf(':') +1, line.lastIndexOf(':')),
					// Argument 3: Prenom.
					line.substring(line.lastIndexOf(':') +1, line.length()));
			i++;
		}
		return tableauClient;

	}

}
