package vpamok2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VPShelterAppTest {

	@Test
	public void testAssertNotSame() {
		assertNotSame("should not be same Object", new VirtPet("Albie", "happy", "robotic", "dog"), new VirtPet("Lewis", "nervous", "robotic", "cat"), new VirtPet("Jax", "shy", "organic", "cat"), new VirtPet("Gonzo", "loud", "organic", "dog"));
	}

	private void assertNotSame(String string, VirtPet virtPet, VirtPet virtPet2, VirtPet virtPet3, VirtPet virtPet4) {
	
		
	}

}
