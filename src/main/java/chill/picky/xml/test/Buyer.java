package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class Buyer {
	 private String name;

	    private String unifiedNumber;

	    private String address;

	    public String getName ()
	    {
	        return name;
	    }
	    @XmlElement(name="Name")
	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getUnifiedNumber ()
	    {
	        return unifiedNumber;
	    }
	    @XmlElement(name="UnifiedNumber")
	    public void setUnifiedNumber (String unifiedNumber)
	    {
	        this.unifiedNumber = unifiedNumber;
	    }

	    public String getAddress ()
	    {
	        return address;
	    }
	    @XmlElement(name="Address")
	    public void setAddress (String address)
	    {
	        this.address = address;
	    }
		@Override
		public String toString() {
			return "Buyer [name=" + name + ", unifiedNumber=" + unifiedNumber
					+ ", address=" + address + "]";
		}
	    
}
