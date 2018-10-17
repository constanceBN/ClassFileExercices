import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Exercice 1: Ecrire un simple fichier texte.

public class WFichierClient {

	// Créer un constructeur par défaut.
	public WFichierClient() {

	}

	// Créer une méthode qui devra écrire un tableau de "Client" dans un fichier
	// myFile.
	public static void ecrire(Client[] myClients, String myFile) throws IOException {
		FileWriter fw = new FileWriter(myFile);
		BufferedWriter bw = new BufferedWriter(fw);

		for (Client objectClient : myClients) {
			bw.write(objectClient.toString() + "\n");
		}

		bw.close();

	}

	// Créer un tableau de trois objets (array de type Client) et les écrire dans un
	// fichier clients.txt
	public static void main(String[] args) {
		// Créer 3 instances de la classe Client.
		Client client1 = new Client(1, "Dupond", "Maurice");
		Client client2 = new Client(2, "Dupont", "Jean-Pierre");
		Client client3 = new Client(3, "Morin", "Stéphanie");

		Client[] tableauClient = new Client[3];
		tableauClient[0] = client1;
		tableauClient[1] = client2;
		tableauClient[2] = client3;

		File fichierClients = new File("clients.txt");

		try {
			fichierClients.createNewFile();
			ecrire(tableauClient, fichierClients.getAbsolutePath()); // Exemple avec le chemin relatif:
																		// ecrire(tableauClient, "clients.txt");

			for (Client objectClient : RFichierClient.lire(fichierClients.getAbsolutePath())) {
				System.out.println(objectClient);
			}
  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
