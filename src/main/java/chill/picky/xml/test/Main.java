package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class Main {
	 private String transactionDate;

	    private String type;

	    private String transactionNumber;

	    private String identifier;

	    private String invoiceNumber;

	    private String total;

	    public String getTransactionDate ()
	    {
	        return transactionDate;
	    }
	    @XmlElement(name="TransactionDate")
	    public void setTransactionDate (String transactionDate)
	    {
	        this.transactionDate = transactionDate;
	    }

	    public String getType ()
	    {
	        return type;
	    }
	    @XmlElement(name="Type")
	    public void setType (String type)
	    {
	        this.type = type;
	    }

	    public String getTransactionNumber ()
	    {
	        return transactionNumber;
	    }
	    @XmlElement(name="TransactionNumber")
	    public void setTransactionNumber (String transactionNumber)
	    {
	        this.transactionNumber = transactionNumber;
	    }

	    public String getIdentifier ()
	    {
	        return identifier;
	    }
	    @XmlElement(name="Identifier")
	    public void setIdentifier (String identifier)
	    {
	        this.identifier = identifier;
	    }

	    public String getInvoiceNumber ()
	    {
	        return invoiceNumber;
	    }
	    @XmlElement(name="InvoiceNumber")
	    public void setInvoiceNumber (String invoiceNumber)
	    {
	        this.invoiceNumber = invoiceNumber;
	    }

	    public String getTotal ()
	    {
	        return total;
	    }
	    @XmlElement(name="Total")
	    public void setTotal (String total)
	    {
	        this.total = total;
	    }
		@Override
		public String toString() {
			return "Main [transactionDate=" + transactionDate + ", type="
					+ type + ", transactionNumber=" + transactionNumber
					+ ", identifier=" + identifier + ", invoiceNumber="
					+ invoiceNumber + ", total=" + total + "]";
		}
	    
	    
}
