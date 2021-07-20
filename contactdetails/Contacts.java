package contactdetails;

public class Contacts {
	
	private String firstName, lastName, address, city, state, email;
	private long zip, phoneNumber;

	/**
	 * Purpose - Use of setters for the class
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Purpose - Use of getters for the class
	 */
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public String getEmail() {
		return this.email;
	}

	public long getZip() {
		return this.zip;
	}

	public long getPhoneNumber() {
		return this.phoneNumber;
	}

	public String toString() {
		return ("First name: " + firstName + " Last name: " + lastName + " Address: " + address + " city: " + city
				+ " state: " + state + " email: " + email + " zip: " + zip + " phone number:" + phoneNumber + "");
	}

}


