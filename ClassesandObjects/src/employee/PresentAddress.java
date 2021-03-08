package employee;

public class PresentAddress {
	
	private String streetName;
	private String city;
	private String state;
	private String zip;
	
	private int aid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public PresentAddress() {

	}
	public PresentAddress(String streetName, String city, String state, String zip, int aid) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", streetName=" + streetName +  ", city=" + city + ", state=" + state +  ", zip=" + zip + "]";
	}

}
