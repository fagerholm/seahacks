package seahacks.exception;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ErrorCodeTest {

	@Test
	public void testConstructor() {

		ErrorCode errorCode = new ErrorCode("whatever");

		assertEquals("whatever", errorCode.getErrorCode());
	}

}
