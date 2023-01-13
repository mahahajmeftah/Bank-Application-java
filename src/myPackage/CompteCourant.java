package myPackage;

public class CompteCourant extends CompteBancaire {

		public CompteCourant(double solde) {
		super(solde);
		// TODO Auto-generated constructor stub
	}

		public void deposerC(double valeur) {
	        setSolde(getSolde()+valeur);
	    }
		
		public void retirerC(double valeur) throws Exception {
			if (valeur > getSolde()) {
				throw new Exception("Insufficient funds");
			}
			setSolde(getSolde() - valeur);
		

			
		}


	    
}
