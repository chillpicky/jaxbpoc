package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class Allowance {
	 private String allowanceNumber;

	    private String allowanceExclusiveAmount;

	    private String allowanceDate;

	    private String allowancePaperReturned;

	    private String allowanceTax;

	    public String getAllowanceNumber ()
	    {
	        return allowanceNumber;
	    }
	    @XmlElement(name="AllowanceNumber")
	    public void setAllowanceNumber (String allowanceNumber)
	    {
	        this.allowanceNumber = allowanceNumber;
	    }

	    public String getAllowanceExclusiveAmount ()
	    {
	        return allowanceExclusiveAmount;
	    }
	    @XmlElement(name="AllowanceExclusiveAmount")
	    public void setAllowanceExclusiveAmount (String allowanceExclusiveAmount)
	    {
	        this.allowanceExclusiveAmount = allowanceExclusiveAmount;
	    }

	    public String getAllowanceDate ()
	    {
	        return allowanceDate;
	    }
	    @XmlElement(name="AllowanceDate")
	    public void setAllowanceDate (String allowanceDate)
	    {
	        this.allowanceDate = allowanceDate;
	    }

	    public String getAllowancePaperReturned ()
	    {
	        return allowancePaperReturned;
	    }
	    @XmlElement(name="AllowancePaperReturned")
	    public void setAllowancePaperReturned (String allowancePaperReturned)
	    {
	        this.allowancePaperReturned = allowancePaperReturned;
	    }

	    public String getAllowanceTax ()
	    {
	        return allowanceTax;
	    }
	    @XmlElement(name="AllowanceTax")
	    public void setAllowanceTax (String allowanceTax)
	    {
	        this.allowanceTax = allowanceTax;
	    }
		@Override
		public String toString() {
			return "Allowance [allowanceNumber=" + allowanceNumber
					+ ", allowanceExclusiveAmount=" + allowanceExclusiveAmount
					+ ", allowanceDate=" + allowanceDate
					+ ", allowancePaperReturned=" + allowancePaperReturned
					+ ", allowanceTax=" + allowanceTax + "]";
		}
	    
}
