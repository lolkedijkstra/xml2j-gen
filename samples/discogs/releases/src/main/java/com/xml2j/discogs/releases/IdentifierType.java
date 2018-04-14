package com.xml2j.discogs.releases;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RELEASES 
  Generation date: Sat Apr 14 18:02:46 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * IdentifierType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class IdentifierType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for IdentifierType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public IdentifierType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type IdentifierType.
	 */
	static class Allocator implements TypeAllocator<IdentifierType> {
		/**
		 * method for getting a new instance of type IdentifierType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public IdentifierType newInstance(String elementName, ComplexDataType parent) {
			return new IdentifierType(elementName, parent);
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

  
  

	/**
	 * Get 'description' attribute.
	 * @return the item.
	 */
	public String getDescription() {
		return getAttr("description");
	}

	/**
	 * Set 'description' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setDescription(String data) {
		setAttr("description", data);
	}
  

	/**
	 * Get 'type' attribute.
	 * @return the item.
	 */
	public String getType() {
		return getAttr("type");
	}

	/**
	 * Set 'type' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setType(String data) {
		setAttr("type", data);
	}
  

	/**
	 * Get 'value' attribute.
	 * @return the item.
	 */
	public String getValue() {
		return getAttr("value");
	}

	/**
	 * Set 'value' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setValue(String data) {
		setAttr("value", data);
	}
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from identifierType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
	}
}
