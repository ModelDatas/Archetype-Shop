package com.archetype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;

/**
 * @author CKM-KING
 * @date 2017年11月23日:下午3:30:36
 * <p>describe:</p>
 * <p>context:</p>
 * @version 1.0.0
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex(){
		
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		
		return page;
	} 
}
