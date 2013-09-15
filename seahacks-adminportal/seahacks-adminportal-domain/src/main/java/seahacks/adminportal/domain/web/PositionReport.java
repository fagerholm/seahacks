package seahacks.adminportal.domain.web;

import org.joda.time.DateTime;

public class PositionReport {
	
	private Float longitude;
	private Float latitude;
	private Float altitude;
	private DateTime time;
	private String reporter;

	public PositionReport(float longitude, float latitude, float altitude, String reporter) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.time = DateTime.now();
		this.reporter = reporter;
	}

	public Float getLongitude() {
		return longitude;
	}

	public Float getLatitude() {
		return latitude;
	}

	public Float getAltitude() {
		return altitude;
	}

	public DateTime getTime() {
		return time;
	}

	public String getReporter() {
		return reporter;
	}
}
