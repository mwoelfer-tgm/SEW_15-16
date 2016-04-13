package dreieck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class rechtWinkeligTest {
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() throws Exception {
		dreieck = new Dreieck(seite_a,seite_b,seite_c);
	}

	@Test
	public void testIstKeinDreieck() {
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testIstAGroesserBKleinerC() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(6);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testIstAGroesste() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testIstBGroesste() {
		dreieck.setSeite_a(4);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testIstCGroesste() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(5);
		
		assertTrue(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testIstGleichSeitig() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(5);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testIstNichtRechtWinkelig() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(4);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testIstCGroesserBKleinerA() {
		dreieck.setSeite_a(6);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(6);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
}
