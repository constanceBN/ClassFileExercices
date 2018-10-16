import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WFichierClient {

	public static void ecrire(Client[] myClients, String myFile) throws IOException {
		FileWriter fw = new FileWriter(myFile);
		BufferedWriter bw = new BufferedWriter(fw);

		for (Client client : myClients) {
			bw.write(client.toString() + "\n");
		}

		bw.close();

	}

	public static void main(String[] args) {
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
			ecrire(tableauClient, fichierClients.getAbsolutePath()); // ecrire(tableauClient, "clients.txt"), exemple avec le chemin relatif.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}