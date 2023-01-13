package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsDossierBancaire {
	 

	
	 @Test
		public void testConstructeur() 
		{
			DossierBancaire dossier=new DossierBancaire();
			
			assertEquals(0,dossier.get_solde(),0.0001); //voir documentation en ligne sur assertions Junit 
		}
	 @Test
	public void testDeposer() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100,dossier.get_solde(),0); //voir documentation en ligne sur assertions Junit 
	}
	 @Test
		public void testRenumerer() 
		{
			DossierBancaire dossier=new DossierBancaire();
			dossier.deposer(100);			
			dossier.remunerer();
			double solde_expected = 101.92;
			System.out.println(dossier.get_solde());
			assertEquals(solde_expected,dossier.get_solde(),0.001); //voir documentation en ligne sur assertions Junit 
		}
	 
	 @Test
		public void testRetirerSuccess() throws Exception {
		 DossierBancaire dossier=new DossierBancaire();
			dossier.deposer(50);
			dossier.retirer(50*0.4);
			assertEquals(30, dossier.get_solde(), 0.00);
			
			
		}
	 @Test
		public void testRetirerInsufficientFunds() throws Exception {
		 DossierBancaire dossier=new DossierBancaire();	
			dossier.retirer(200);
			Exception exception = assertThrows(Exception.class, () -> dossier.retirer(200));
			assertEquals("Insufficient funds", exception.getMessage());
		
		}
	

}
