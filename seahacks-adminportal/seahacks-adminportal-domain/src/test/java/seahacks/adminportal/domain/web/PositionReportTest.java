package seahacks.adminportal.domain.web;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.joda.time.DateTime;
import org.junit.Test;

public class PositionReportTest {
	
	@Test
	public void testConstructor(){
		PositionReport positionReport = new PositionReport(11.138919f, 60.288802f, 187f, "testReporter");
		
		assertEquals(Float.valueOf(11.138919f), positionReport.getLongitude());
		assertEquals(Float.valueOf(60.288802f), positionReport.getLatitude());
		assertEquals(Float.valueOf(187f), positionReport.getAltitude());
		assertEquals("testReporter", positionReport.getReporter());
		assertNotNull(positionReport.getTime());
		assertEquals(-1, positionReport.getTime().compareTo(DateTime.now()));
		
	}

}
