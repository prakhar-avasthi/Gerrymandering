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

	/**
	 * 
	 */
	
	private int mDistrictId;
	private int mStateId;
	private String mName;
	private JSONObject mBoundary;
	
	
	public Districts(int mDistrictId, int mStateId, String mName, JSONObject mBoundary) {
		this.mDistrictId = mDistrictId;
		this.mStateId = mStateId;
		this.mName = mName;
		this.mBoundary = mBoundary;
	}


	public int getmDistrictId() {
		return mDistrictId;
	}


	public void setmDistrictId(int mDistrictId) {
		this.mDistrictId = mDistrictId;
	}


	public int getmStateId() {
		return mStateId;
	}


	public void setmStateId(int mStateId) {
		this.mStateId = mStateId;
	}


	public String getmName() {
		return mName;
	}


	public void setmName(String mName) {
		this.mName = mName;
	}


	public JSONObject getmBoundary() {
		return mBoundary;
	}


	public void setmBoundary(JSONObject mBoundary) {
		this.mBoundary = mBoundary;
	}


	public Districts() {
		// TODO Auto-generated constructor stub
	}

}
