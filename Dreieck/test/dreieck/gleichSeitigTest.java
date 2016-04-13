package dreieck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class gleichSeitigTest {
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;

	@Before
	public void setUp() throws Exception {
		dreieck = new Dreieck(seite_a,seite_b,seite_c);
	}


	@Test
	public void testGleichSeitig() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.gleichSeitig());
	}
	
	
	
	@Test
	public void testNichtGleichSeitig() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void testSeitenGleichAusserA() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void testSeitenGleichAusserB() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void testSeitenGleichAusserC() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void testSeitenGleichKeinDreieck() {
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(-1);
		dreieck.setSeite_c(-1);
		
		assertFalse(dreieck.gleichSeitig());
	}

}
