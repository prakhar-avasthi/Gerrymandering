package utils;

public class PartyRepresentative {

	private int mRepresentativeId;
	private String mName;
	private String mAddress;
	
	public PartyRepresentative(int mRepresentativeId, String mName, String mAddress) {
		this.mRepresentativeId = mRepresentativeId;
		this.mName = mName;
		this.mAddress = mAddress;
	}

	public int getmRepresentativeId() {
		return mRepresentativeId;
	}

	public void setmRepresentativeId(int mRepresentativeId) {
		this.mRepresentativeId = mRepresentativeId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public PartyRepresentative() {
		// TODO Auto-generated constructor stub
	}

}
