package vpamok2;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class VPShellterTest {

	@Test
	  public void testAssertNotNull() {
	    assertNotNull("should not be null", new OrganicCat(null, null, null, null));
	  }
}
