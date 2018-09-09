package ST_Proj;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Printtokens2Test {
	Printtokens2 newObj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 newObj = new Printtokens2();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOpen_character_stream() {
		assertNotNull(newObj.open_character_stream("ip.txt"));	//existing file name
		//assertNotNull(newObj.open_character_stream(" "));
		
	}

	@Test
	public void testOpen_token_stream() {
		assertNotNull(newObj.open_character_stream("ip.txt"));	//existing file name
		//assertNotNull(newObj.open_character_stream(""));
	}

	@Test
	public void testGet_token() {
		//fail("Not yet implemented");
	}

	@Test
	public void testIs_token_end() {
		assertTrue(newObj.is_token_end(1,1));
		assertTrue(newObj.is_token_end(1,34));	//34- double quote
		assertFalse(newObj.is_token_end(1,36));	//36 dollar
		assertTrue(newObj.is_token_end(2,10));	//10- new line
		assertFalse(newObj.is_token_end(2,36));	
		assertTrue(newObj.is_token_end(0,40));	//40 special symbol '('
		assertTrue(newObj.is_token_end(0,59));	// 59 is ;
		assertFalse(newObj.is_token_end(0,60));  // 60 < symbol
	}

	@Test
	public void testToken_type() {
		assertEquals(1, newObj.token_type("if"));	//keyword
		assertEquals(2, newObj.token_type("]"));	//special symbol
		assertEquals(2, newObj.token_type("\'a'"));	//identifier
		assertEquals(41, newObj.token_type("123"));	//num_constant
		assertEquals(42, newObj.token_type("\"abc\""));	//string_constant
		assertEquals(43, newObj.token_type("#true"));	//char_constant
		assertEquals(5, newObj.token_type("/comment"));	//comment
		assertEquals(0, newObj.token_type(";comment"));	//error
	}

	@Test
	public void testPrint_token() {
		//assertTrue(newObj.is_comment("/comment"));

	}

	@Test
	public void testIs_comment() {
		assertTrue(newObj.is_comment("/comment"));	//a comment
		assertFalse(newObj.is_comment("true"));		// not starting with /
	}

	@Test
	public void testIs_keyword() {
		assertTrue(newObj.is_keyword("and"));	//should be a keyword
		assertFalse(newObj.is_keyword("true"));	//not a keyword
	}

	@Test
	public void testIs_char_constant() {
		assertTrue(newObj.is_char_constant("#true"));	//start with # then char
		assertFalse(newObj.is_char_constant("true"));	//other wise false
	}

	@Test
	public void testIs_num_constant() {
		assertTrue(newObj.is_num_constant("123"));	//should be a number sequence
		assertFalse(newObj.is_num_constant("1a1"));	//not a num seq so false
		assertFalse(newObj.is_num_constant("true"));//not a num sequence
	}

	@Test
	public void testIs_str_constant() {
		assertTrue(newObj.is_str_constant("\"abc\""));	//starts and ends with "
		assertTrue(newObj.is_str_constant("\"1a1"));	//starts with a double quote
		assertFalse(newObj.is_str_constant("true"));	//no double quotes 
	}

	@Test
	public void testIs_identifier() {
		assertTrue(newObj.is_num_constant("123"));	//input number or chars combo
		assertFalse(newObj.is_num_constant("$"));	//should not start or have special symbols
		assertFalse(newObj.is_num_constant("true$false")); //should not have special symbols
	}

//	@Test
//	public void testUnget_error() {	CAN BE IGNORED
//	fail("Not yet implemented");
//	}

	@Test
	public void testPrint_spec_symbol() {
		 
	}

	@Test
	public void testIs_spec_symbol() {
		assertTrue(newObj.is_spec_symbol('('));
		assertTrue(newObj.is_spec_symbol(')'));
		assertTrue(newObj.is_spec_symbol('['));
		assertTrue(newObj.is_spec_symbol(']'));
		assertTrue(newObj.is_spec_symbol('\''));
		assertTrue(newObj.is_spec_symbol('`'));
		assertTrue(newObj.is_spec_symbol(','));
	}
}
