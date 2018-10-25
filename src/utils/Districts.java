/**
 * 
 */
package utils;

import org.json.JSONObject;

/**
 * @author Prakhar
 *
 */
public class Districts {

	private int districtId;
	private int stateId;
	private String name;
	private JSONObject boundary;
	
	public Districts(int districtId, int stateId, String name, JSONObject boundary) {
		this.districtId = districtId;
		this.stateId = stateId;
		this.name = name;
		this.boundary = boundary;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JSONObject getBoundary() {
		return boundary;
	}

	public void setBoundary(JSONObject boundary) {
		this.boundary = boundary;
	}

	public Districts() {
		// TODO Auto-generated constructor stub
	}
}
