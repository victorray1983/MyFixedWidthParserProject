package org.vic.fixedWidth.MyUnivocityTest;

import com.univocity.parsers.annotations.*;
import com.univocity.parsers.common.*;
import com.univocity.parsers.common.processor.*;
import com.univocity.parsers.conversions.*;
import com.univocity.parsers.fixed.*;

public class Car {


	    @Parsed(index = 0)
	    private String year;

	    @Parsed(index = 1)
	    private String make;

	    @Parsed(index = 2)
	    private String model;

	    @Parsed(index = 3)
	    private String description;

	    @Parsed(index = 4)
	    private String price;

	/*
	 * @Parsed
	 * 
	 * @Format(formats = "dd/M/yyyy") private java.util.Date created;
	 */
	    @Override
	    public String toString() {
	        return "Car{" +
	                "Year=" + year +"	"+
	                "Make=" + make +"	"+
	                "Model=" + model +"	"+
	                 "Description=" + description +"	"+
	                  "Price=" + price +
	                '}';
	    }
}
