package edu.fjnu.foodvomitslot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.fjnu.foodvomitslot.service.GagReplyServiceInte;

@Controller
@RequestMapping("/gagreply")
public class GagReplyControl {
	@Autowired
	private GagReplyServiceInte gagReplyServiceInte;
	
	@RequestMapping(value="/addGagReply",method=RequestMethod.POST)
	@ResponseBody
	public String addGagReply(HttpServletRequest request,HttpServletResponse response){
		return "failure";
	}
}
