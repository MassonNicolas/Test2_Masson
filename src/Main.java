
public class Main {
	
	   public static void main(String[] args) {
	   
		   Serveur serv = Serveur.getInstance();
		 
		   

		   		  //prend un objet de la classe piano et appel la methode ajout_musicien
			      Musicien piano =   serv.getMusicien("Piano");

			      piano.ajout_musicien();

			      //prend un objet de la classe violin et appel la methode ajout_musicien
			      Musicien violin = serv.getMusicien("Violin");

			      violin.ajout_musicien();

			      //prend un objet de la classe trumpet et appel la methode ajout_musicien
			      Musicien trumpet = serv.getMusicien("Trumpet");

			      trumpet.ajout_musicien();
		   
	   }

}
