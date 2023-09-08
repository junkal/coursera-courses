import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both
 * {@link Demo#main(String[])} and
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
	
	@Test
	public void case_00_invalid_triangle() {
		assertFalse(Demo.isTriangle(0.5, 1, 0.5));
	}

	@Test
	public void case_01_invalid_triangle() {
		assertFalse(Demo.isTriangle(0.5, 0.5, 1));
	}

	@Test
	public void case_02_invalid_triangle() {
		assertFalse(Demo.isTriangle(1, 0.5, 0.5));
	}
	
	@Test
	public void case_03_invalid_triangle() {
		assertFalse(Demo.isTriangle(10, 4, 2));
	}

	@Test
	public void case_04_valid_triangle() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	
	@Test
	public void case_05_valid_triangle() {
		assertTrue(Demo.isTriangle(5, 12, 13));
	}
	
	@Test
	public void case_06_valid_triangle() {
		assertTrue(Demo.isTriangle(5, 13, 12));
	}

	@Test
	public void case_07_valid_triangle() {
		assertTrue(Demo.isTriangle(12, 5, 13));
	}

	@Test
	public void case_08_valid_triangle() {
		assertTrue(Demo.isTriangle(12, 13, 5));
	}
	
	@Test
	public void case_20_invalid_triangle() {
		assertFalse(Demo.isTriangle(5, 7, 13));
	}
	
	@Test
	public void case_21_invalid_triangle() {
		assertFalse(Demo.isTriangle(5, 13, 7));
	}
	
	@Test
	public void case_22_invalid_triangle() {
		assertFalse(Demo.isTriangle(13, 5, 7));
	}

	@Test
	public void case_23_invalid_triangle() {
		assertFalse(Demo.isTriangle(13,7, 5));
	}
	
    @Test
    public void case_24_invalid_triangle() {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void case_25_invalid_triangle() {
        assertFalse(Demo.isTriangle(5, 9, 3));
    }
    
	@Test
	public void case_30_invalid_triangle() {
		assertFalse(Demo.isTriangle(5, 10, -7));
	}
	
	@Test
	public void case_31_invalid_triangle() {
		assertFalse(Demo.isTriangle(5, -10, 7));
	}
	
	@Test
	public void case_32_invalid_triangle() {
		assertFalse(Demo.isTriangle(-5, 10, 7));
	}
	
	@Test
	public void case_40_invalid_triangle() {
		assertFalse(Demo.isTriangle(5, 10, 0));
	}

	@Test
	public void case_41_invalid_triangle() {
		assertFalse(Demo.isTriangle(5, 0, 0));
	}

	@Test
	public void case_42_invalid_triangle() {
		assertFalse(Demo.isTriangle(0, 0, 0));
	}

	@Test
	public void case_50_invalid_triangle() {
		assertFalse(Demo.isTriangle(5.235, 10, 0.6));
	}	
}

/*
    @Test
    public void test_main_program_1() {
        ByteArrayInputStream in = new ByteArrayInputStream("3\n4\n5\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String consoleOutput = "Enter side 1:\n";
        consoleOutput += "Enter side 2:\n";
        consoleOutput += "Enter side 3:\n";
        consoleOutput += "This is a triangle:\n";
        assertEquals(consoleOutput, out.toString());
    }
*/
