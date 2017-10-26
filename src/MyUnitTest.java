import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

class MyUnitTest {

	@Test
	void test() {
		MyUnit myUnit = new MyUnit();
		String result = myUnit.concat("one", "two");
		assertEquals("onetwo", result);
	}
	
	// Example of a test that fails
	@Test
	void failingTest() {
		MyUnit myUnit = new MyUnit();
		int result = myUnit.add(1, 2);
		assertEquals(4, result);
	}
}
