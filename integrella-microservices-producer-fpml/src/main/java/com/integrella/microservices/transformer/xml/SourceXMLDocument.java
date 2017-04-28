package com.integrella.microservices.transformer.xml;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.log4j.Logger;
import org.springframework.core.env.PropertySource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.integrella.fpML.schema.IdentifiedDate;
import com.integrella.fpML.schema.Trade;
import com.integrella.fpML.schema.TradeHeader;

public class SourceXMLDocument {
	
	private static Logger logger = Logger.getLogger(SourceXMLDocument.class);
	
	private Document sourceDoc;
	private HashMap<String, String> mappingValues;
	private Properties xpathExpressionList;
    private XPathFactory factory;
    private XPath xpath; 
    private Document fpmlMessage;
	//private static 
	
	private SourceXMLDocument() {
		loadPropeties();
	}

	public SourceXMLDocument(byte[] xmlMessage) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setValidating(false);
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputStream is = new ByteArrayInputStream(xmlMessage);
			setSourceDoc(db.parse(is));
			factory = XPathFactory.newInstance();
			xpath = factory.newXPath();
			createMappings();
			createOutputMessage();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @deprecated
	 */
	private void loadPropeties(){	
		FileInputStream fis;
		try {
			fis = new FileInputStream("source-xpaths.properties");
			xpathExpressionList = new Properties();
			xpathExpressionList.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Document getSourceDoc() {
		return sourceDoc;
	}

	public void setSourceDoc(Document sourceDoc) {
		this.sourceDoc = sourceDoc;
	}
	
	public String getXpath(String parameter){
		return xpathExpressionList.getProperty(parameter,"");
	}
	
	public NodeList getNodeList(String expression){
		NodeList nodeList;
		try {
			nodeList = (NodeList) xpath.evaluate(expression, getSourceDoc(), XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			e.printStackTrace();
			return new NodeList() {
				@Override
				public Node item(int index) {
					return null;
				}
				@Override
				public int getLength() {
					return 0;
				}
			};
		}
		return nodeList;
	}
	
	public String getNodeAsString(String expression){
		String nodeString = "";
		try {
			Node node = (Node) xpath.evaluate(expression, getSourceDoc(), XPathConstants.NODE);
			nodeString = node.getNodeValue();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return nodeString;
	}
	
	private void createMappings(){
		
		logger.info("Properties are: " + XpathLookupConfig.xpathExpressionsProperties().getAppliedPropertySources());
		for (Iterator<PropertySource<?>> it = XpathLookupConfig.xpathExpressionsProperties().getAppliedPropertySources().iterator(); 
				it.hasNext();) {
			PropertySource<?> ps = it.next();
			String name = ps.getName();
			logger.info(name + "," + ps.getProperty(name));
			mappingValues.put(name, getNodeAsString(name));
		}
		
		logger.info("mapping values = " + mappingValues.toString());
		
	}
	
	private void createOutputMessage(){
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder;
	
			docBuilder = docFactory.newDocumentBuilder();
	
	
			// root elements
				
		
		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public String getOutput(){
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = tf.newTransformer();

		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		StringWriter writer = new StringWriter();
		transformer.transform(new DOMSource(fpmlMessage), new StreamResult(writer));
		String output = writer.getBuffer().toString().replaceAll("\n|\r", "");
		return output;
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

	
}
