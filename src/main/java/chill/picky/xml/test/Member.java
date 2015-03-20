package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class Member {
	 private String email;

	    private String mobile;

	    private String memberId;

	    public String getEmail ()
	    {
	        return email;
	    }
	    @XmlElement(name="Email")
	    public void setEmail (String email)
	    {
	        this.email = email;
	    }

	    public String getMobile ()
	    {
	        return mobile;
	    }
	    @XmlElement(name="Mobile")
	    public void setMobile (String mobile)
	    {
	        this.mobile = mobile;
	    }

	    public String getMemberId ()
	    {
	        return memberId;
	    }
	    @XmlElement(name="MemberId")
	    public void setMemberId (String memberId)
	    {
	        this.memberId = memberId;
	    }
		@Override
		public String toString() {
			return "Member [email=" + email + ", mobile=" + mobile
					+ ", memberId=" + memberId + "]";
		}
	    
	    
}
