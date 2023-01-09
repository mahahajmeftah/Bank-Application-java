package myPackage;

public class CompteEpargne extends CompteBancaire {
	 private static final double INTEREST_RATE = 3.2;

	public CompteEpargne(double solde) {
		super(solde);
		// TODO Auto-generated constructor stub
	}
	 

	    public void deposerE(double valeur) {
	    	 setSolde(getSolde()+valeur);
	    }

	    public void renumererE() {
	    	setSolde(getSolde()+getSolde()*(INTEREST_RATE / 100));
	    }
}
