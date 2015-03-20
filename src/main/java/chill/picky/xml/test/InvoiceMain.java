package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class InvoiceMain {
	  private String exclusiveAmount;

	    private String invoiceTime;

	    private String invoiceType;

	    private String checkNumber;

	    private String invoiceDate;

	    private String tax;

	    private String mainRemark;

	    public String getExclusiveAmount ()
	    {
	        return exclusiveAmount;
	    }
	    @XmlElement(name="ExclusiveAmount")
	    public void setExclusiveAmount (String exclusiveAmount)
	    {
	        this.exclusiveAmount = exclusiveAmount;
	    }

	    public String getInvoiceTime ()
	    {
	        return invoiceTime;
	    }
	    @XmlElement(name="InvoiceTime")
	    public void setInvoiceTime (String invoiceTime)
	    {
	        this.invoiceTime = invoiceTime;
	    }

	    public String getInvoiceType ()
	    {
	        return invoiceType;
	    }
	    @XmlElement(name="InvoiceType")
	    public void setInvoiceType (String invoiceType)
	    {
	        this.invoiceType = invoiceType;
	    }

	    public String getCheckNumber ()
	    {
	        return checkNumber;
	    }
	    @XmlElement(name="CheckNumber")
	    public void setCheckNumber (String checkNumber)
	    {
	        this.checkNumber = checkNumber;
	    }

	    public String getInvoiceDate ()
	    {
	        return invoiceDate;
	    }
	    @XmlElement(name="InvoiceDate")
	    public void setInvoiceDate (String invoiceDate)
	    {
	        this.invoiceDate = invoiceDate;
	    }

	    public String getTax ()
	    {
	        return tax;
	    }
	    @XmlElement(name="Tax")
	    public void setTax (String tax)
	    {
	        this.tax = tax;
	    }

	    public String getMainRemark ()
	    {
	        return mainRemark;
	    }
	    @XmlElement(name="MainRemark")
	    public void setMainRemark (String mainRemark)
	    {
	        this.mainRemark = mainRemark;
	    }
		@Override
		public String toString() {
			return "InvoiceMain [exclusiveAmount=" + exclusiveAmount
					+ ", invoiceTime=" + invoiceTime + ", invoiceType="
					+ invoiceType + ", checkNumber=" + checkNumber
					+ ", invoiceDate=" + invoiceDate + ", tax=" + tax
					+ ", mainRemark=" + mainRemark + "]";
		}
	    
	    
	    
}
