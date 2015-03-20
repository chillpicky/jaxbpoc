package chill.picky.xml.test;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Issue {
	private List<Item> items;

	private Enterprise enterprise;

	private Main main;

	private Member member;

	private BI BI;

	private Buyer buyer;

	private Allowance allowance;

	private Receiver receiver;

	private InvoiceInfo invoiceInfo;

	private Other other;

	private String serialNum;

	private InvoiceMain invoiceMain;

	public List<Item> getItems() {
		return items;
	}
	@XmlElement(name="Items")
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}
	@XmlElement(name="Enterprise")
	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public Main getMain() {
		return main;
	}
	@XmlElement(name="Main")
	public void setMain(Main main) {
		this.main = main;
	}

	public Member getMember() {
		return member;
	}
	@XmlElement(name="Member")
	public void setMember(Member member) {
		this.member = member;
	}

	public BI getBI() {
		return BI;
	}
	@XmlElement(name="BI")
	public void setBI(BI BI) {
		this.BI = BI;
	}

	public Buyer getBuyer() {
		return buyer;
	}
	@XmlElement(name="Buyer")
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public Allowance getAllowance() {
		return allowance;
	}
	@XmlElement(name="Allowance")
	public void setAllowance(Allowance allowance) {
		this.allowance = allowance;
	}

	public Receiver getReceiver() {
		return receiver;
	}
	@XmlElement(name="Receiver")
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public InvoiceInfo getInvoiceInfo() {
		return invoiceInfo;
	}
	@XmlElement(name="InvoiceInfo")
	public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

	public Other getOther() {
		return other;
	}
	@XmlElement(name="Other")
	public void setOther(Other other) {
		this.other = other;
	}

	public String getSerialNum() {
		return serialNum;
	}
	@XmlElement(name="SerialNum")
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public InvoiceMain getInvoiceMain() {
		return invoiceMain;
	}
	@XmlElement(name="invoiceMain")
	public void setInvoiceMain(InvoiceMain invoiceMain) {
		this.invoiceMain = invoiceMain;
	}
	@Override
	public String toString() {
		return "Issue [items=" + items + ", enterprise=" + enterprise
				+ ", main=" + main + ", member=" + member + ", BI=" + BI
				+ ", buyer=" + buyer + ", allowance=" + allowance
				+ ", receiver=" + receiver + ", invoiceInfo=" + invoiceInfo
				+ ", other=" + other + ", serialNum=" + serialNum
				+ ", invoiceMain=" + invoiceMain + "]";
	}
	
	
}
