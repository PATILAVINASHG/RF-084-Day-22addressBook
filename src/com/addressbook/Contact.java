package com.addressbook;

public class Contact {

	private String firstName; 
	private String  email;
	private String phoneNumber;
	private String lastName; 
	private String  State;
	private String address;
	private String pincode; 
	private String  city;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", lastName="
				+ lastName + ", State=" + State + ", address=" + address + ", pincode=" + pincode + ", city=" + city
				+ "]";
	}
	
	
}
