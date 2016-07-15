package com.rkskekabc.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String message){
		logger.info("doC called.............." + message);
		return "result";
	}
}
