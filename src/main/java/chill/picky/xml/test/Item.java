package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class Item {
	private String userDefined1;

	private String description;

	private String userDefined4;

	private String productCode;

	private String userDefined3;

	private String userDefined2;

	private String itemExclude;

	private String itemTax;

	private String qty;

	private String serial;

	private String taxType;

	private String price;

	private String itemTotal;

	private String productName;

	public String getUserDefined1() {
		return userDefined1;
	}
	@XmlElement(name="UserDefined1")
	public void setUserDefined1(String userDefined1) {
		this.userDefined1 = userDefined1;
	}

	public String getDescription() {
		return description;
	}
	@XmlElement(name="Description")
	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserDefined4() {
		return userDefined4;
	}
	@XmlElement(name="UserDefined4")
	public void setUserDefined4(String userDefined4) {
		this.userDefined4 = userDefined4;
	}

	public String getProductCode() {
		return productCode;
	}
	@XmlElement(name="ProductCode")
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserDefined3() {
		return userDefined3;
	}
	@XmlElement(name="UserDefined3")
	public void setUserDefined3(String userDefined3) {
		this.userDefined3 = userDefined3;
	}

	public String getUserDefined2() {
		return userDefined2;
	}
	@XmlElement(name="UserDefined2")
	public void setUserDefined2(String userDefined2) {
		this.userDefined2 = userDefined2;
	}

	public String getItemExclude() {
		return itemExclude;
	}
	@XmlElement(name="ItemExclude")
	public void setItemExclude(String itemExclude) {
		this.itemExclude = itemExclude;
	}

	public String getItemTax() {
		return itemTax;
	}
	@XmlElement(name="ItemTax")
	public void setItemTax(String itemTax) {
		this.itemTax = itemTax;
	}

	public String getQty() {
		return qty;
	}
	@XmlElement(name="Qty")
	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getSerial() {
		return serial;
	}
	@XmlElement(name="Serial")
	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getTaxType() {
		return taxType;
	}
	@XmlElement(name="TaxType")
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getPrice() {
		return price;
	}
	@XmlElement(name="Price")
	public void setPrice(String price) {
		this.price = price;
	}

	public String getItemTotal() {
		return itemTotal;
	}
	@XmlElement(name="ItemTotal")
	public void setItemTotal(String itemTotal) {
		this.itemTotal = itemTotal;
	}

	public String getProductName() {
		return productName;
	}
	@XmlElement(name="ProductName")
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Item [userDefined1=" + userDefined1 + ", description="
				+ description + ", userDefined4=" + userDefined4
				+ ", productCode=" + productCode + ", userDefined3="
				+ userDefined3 + ", userDefined2=" + userDefined2
				+ ", itemExclude=" + itemExclude + ", itemTax=" + itemTax
				+ ", qty=" + qty + ", serial=" + serial + ", taxType="
				+ taxType + ", price=" + price + ", itemTotal=" + itemTotal
				+ ", productName=" + productName + "]";
	}
	
	
}
