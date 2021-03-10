package employee;

public class PermanentAddress {
	
	private String permanentCity;
	private String permanentStreetName;
	private String permanentState;
	private String permanentZip;
	private int permanentAid;
	public PermanentAddress( ) {

	}
	public PermanentAddress(String permanentStreetName, String permanentCity, String permanentState, String permanentZip, int permanentAid) {		
		this.permanentStreetName = permanentStreetName;
		this.permanentCity = permanentCity;
		this.permanentState = permanentState;
		this.permanentZip = permanentZip;
		this.permanentAid = permanentAid;
	}
	public int getpermanentAid() {
		return permanentAid;
	}
	public String getpermanentStreetName() {
		return permanentStreetName;
	}
	public void setpermanentStreetName(String permanentStreetName) {
		this.permanentStreetName = permanentStreetName;
	}
	public String getpermanentCity() {
		return permanentCity;
	}
	public void setpermanentAid(int permanentAid) {
		this.permanentAid = permanentAid;
	}
	public void setpermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}
	public String getpermanentState() {
		return permanentState;
	}
	public void setpermanentState(String permanentState) {
		this.permanentState = permanentState;
	}
	public String getpermanentZip() {
		return permanentZip;
	}
	public void setpermanentZip(String permanentZip) {
		this.permanentZip = permanentZip;
	}
	@Override
	public String toString() {
		return "PermanentAddress [permanentAid=" + permanentAid + ", permanentStreetName=" + permanentStreetName +  ", permanentCity=" + permanentCity + ", permanentState=" + permanentState +  ", permanentZip=" + permanentZip + "]";
	}
}