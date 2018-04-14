package com.xml2j.tutorial.group.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: GROUP 
  Generation date: Thu Apr 12 19:34:41 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.tutorial.group.ContainerType;
import com.xml2j.tutorial.group.ContainerTypeHandler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class GroupMessageHandler extends
		XMLMessageHandler<ContainerType> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "container";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public GroupMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new ContainerTypeHandler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, ContainerType.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}
