package seahacks.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SystemExceptionTest {
	
	@Test
	public void testThrowableConstructor(){
		
		SystemException sysEx = new SystemException(new IllegalArgumentException("whatever"));
		
		assertNotNull(sysEx.getCause());
		assertEquals("whatever", sysEx.getCause().getMessage());
		assertEquals("whatever", sysEx.getMessage());
		assertNull(sysEx.getErrorCode());
	}
	
	@Test
	public void testErrorCodeConstructor(){
		
		SystemException sysEx = new SystemException(new ErrorCode("whatever"));
		
		assertNotNull(sysEx.getErrorCode());
		assertEquals("whatever", sysEx.getErrorCode().getErrorCode());
		assertNull(sysEx.getMessage());
		assertNull(sysEx.getCause());
	}
	
	@Test
	public void testErrorCodeAndThrowableConstructor(){
		
		SystemException sysEx = new SystemException(new ErrorCode("whateverCode"), new IllegalArgumentException("whateverThrowable"));
				
		assertNotNull(sysEx.getCause());
		assertEquals("whateverThrowable", sysEx.getCause().getMessage());
		assertEquals("whateverThrowable", sysEx.getMessage());
		assertNotNull(sysEx.getErrorCode());
		assertEquals("whateverCode", sysEx.getErrorCode().getErrorCode());
	}

	
	@Test
	public void testErrorCodeAndMessageAndThrowableConstructor(){
		
		SystemException sysEx = new SystemException(new ErrorCode("whateverCode"), "whateverMessage", new IllegalArgumentException("whateverThrowable"));
				
		assertNotNull(sysEx.getCause());
		assertEquals("whateverThrowable", sysEx.getCause().getMessage());
		assertEquals("whateverMessage", sysEx.getMessage());
		assertNotNull(sysEx.getErrorCode());
		assertEquals("whateverCode", sysEx.getErrorCode().getErrorCode());
	}

	
	@Test
	public void testMessageAndThrowableConstructor(){
		
		SystemException sysEx = new SystemException("whateverMessage", new IllegalArgumentException("whateverThrowable"));
				
		assertNotNull(sysEx.getCause());
		assertEquals("whateverThrowable", sysEx.getCause().getMessage());
		assertEquals("whateverMessage", sysEx.getMessage());
		assertNull(sysEx.getErrorCode());
	}


	@Test
	public void testMessageConstructor(){
		
		SystemException sysEx = new SystemException("whateverMessage");
				
		assertNull(sysEx.getCause());
		assertEquals("whateverMessage", sysEx.getMessage());
		assertNull(sysEx.getErrorCode());
	}

}
