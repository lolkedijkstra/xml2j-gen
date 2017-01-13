package com.xml2j.tutorial.zoo;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: ZOO 
  Generation date: Fri Jan 13 16:19:39 CET 2017 

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * MammalZooType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class MammalZooType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for MammalZooType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public MammalZooType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type MammalZooType.
	 */
	static class Allocator implements TypeAllocator<MammalZooType> {
		/**
		 * method for getting a new instance of type MammalZooType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public MammalZooType newInstance(String elementName, ComplexDataType parent) {
			return new MammalZooType(elementName, parent);
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
	
  	
  
	/** list of mammal element. 
	 *  @serial
	 */	
	private List<MammalType> m_mammalList = new ArrayList<MammalType>();
	
	/**
	 * Get the embedded list of Mammal elements.
	 * @return list of items.
	 */
	public List<MammalType> getMammals() {
		return m_mammalList;
	}
		
	/**
	 * This method adds data to the list of Mammal.
	 * @param data the item that needs to be added.
	 */
	void setMammal(MammalType data) {
		m_mammalList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_mammalList, ((MammalZooType)that).m_mammalList))
			return false;
		
		return true;
	}	

  
  
}