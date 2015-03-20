package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;

public class Other {
	private String userDefined1;

    private String userDefined5;

    private String userDefined4;

    private String userDefined3;

    private String userDefined2;

    private String userDefined9;

    private String userDefined8;

    private String userDefined7;

    private String userDefined6;

    private String userDefined10;

    public String getUserDefined1 ()
    {
        return userDefined1;
    }

    @XmlElement(name="UserDefined1")
    public void setUserDefined1 (String userDefined1)
    {
        this.userDefined1 = userDefined1;
    }

    public String getUserDefined5 ()
    {
        return userDefined5;
    }
    @XmlElement(name="UserDefined5")
    public void setUserDefined5 (String userDefined5)
    {
        this.userDefined5 = userDefined5;
    }

    public String getUserDefined4 ()
    {
        return userDefined4;
    }
    @XmlElement(name="UserDefined4")
    public void setUserDefined4 (String userDefined4)
    {
        this.userDefined4 = userDefined4;
    }
  
    public String getUserDefined3 ()
    {
        return userDefined3;
    }
    @XmlElement(name="UserDefined3")
    public void setUserDefined3 (String userDefined3)
    {
        this.userDefined3 = userDefined3;
    }

    public String getUserDefined2 ()
    {
        return userDefined2;
    }
    @XmlElement(name="UserDefined2")
    public void setUserDefined2 (String userDefined2)
    {
        this.userDefined2 = userDefined2;
    }

    public String getUserDefined9 ()
    {
        return userDefined9;
    }
    @XmlElement(name="UserDefined9")
    public void setUserDefined9 (String userDefined9)
    {
        this.userDefined9 = userDefined9;
    }

    public String getUserDefined8 ()
    {
        return userDefined8;
    }
    @XmlElement(name="UserDefined8")
    public void setUserDefined8 (String userDefined8)
    {
        this.userDefined8 = userDefined8;
    }

    public String getUserDefined7 ()
    {
        return userDefined7;
    }
    @XmlElement(name="UserDefined7")
    public void setUserDefined7 (String userDefined7)
    {
        this.userDefined7 = userDefined7;
    }

    public String getUserDefined6 ()
    {
        return userDefined6;
    }
    @XmlElement(name="UserDefined6")
    public void setUserDefined6 (String userDefined6)
    {
        this.userDefined6 = userDefined6;
    }

    public String getUserDefined10 ()
    {
        return userDefined10;
    }
    @XmlElement(name="UserDefined10")
    public void setUserDefined10 (String userDefined10)
    {
        this.userDefined10 = userDefined10;
    }

	@Override
	public String toString() {
		return "Other [userDefined1=" + userDefined1 + ", userDefined5="
				+ userDefined5 + ", userDefined4=" + userDefined4
				+ ", userDefined3=" + userDefined3 + ", userDefined2="
				+ userDefined2 + ", userDefined9=" + userDefined9
				+ ", userDefined8=" + userDefined8 + ", userDefined7="
				+ userDefined7 + ", userDefined6=" + userDefined6
				+ ", userDefined10=" + userDefined10 + "]";
	}
    
    
}
