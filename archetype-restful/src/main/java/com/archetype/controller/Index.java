package com.archetype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "value")
public class Index {
	
	@RequestMapping(value = "json")
	public @ResponseBody void jsonTest() {
		
	}
}
