package dreieck;

/**
 * 
 * @author Martin W�lfer
 * @email mwoelfer01@student.tgm.ac.at
 * @version 2016-04-13
 *
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIstDreieck {
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
	

	@Test
	public void testIstAPlusBMinus(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(Integer.MAX_VALUE);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstBPlusCMinus(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(Integer.MAX_VALUE);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstAPlusCMinus(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(Integer.MAX_VALUE-1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstAPlusBKleinerC(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(5);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstAPlusCKleinerB(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstBPlusCKleinerA(){
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreieckTrue(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.istDreieck());
	}
	
	@After
	public void tearDown() throws Exception {
	}
}
