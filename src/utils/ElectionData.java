package utils;

public class ElectionData {
	
	private int mElectionId;
	private int mRepresentativeId;
	private String mPartyName;
	private String mElectionType;
	private double mVoteCount;
	private int mPrecinctId;
	private int mDistrictId;

	public ElectionData(int mElectionId, int mRepresentativeId, String mPartyName, String mElectionType,
			double mVoteCount, int mPrecinctId, int mDistrictId) {
		this.mElectionId = mElectionId;
		this.mRepresentativeId = mRepresentativeId;
		this.mPartyName = mPartyName;
		this.mElectionType = mElectionType;
		this.mVoteCount = mVoteCount;
		this.mPrecinctId = mPrecinctId;
		this.mDistrictId = mDistrictId;
	}

	public int getmElectionId() {
		return mElectionId;
	}

	public void setmElectionId(int mElectionId) {
		this.mElectionId = mElectionId;
	}

	public int getmRepresentativeId() {
		return mRepresentativeId;
	}

	public void setmRepresentativeId(int mRepresentativeId) {
		this.mRepresentativeId = mRepresentativeId;
	}

	public String getmPartyName() {
		return mPartyName;
	}

	public void setmPartyName(String mPartyName) {
		this.mPartyName = mPartyName;
	}

	public String getmElectionType() {
		return mElectionType;
	}

	public void setmElectionType(String mElectionType) {
		this.mElectionType = mElectionType;
	}

	public double getmVoteCount() {
		return mVoteCount;
	}

	public void setmVoteCount(double mVoteCount) {
		this.mVoteCount = mVoteCount;
	}

	public int getmPrecinctId() {
		return mPrecinctId;
	}

	public void setmPrecinctId(int mPrecinctId) {
		this.mPrecinctId = mPrecinctId;
	}

	public int getmDistrictId() {
		return mDistrictId;
	}

	public void setmDistrictId(int mDistrictId) {
		this.mDistrictId = mDistrictId;
	}

	public ElectionData() {
		// TODO Auto-generated constructor stub
	}

}
