package com.photobook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
@Transactional
public class MainController {

	/*
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(ModelMap model) {
		return "main/main";
	}


    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public String albums(ModelMap model) {
        return "main/albums";
    }

}
