package edu.fjnu.foodvomitslot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.fjnu.foodvomitslot.service.CustomerServiceInte;



@Controller
public class CustomerControl {
	
	CustomerServiceInte customerService;
	@Autowired
	public void setCustomerService(CustomerServiceInte customerService) {
		this.customerService = customerService;
	}


	@RequestMapping(value="/blog/{blogId}",method=RequestMethod.PUT)
	@ResponseBody
	public String customerLogin(@PathVariable("blogId") Long blogid,HttpServletRequest request,HttpServletResponse response){
		System.out.println("......."+blogid);
		boolean flag = this.customerService.customerLogin("Àî°×", "123456");
		System.out.println(flag);
		//ModelAndView mv = new ModelAndView() ;
		String xx = "bbbbbbbb";
		return xx;
	}
	
	@RequestMapping(value="/blog/{blogId}",method=RequestMethod.POST)
	@ResponseBody
	public String customerLoginn(@PathVariable("blogId") Long blogid,HttpServletRequest request,HttpServletResponse response){
		System.out.println("cccccccccc"+blogid);
		boolean flag = this.customerService.customerLogin("Àî°×", "123456");
		System.out.println(flag);
		String xx = "bbbbbbbb";
		return xx;
	}
}
