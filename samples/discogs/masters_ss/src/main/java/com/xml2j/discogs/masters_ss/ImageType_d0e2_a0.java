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

import com.xml2j.util.Printer;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ImageType_d0e2_a0 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ImageType_d0e2_a0 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ImageType_d0e2_a0.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	private ImageType_d0e2_a0(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ImageType_d0e2_a0.
	 */
	static class Allocator implements TypeAllocator<ImageType_d0e2_a0> {
		/**
		 * method for getting a new instance of type ImageType_d0e2_a0.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ImageType_d0e2_a0 newInstance(String elementName, ComplexDataType parent) {
			return new ImageType_d0e2_a0(elementName, parent);
		}
	}
	
	/** instance of allocator class for this data class. */
	private static Allocator allocator = new Allocator();
	
	/**
	 * Get Allocator for this data class.
	 * This method is used by the handler class.
	 *
	 * @return instance of Allocator
	 */
	static public Allocator getAllocator() {
		return allocator;
	}
	
  	
  
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 
		return true;
	}	

  
  

//	/**
//	 * Get 'height' attribute.
//	 * @return the item.
//	 */
//	public String getHeight() {
//		return getAttr("height");
//	}

//	/**
//	 * Set 'height' attribute.
//	 * 
//	 * Set (overwrite) the attribute data.
//	 * @param data the item that needs to be added.
//	 */
//	public void setHeight(String data) {
//		setAttr("height", data);
//	}
  

//	/**
//	 * Get 'type' attribute.
//	 * @return the item.
//	 */
//	public String getType() {
//		return getAttr("type");
//	}

//	/**
//	 * Set 'type' attribute.
//	 * 
//	 * Set (overwrite) the attribute data.
//	 * @param data the item that needs to be added.
//	 */
//	public void setType(String data) {
//		setAttr("type", data);
//	}
  

//	/**
//	 * Get 'uri' attribute.
//	 * @return the item.
//	 */
//	public String getUri() {
//		return getAttr("uri");
//	}

//	/**
//	 * Set 'uri' attribute.
//	 * 
//	 * Set (overwrite) the attribute data.
//	 * @param data the item that needs to be added.
//	 */
//	public void setUri(String data) {
//		setAttr("uri", data);
//	}
  

//	/**
//	 * Get 'uri150' attribute.
//	 * @return the item.
//	 */
//	public String getUri150() {
//		return getAttr("uri150");
//	}

//	/**
//	 * Set 'uri150' attribute.
//	 * 
//	 * Set (overwrite) the attribute data.
//	 * @param data the item that needs to be added.
//	 */
//	public void setUri150(String data) {
//		setAttr("uri150", data);
//	}
  

//	/**
//	 * Get 'width' attribute.
//	 * @return the item.
//	 */
//	public String getWidth() {
//		return getAttr("width");
//	}

//	/**
//	 * Set 'width' attribute.
//	 * 
//	 * Set (overwrite) the attribute data.
//	 * @param data the item that needs to be added.
//	 */
//	public void setWidth(String data) {
//		setAttr("width", data);
//	}
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from imageType_d0e2_a0.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
	}
}
