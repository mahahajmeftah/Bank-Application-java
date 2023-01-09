package myPackage;

public class CompteCourant extends CompteBancaire {

		public CompteCourant(double solde) {
		super(solde);
		// TODO Auto-generated constructor stub
	}

		public void deposerC(double valeur) {
	        setSolde(getSolde()+valeur);
	    }


	    
}
