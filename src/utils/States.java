/**
 * 
 */
package utils;

/**
 * @author Prakhar
 *
 */
public class States {

	private int stateId;
	private String name;
	private String shortName;
	private String constitutionText;
	
	public States(int stateId, String name, String shortName, String constitutionText) {
		this.stateId = stateId;
		this.name = name;
		this.shortName = shortName;
		this.constitutionText = constitutionText;
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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getConstitutionText() {
		return constitutionText;
	}

	public void setConstitutionText(String constitutionText) {
		this.constitutionText = constitutionText;
	}

	public States() {
		// TODO Auto-generated constructor stub
	}
}
