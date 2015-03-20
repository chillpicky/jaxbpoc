package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class Enterprise {
	private String orgUN;

    private String companyUN;

    private String orgId;

    public String getOrgUN ()
    {
        return orgUN;
    }
    @XmlElement(name="OrgUN")
    public void setOrgUN (String orgUN)
    {
        this.orgUN = orgUN;
    }

    public String getCompanyUN ()
    {
        return companyUN;
    }
    @XmlElement(name="CompanyUN")
    public void setCompanyUN (String companyUN)
    {
        this.companyUN = companyUN;
    }

    public String getOrgId ()
    {
        return orgId;
    }
    @XmlElement(name="OrgId")
    public void setOrgId (String orgId)
    {
        this.orgId = orgId;
    }
	@Override
	public String toString() {
		return "Enterprise [orgUN=" + orgUN + ", companyUN=" + companyUN
				+ ", orgId=" + orgId + "]";
	}
    
}
