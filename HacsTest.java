package hacs;

import java.io.IOException;

import org.
junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HacsTest {

	Hacs hacs = new Hacs();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testHacs() {
		//constructor	
		System.out.println("assignment object created.");
	}

	@Test
	final void testMain() throws IOException {
		
		
		Hacs.main(new String[] {});
		   /** System.out.println("main");
		    String[] args = null;
		    final java.io.InputStream original = System.in;
		    final FileInputStream fips = new FileInputStream(new File('C:\\Users\\ngjain\\eclipse-workspace\\HacsAssignment\\src\\hacs\\Hacs.java'));
		    System.setIn(fips);
		    Hacs.main(args);
		    System.setIn(original);**/
		}
	}

