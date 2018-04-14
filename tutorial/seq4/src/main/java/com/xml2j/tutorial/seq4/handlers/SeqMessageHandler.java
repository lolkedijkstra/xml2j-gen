package com.xml2j.tutorial.seq4.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: SEQ4 
  Generation date: Thu Apr 12 19:34:41 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.tutorial.seq4.ContainerType4;
import com.xml2j.tutorial.seq4.ContainerType4Handler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class SeqMessageHandler extends
		XMLMessageHandler<ContainerType4> {
	
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
	public SeqMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new ContainerType4Handler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, ContainerType4.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}
