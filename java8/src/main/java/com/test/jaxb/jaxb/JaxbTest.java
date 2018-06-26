package com.test.jaxb.jaxb;

import javax.xml.bind.JAXBException;
import java.io.*;

public class JaxbTest {

	public static void main(String[] args) throws FileNotFoundException, JAXBException {

		// unmarshal
		InputStream is = new FileInputStream("C:/test.xml");
		Object obj = JAXBUtils.unmarshal("generate", is);
		//System.out.println(obj.getUserid());

		// marshal
		OutputStream f = new FileOutputStream("C:/Test1.xml");
		JAXBUtils.marshal("generate", obj, f);
	}
}
