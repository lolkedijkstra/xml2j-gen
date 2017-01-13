package com.xml2j.tutorial.group;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: GROUP 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ContainerType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class ContainerType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ContainerType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ContainerType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ContainerType.
	 */
	static class Allocator implements TypeAllocator<ContainerType> {
		/**
		 * method for getting a new instance of type ContainerType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ContainerType newInstance(String elementName, ComplexDataType parent) {
			return new ContainerType(elementName, parent);
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
	
  	
  
	/** list of A element. 
	 *  @serial
	 */	
	private List<AType> m_aList = new ArrayList<AType>();
	
	/** list of B element. 
	 *  @serial
	 */	
	private List<BType> m_bList = new ArrayList<BType>();
	
	/** list of C element. 
	 *  @serial
	 */	
	private List<CType> m_cList = new ArrayList<CType>();
	
	/**
	 * Get the embedded list of A elements.
	 * @return list of items.
	 */
	public List<AType> getAs() {
		return m_aList;
	}
		
	/**
	 * This method adds data to the list of A.
	 * @param data the item that needs to be added.
	 */
	void setA(AType data) {
		m_aList.add(data);
	}
		
	/**
	 * Get the embedded list of B elements.
	 * @return list of items.
	 */
	public List<BType> getBs() {
		return m_bList;
	}
		
	/**
	 * This method adds data to the list of B.
	 * @param data the item that needs to be added.
	 */
	void setB(BType data) {
		m_bList.add(data);
	}
		
	/**
	 * Get the embedded list of C elements.
	 * @return list of items.
	 */
	public List<CType> getCs() {
		return m_cList;
	}
		
	/**
	 * This method adds data to the list of C.
	 * @param data the item that needs to be added.
	 */
	void setC(CType data) {
		m_cList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_aList, ((ContainerType)that).m_aList))
			return false;
		
		if (!Compare.equals(m_bList, ((ContainerType)that).m_bList))
			return false;
		
		if (!Compare.equals(m_cList, ((ContainerType)that).m_cList))
			return false;
		
		return true;
	}	

  
  
}
