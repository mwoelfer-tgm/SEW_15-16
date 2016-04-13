package dreieck;

/**
 * 
 * @author Martin Wölfer
 * @email mwoelfer01@student.tgm.ac.at
 * @version 2016-04-13
 *
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testIstDreieck {
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;

	@Before
	public void setUp() throws Exception {
		dreieck = new Dreieck(seite_a,seite_b,seite_c);
	}
	
	@Test
	public void testIstDreickSeiteANull(){
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreickSeiteBNull(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreickSeiteCNull(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(0);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreickSeiteAMinus(){
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreickSeiteBMinus(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(-1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreickSeiteCMinus(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(-1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstAPlusBGleichC(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstAPlusCGleichB(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstCPlusBGleichA(){
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@After
	public void tearDown() throws Exception {
	}
}
