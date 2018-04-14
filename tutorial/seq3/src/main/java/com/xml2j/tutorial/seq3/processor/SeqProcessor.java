package com.xml2j.tutorial.seq3.processor;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: SEQ3 
  Generation date: Thu Apr 12 19:34:41 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.ConsoleWriter;
	
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.MessageProcessor;
import com.xml2j.xml.core.ProcessorException;
import com.xml2j.xml.core.XMLEvent;

/**
 *	This class processes events that are sent by the XML2J framework.
 */
public class SeqProcessor implements MessageProcessor {

	@Override
	public void process(XMLEvent evt, ComplexDataType data)
			throws ProcessorException {

		/*
		 *	TODO Auto-generated method stub	implement your own handling here.
		 * 	Use the runtime configuration file to determine which events are to be sent to the processor.
		 */	
			
		if (evt == XMLEvent.END) {
			data.print( ConsoleWriter.out );
		}
	}
}