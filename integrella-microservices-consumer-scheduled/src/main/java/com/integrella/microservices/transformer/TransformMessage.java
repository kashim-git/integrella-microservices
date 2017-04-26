package com.integrella.microservices.transformer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.integrella.microservices.exception.MdmException;

import org.apache.log4j.Logger;

public class TransformMessage {
	
	private static Logger logger = Logger.getLogger(TransformMessage.class);
	
	public String transform(byte[] data){
		String message = new String (data);
		logger.info("Original message received by transformer: " + message);
		
		try {
			logger.info("New message is: " + convert(message));
			return convert(message);
		} catch (MdmException e) {
			logger.error("Throwing away errored message: " + new String(data));
			return "";
		}
	}
	
	public String transform(String data){
		//String message = new String (data);
		logger.info("Original message received by transformer: " + data);
		
		try {
			logger.info("New message is: " + convert(data));
			return convert(data);
		} catch (MdmException e) {
			logger.error("Throwing away errored message: " + new String(data));
			return "";
		}
	}
	/*
	public String transform(String data){
		//String message = new String (data);
		logger.info("Original message received by transformer: " + data);
		logger.info("New message is: " + convert(data));
		return convert(data);
	}
	*/
	
	
	private String convert(String message) throws MdmException{
		
		String output = "";
		try {
		
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		
				// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("IntegrellaMDM");
			doc.appendChild(rootElement);
			
			// header elements
			Element header = doc.createElement("Header");
			rootElement.appendChild(header);
			
			// set attribute to staff element
			Attr attr = doc.createAttribute("id");
			attr.setValue("1");
			header.setAttributeNode(attr);
			
			// shorten way
			// staff.setAttribute("id", "1");
			
			// firstname elements
			Element data = doc.createElement("Data");
			data.appendChild(doc.createTextNode(message));
			rootElement.appendChild(data);
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

			
			StringWriter writer = new StringWriter();
			
			
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			output = writer.getBuffer().toString().replaceAll("\n|\r", "");
			
		
		} catch (ParserConfigurationException pce) {
			  logger.error("Exception during conversion: ParserConfigurationException", pce);
			  throw new MdmException("ParserConfigurationException", pce);
		} catch (TransformerException tfe) {
			  logger.error("Exception during conversion: TransformerException", tfe);
			  throw new MdmException("TransformerException", tfe);		  
		}
		return output;
		
	}
	

}
