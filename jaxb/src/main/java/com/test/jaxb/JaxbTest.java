package com.test.jaxb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBException;

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
