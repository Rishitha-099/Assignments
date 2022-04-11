package spring_core_q1;

public class Customer {
	int Customerid;
	String Customername;
	Long CustomerContact;
	Address CustomerAddress;
	public Customer(int customerid, String customername, Long customercontact, Address customeraddress) {
		super();
		Customerid = customerid;
		Customername = customername;
		CustomerContact = customercontact;
		CustomerAddress = customeraddress;
	
	}
	@Override
	public String toString() {
		return "Customer [Customerid=" + Customerid + ", Customername=" + Customername + ", CustomerContact="
				+ CustomerContact +" CustomerAddress="+ CustomerAddress +"]";
	}

}
