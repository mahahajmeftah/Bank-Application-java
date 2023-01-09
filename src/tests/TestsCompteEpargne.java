package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.CompteCourant;
import myPackage.CompteEpargne;

public class TestsCompteEpargne {
	@Test
	public void testConstructeur() {
		CompteEpargne cc=new CompteEpargne(0.0);
		assertEquals(0.0,cc.getSolde(),0.0001); //
	}

	@Test
    public void testDeposerE() {
		
        CompteEpargne compte = new CompteEpargne(0);
        compte.deposerE(10);
        assertEquals(10, compte.getSolde(),0.001);
    }
	@Test
    public void testRenumererE() {
        CompteEpargne compte = new CompteEpargne(100);
        compte.renumererE();
        assertEquals(103.2, compte.getSolde(), 0.01);
    }


}
