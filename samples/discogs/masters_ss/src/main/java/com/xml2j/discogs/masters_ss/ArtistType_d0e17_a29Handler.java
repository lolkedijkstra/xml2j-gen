package com.xml2j.discogs.masters_ss;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: MASTERS_SS 
  Generation date: Tue Apr 17 20:26:13 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * ArtistType_d0e17_a29 handler class.
 *
 * @see ArtistType_d0e17_a29
 */
public class ArtistType_d0e17_a29Handler extends XMLFragmentHandler<ArtistType_d0e17_a29> {
	/**
	 * Proxy for ArtistType_d0e17_a29Handler.
	 */
	static class Proxy extends HandlerProxy<ArtistType_d0e17_a29> {
		/**
		 * Allocator for ArtistType_d0e17_a29Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ArtistType_d0e17_a29> {			
			public XMLFragmentHandler<ArtistType_d0e17_a29> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ArtistType_d0e17_a29Handler(
					task
					, reader
					, handler
					, elementName
					, ArtistType_d0e17_a29.getAllocator()
					, setter
					, doProcess);
			}
		}
		
		/**
		 * Constructor for Proxy.
		 *
		 * @param task the XML parser task
		 * @param reader the XML reader
		 * @param parentH the parent XML handler class
		 * @param elementName the name of the XML Element (tag).
		 * @param pSetter the setter for the parent data
		 * @param doProcess indicates whether processing is active for this handler instance
		 */
		public Proxy(ParserTask task, XMLReader reader, XMLFragmentHandler<?> parentH, String elementName,
				DataSetter pSetter, boolean doProcess) {
			super(task, reader, parentH, elementName, pSetter, new Allocator(), doProcess);
		}
	}



	/**
	 * Constructor for handler class.
	 *
	 * @param reader the XML reader
	 * @param parentH the parent XML handler class
	 * @param elementName the name of the XML Element (tag)
	 * @param allocator the allocator for the data type
	 * @param pSetter the setter for the parent data
	 * @param doProcess indicates whether processing is active for this handler instance
	 */
	public ArtistType_d0e17_a29Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ArtistType_d0e17_a29.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);
	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public ArtistType_d0e17_a29 getData() {
		return (ArtistType_d0e17_a29)super.getData();
	}




	/**
	 * This method is called by the XML parser on an end of element event.
	 *
	 * If the localName == 'the name of the element that this handler handles' control is
	 * passed back to the parent handler (future events go there) and the data of
	 * the children of this handler is attached to the data associated to this handler.	
	 * 
	 * The data that is collected is connected to the parent data only if a parentDataSetter
	 * if found (getParentDataSetter()).
	 *
	 * If processing is enabled for a handler, the processor is called.
	 */
	@Override
	public void endElement(String uri, String localName, String name)
		throws SAXException {
		
		// collect data from children..
		if (localName.equals("anv")) {
			getData().setAnv(getValue());
			getContents().reset();
		} else if (localName.equals("id")) {
			getData().setId(getValue());
			getContents().reset();
		} else if (localName.equals("join")) {
			getData().setJoin(getValue());
			getContents().reset();
		} else if (localName.equals("name")) {
			getData().setName(getValue());
			getContents().reset();
		} else if (localName.equals("role")) {
			getData().setRole(getValue());
			getContents().reset();
		} else if (localName.equals("tracks")) {
			getData().setTracks(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
