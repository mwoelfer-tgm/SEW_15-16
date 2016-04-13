package dreieck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class gleichSchenkeligTest {
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;

	@Before
	public void setUp() throws Exception {
		dreieck = new Dreieck(seite_a,seite_b,seite_c);
	}
	@Test
	public void testKeinDreieck() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void testKeinGleichSchenkeligesDreieck() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.gleichSchenkelig());
	}


	@Test
	public void testAPlusBGleich() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void testAPlusCGleich() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(2);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void testBPlusCGleich() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void testANichtC() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(4);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
}
