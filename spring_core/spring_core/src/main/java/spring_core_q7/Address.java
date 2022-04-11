package spring_core_q7;

public class Address {
	String street,city,state,zip,country;
	public Address(String street, String city, String state, String zip, String country) {
		super();
		this.street=street;
		this.city=city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address[street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]"
	;	
	}
}
