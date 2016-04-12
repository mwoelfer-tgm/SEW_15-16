/*
 * @Author Wölfer
 * @Version 2016-04-11
 */

package Woelfer;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringTokenizerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNextTokenWithSpaceDelimeter() {
		StringTokenizer st = new StringTokenizer("This is a test");
		assertEquals("This",st.nextToken());
	}

	
	@Test
	public void testNextTokenWithTabulatorDelimeter() {
		StringTokenizer st = new StringTokenizer("This\tis\ta\ttest");
		assertEquals("This",st.nextToken());
	}
	
	@Test
	public void testNextTokenWithNewLineDelimeter() {
		StringTokenizer st = new StringTokenizer("This\nis\na\ntest");
		assertEquals("This",st.nextToken());
	}
	
	@Test
	public void testNextTokenWithCarriageDelimeter() {
		StringTokenizer st = new StringTokenizer("This\ris\ra\rtest");
		assertEquals("This",st.nextToken());
	}
	
	@Test
	public void testNextTokenWithFormFeedDelimeter() {
		StringTokenizer st = new StringTokenizer("This\fis\fa\ftest");
		assertEquals("This",st.nextToken());
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testNextTokenWithoutExistingToken() {
		StringTokenizer st = new StringTokenizer("");
		st.nextToken();
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testTokenWithOnlyDelimiters(){
		StringTokenizer st = new StringTokenizer(" \t\n\r\f");
		st.nextToken();
	}
	
	@Test
	public void testCountTokenWithNoToken(){
		StringTokenizer st = new StringTokenizer("");
		assertEquals(0,st.countTokens());
	}
	
	@Test
	public void testCountToken(){
		StringTokenizer st = new StringTokenizer("This is a test");
		assertEquals(4,st.countTokens());
	}
}
