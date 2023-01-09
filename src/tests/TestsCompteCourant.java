package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.CompteCourant;
import myPackage.DossierBancaire;

public class TestsCompteCourant {

	@Test
	public void testConstructeur() {
		CompteCourant cc=new CompteCourant(0.0);
		assertEquals(0.0,cc.getSolde(),0.0001); //
	}
	@Test
	public void testDeposer() {
		CompteCourant cc=new CompteCourant(0);
		assertEquals(0,cc.getSolde(),0.0001); //
		cc.deposerC(100);
		assertEquals(100,cc.getSolde(),0);
	}
	

}

