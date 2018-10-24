package utils;
import org.json.*;

class Precincts {

	private int mPrecinctId;
	private String mCenterPoint;
	private JSONObject mBoundary;
	private int mDistrictId;
	
	
	public Precincts(int mPrecinctId, String mCenterPoint, JSONObject mBoundary, int mDistrictId) {
		this.mPrecinctId = mPrecinctId;
		this.mCenterPoint = mCenterPoint;
		this.mBoundary = mBoundary;
		this.mDistrictId = mDistrictId;
	}


	public int getmPrecinctId() {
		return mPrecinctId;
	}


	public void setmPrecinctId(int mPrecinctId) {
		this.mPrecinctId = mPrecinctId;
	}


	public String getmCenterPoint() {
		return mCenterPoint;
	}


	public void setmCenterPoint(String mCenterPoint) {
		this.mCenterPoint = mCenterPoint;
	}


	public JSONObject getmBoundary() {
		return mBoundary;
	}


	public void setmBoundary(JSONObject mBoundary) {
		this.mBoundary = mBoundary;
	}


	public int getmDistrictId() {
		return mDistrictId;
	}


	public void setmDistrictId(int mDistrictId) {
		this.mDistrictId = mDistrictId;
	}


	public Precincts() {
		// TODO Auto-generated constructor stub
	}

}
