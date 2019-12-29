package org.vic.fixedWidth.MyUnivocityTest;

import com.univocity.parsers.common.*;
import com.univocity.parsers.common.processor.*;
import com.univocity.parsers.conversions.*;
import com.univocity.parsers.fixed.*;
import com.univocity.parsers.common.record.*;


import java.math.*;
import java.util.*;
import java.io.*;  

public class FixedWidthParserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanListProcessor<Car> rowProcessor = new BeanListProcessor<Car>(Car.class);
		int fixedLength[]= {4, 5, 40, 40, 8};
		FixedWidthFields lengths = new FixedWidthFields(fixedLength);

		// creates the default settings for a fixed width parser
		FixedWidthParserSettings settings = new FixedWidthParserSettings(lengths);

		//sets the character used for padding unwritten spaces in the file
		settings.setRowProcessor(rowProcessor);
		settings.getFormat().setPadding('_');
		settings.getFormat().setLineSeparator("\n");
		

		// creates a fixed-width parser with the given settings
		FixedWidthParser parser = new FixedWidthParser(settings);

		// parses all rows in one go.
		
		  try { 
		  Reader reader = new FileReader("C:\\testFiles\\example.txt");
		  //Reader reader = new FileReader("src/Resource/example.txt");
		  List<String[]> allRows = parser.parseAll(reader);
		  
		  List<Car> beans = rowProcessor.getBeans();
		  for (int i = 0; i < beans.size()-1; i++) { 
			  System.out.println(beans.get(i));
		  
		  }
		  
			/*
			 * for (int i = 0; i < allRows.size()-1; i++) { String[] strings
			 * =allRows.get(i); String s=Arrays.toString(strings);
			 * System.out.println(s.substring(1,s.length()-1)); }
			 */
		  
		  
		  } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
		 
	}

}
