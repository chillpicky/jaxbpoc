package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class InvoiceInfo {
	 private String paper;

	    private String carrierType;

	    private String donationUnit;

	    private String carrierId;

	    private String donate;

	    private String paperPrinted;

	    public String getPaper ()
	    {
	        return paper;
	    }
	    @XmlElement(name="Paper")
	    public void setPaper (String paper)
	    {
	        this.paper = paper;
	    }

	    public String getCarrierType ()
	    {
	        return carrierType;
	    }
	    @XmlElement(name="CarrierType")
	    public void setCarrierType (String carrierType)
	    {
	        this.carrierType = carrierType;
	    }

	    public String getDonationUnit ()
	    {
	        return donationUnit;
	    }
	    @XmlElement(name="DonationUnit")
	    public void setDonationUnit (String donationUnit)
	    {
	        this.donationUnit = donationUnit;
	    }

	    public String getCarrierId ()
	    {
	        return carrierId;
	    }
	    @XmlElement(name="CarrierId")
	    public void setCarrierId (String carrierId)
	    {
	        this.carrierId = carrierId;
	    }

	    public String getDonate ()
	    {
	        return donate;
	    }
	    @XmlElement(name="Donate")
	    public void setDonate (String donate)
	    {
	        this.donate = donate;
	    }

	    public String getPaperPrinted ()
	    {
	        return paperPrinted;
	    }
	    @XmlElement(name="PaperPrinted")
	    public void setPaperPrinted (String paperPrinted)
	    {
	        this.paperPrinted = paperPrinted;
	    }
		@Override
		public String toString() {
			return "InvoiceInfo [paper=" + paper + ", carrierType="
					+ carrierType + ", donationUnit=" + donationUnit
					+ ", carrierId=" + carrierId + ", donate=" + donate
					+ ", paperPrinted=" + paperPrinted + "]";
		}
	    

}
