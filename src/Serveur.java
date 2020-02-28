
public class Serveur {
	
		//creation d un objet de serveur
	   private static Serveur instance = new Serveur ();
	   
	   //on le rend prive
	   private Serveur () {
	   
	   }
	   // on recupere le seul objet disponnible
	   public static Serveur getInstance() {
		   
		   return instance;
	   }
	   
	   //ajout des musiciens
		public Musicien getMusicien(String instrument) {
			
			if (instrument == null) {
			return null;
		}
			//permet d ajouter un pianiste
			if (instrument.equalsIgnoreCase("Piano")) {
				return new Piano();
			}
			//permet d ajouter un violoniste
			else if (instrument.equalsIgnoreCase("Violin")) {
				return new Violin();
				
			}
			// permet d ajouter un trompettiste
			else if (instrument.equalsIgnoreCase("Trumpet")) {
				return new Trumpet();
			}
		return null;
		}

}
