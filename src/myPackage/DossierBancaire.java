package myPackage;

public class DossierBancaire {
	private CompteCourant cc;
	private CompteEpargne ep;
	private double m_solde;
	
	
	//Constructeur
    public DossierBancaire()
    {
    	m_solde=0;
    	cc =new CompteCourant(m_solde);
    	ep = new CompteEpargne(m_solde); 
    }
//deposeer 
    public void deposer(double value) {
    	cc.deposerC(value*0.4);
    	ep.deposerE(value*0.6);
    	m_solde+=value;
    	}
    public double get_solde() {
    	return cc.getSolde()+ep.getSolde() ;
    	}
    public void remunerer() {
    	
    	ep.renumererE();
    	
    }
	
    
}
