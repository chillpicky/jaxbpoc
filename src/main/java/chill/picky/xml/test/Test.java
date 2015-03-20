package chill.picky.xml.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Test {

	public static void main(String[] args) {
		 try {
			 
				File file = new File("ISSUE_00123411_A0A001_20150227_001.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(IssueRoot.class);
		 
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				IssueRoot issueRoot = (IssueRoot) jaxbUnmarshaller.unmarshal(file);
				System.out.println(issueRoot);
				
				System.out.println("==========================================================================");
				
				File file2 = new File("testresult.xml");
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		 
				// output pretty printed
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 
				jaxbMarshaller.marshal(issueRoot, file2);
				jaxbMarshaller.marshal(issueRoot, System.out);
		 
			  } catch (JAXBException e) {
				e.printStackTrace();
			  }
		 
			}

}
