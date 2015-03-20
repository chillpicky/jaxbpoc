package chill.picky.xml.test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="IssueRoot")
public class IssueRoot
{
    private Issue issue;

    public Issue getIssue ()
    {
        return issue;
    }

    @XmlElement(name="Issue")
    public void setIssue (Issue issue)
    {
        this.issue = issue;
    }

	@Override
	public String toString() {
		return "IssueRoot [issue=" + issue + "]";
	}
    
    
}
			