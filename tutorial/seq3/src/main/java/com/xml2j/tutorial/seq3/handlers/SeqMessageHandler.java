package com.xml2j.tutorial.seq3.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: SEQ3 
  Generation date: Sun Apr 29 12:06:43 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.tutorial.seq3.ContainerType3;
import com.xml2j.tutorial.seq3.ContainerType3Handler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class SeqMessageHandler extends
		XMLMessageHandler<ContainerType3> {
	
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
		, new ContainerType3Handler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, ContainerType3.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

