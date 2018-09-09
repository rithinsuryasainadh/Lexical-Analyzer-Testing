package ST_Proj;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.omg.CORBA.portable.InputStream;

public class Printtokens2MainMethodTest {

	@Test
	public void testMain() throws FileNotFoundException {
		//fail("Not yet implemented"); // TODO
	    String[] args = null;
	    final java.io.InputStream original = System.in;
	    final FileInputStream fips = new FileInputStream("ip.txt");
	    System.setIn(fips);
	    try {
			Printtokens2..main(new String[] {"ip.txt"});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.setIn(original);
	}

}
