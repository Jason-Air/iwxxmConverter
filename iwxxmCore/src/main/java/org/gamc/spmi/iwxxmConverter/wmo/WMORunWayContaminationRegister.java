/**
 * Copyright (C) 2018 Dmitry Moryakov, Main aeronautical meteorological center, Moscow, Russia
 * moryakovdv[at]gmail[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gamc.spmi.iwxxmConverter.wmo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**Class for parsing WMO contamination codes (0-20-087)
 * @see WMORegister
 * 
 * @author moryakov*/
public class WMORunWayContaminationRegister implements WMORegister {

	private static final String registerFileName = "codes.wmo.int-bufr4-codeflag-0-20-087.rdf";
	
	TreeMap<Integer, String> wmoContaminationCodes = new TreeMap<Integer, String>();
	
	@Override
	public TreeMap<Integer, String> getContent() {
		// TODO Auto-generated method stub
		return wmoContaminationCodes;
	}

	@Override
	public String getWMOUrlByCode(Object code) {
		if (wmoContaminationCodes.size()==0)
			parseWMOXml();
		
		return wmoContaminationCodes.get(code);
	}

	@Override
	public void parseWMOXml() {
		try(InputStream is = new FileInputStream(registerFileName);) {
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			
			
			
			Document doc = docBuilder.parse(is);

			// normalize text representation
			doc.getDocumentElement().normalize();
			
			// Create XPathFactory object
            XPathFactory xpathFactory = XPathFactory.newInstance();

            // Create XPath object
            XPath xpath = xpathFactory.newXPath();
			
			XPathExpression expr =xpath.compile("/RDF/Register/member/Concept");
	          
			
			
			NodeList listOfCloudElements = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);//root.getElementsByTagName("member");
			int totalCloudElements = listOfCloudElements.getLength();
			registerLogger.debug("Total members in RunwayContaminations: " + totalCloudElements);

			for (int i = 0; i < listOfCloudElements.getLength(); i++) {

				Node currentNode = listOfCloudElements.item(i);
				if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
					
					Integer code=-1;
					String url="";
					
					Element concept = (Element) currentNode;
					url = concept.getAttribute("rdf:about");
					
					NodeList notationList = concept.getElementsByTagName("skos:notation");
					if (notationList!=null && notationList.getLength()>0) {
						Element notation = (Element) notationList.item(0);
						code = Integer.valueOf(notation.getTextContent());
					}
					
					if (code>-1 && url.length()>0)
						wmoContaminationCodes.put(code, url);

				}
			} // end of for loop with s var
		} catch (SAXParseException err) {
			registerLogger.error("Error in parsing ", err);
		} catch (SAXException e) {
			registerLogger.error("SAX Exception", e);
		} catch (Throwable t) {
			registerLogger.error("Unknown error", t);
		}
		
	}

}
