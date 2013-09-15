package seahacks.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;


public class ApplicationExceptionTest {
	
	@Test
	public void testThrowableConstructor(){
		
		ApplicationException appEx = new ApplicationException(new IllegalArgumentException("whatever"));
		
		assertNotNull(appEx.getCause());
		assertEquals("whatever", appEx.getCause().getMessage());
		assertEquals("whatever", appEx.getMessage());
		assertNull(appEx.getErrorCode());
	}
	
	@Test
	public void testErrorCodeConstructor(){
		
		ApplicationException appEx = new ApplicationException(new ErrorCode("whatever"));
		
		assertNotNull(appEx.getErrorCode());
		assertEquals("whatever", appEx.getErrorCode().getErrorCode());
		assertNull(appEx.getMessage());
		assertNull(appEx.getCause());
	}
	
	@Test
	public void testErrorCodeAndThrowableConstructor(){
		
		ApplicationException appEx = new ApplicationException(new ErrorCode("whateverCode"), new IllegalArgumentException("whateverThrowable"));
				
		assertNotNull(appEx.getCause());
		assertEquals("whateverThrowable", appEx.getCause().getMessage());
		assertEquals("whateverThrowable", appEx.getMessage());
		assertNotNull(appEx.getErrorCode());
		assertEquals("whateverCode", appEx.getErrorCode().getErrorCode());
	}

	
	@Test
	public void testErrorCodeAndMessageAndThrowableConstructor(){
		
		ApplicationException appEx = new ApplicationException(new ErrorCode("whateverCode"), "whateverMessage", new IllegalArgumentException("whateverThrowable"));
				
		assertNotNull(appEx.getCause());
		assertEquals("whateverThrowable", appEx.getCause().getMessage());
		assertEquals("whateverMessage", appEx.getMessage());
		assertNotNull(appEx.getErrorCode());
		assertEquals("whateverCode", appEx.getErrorCode().getErrorCode());
	}

	
	@Test
	public void testMessageAndThrowableConstructor(){
		
		ApplicationException appEx = new ApplicationException("whateverMessage", new IllegalArgumentException("whateverThrowable"));
				
		assertNotNull(appEx.getCause());
		assertEquals("whateverThrowable", appEx.getCause().getMessage());
		assertEquals("whateverMessage", appEx.getMessage());
		assertNull(appEx.getErrorCode());
	}
	
	@Test
	public void testMessageConstructor(){
		
		ApplicationException appEx = new ApplicationException("whateverMessage");
				
		assertNull(appEx.getCause());
		assertEquals("whateverMessage", appEx.getMessage());
		assertNull(appEx.getErrorCode());
	}


}
