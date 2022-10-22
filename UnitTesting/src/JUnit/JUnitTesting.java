package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTesting {
	@Test
	public void nameTest() {
		String expectedName="Cat Joe";
		assertEquals(expectedName, Animals.Zoo[0].toString());
	}
	
}
