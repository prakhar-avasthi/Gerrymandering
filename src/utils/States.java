/**
 * 
 */
package utils;

/**
 * @author Prakhar
 *
 */
public class States {

	/**
	 * 
	 */

	private int mStateId;
	private String mName;
	private String mShortName;
	private String mConstitutionText;
	
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

	public String getmShortName() {
		return mShortName;
	}

	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getmConstitutionText() {
		return mConstitutionText;
	}

	public void setmConstitutionText(String mConstitutionText) {
		this.mConstitutionText = mConstitutionText;
	}
	
	public States() {
		// TODO Auto-generated constructor stub
	}

	public States(int mStateId, String mName, String mShortName, String mConstitutionText) {
		this.mStateId = mStateId;
		this.mName = mName;
		this.mShortName = mShortName;
		this.mConstitutionText = mConstitutionText;
	}

}
