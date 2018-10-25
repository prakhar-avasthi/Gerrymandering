package utils;
import org.json.*;

class Precincts {

	private int precinctId;
	private String centerPoint;
	private JSONObject boundary;
	private int districtId;

	public Precincts(int precinctId, String centerPoint, JSONObject boundary, int districtId) {
		this.precinctId = precinctId;
		this.centerPoint = centerPoint;
		this.boundary = boundary;
		this.districtId = districtId;
	}

	public int getPrecinctId() {
		return precinctId;
	}

	public void setPrecinctId(int precinctId) {
		this.precinctId = precinctId;
	}

	public String getCenterPoint() {
		return centerPoint;
	}

	public void setCenterPoint(String centerPoint) {
		this.centerPoint = centerPoint;
	}

	public JSONObject getBoundary() {
		return boundary;
	}

	public void setBoundary(JSONObject boundary) {
		this.boundary = boundary;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public Precincts() {
		// TODO Auto-generated constructor stub
	}
}
