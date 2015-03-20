package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class Receiver {
	private String name;

	private String phone;

	private String address;

	public String getName() {
		return name;
	}
	@XmlElement(name="Name")
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	@XmlElement(name="Phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	@XmlElement(name="Address")
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Receiver [name=" + name + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
	
}
