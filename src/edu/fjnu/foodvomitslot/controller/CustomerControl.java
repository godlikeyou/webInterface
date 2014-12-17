package edu.fjnu.foodvomitslot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




import org.springframework.web.bind.annotation.RequestMapping;

import edu.fjnu.foodvomitslot.service.CustomerServiceInte;



@Controller
public class CustomerControl {
	
	CustomerServiceInte customerService;
	@Autowired
	public void setCustomerService(CustomerServiceInte customerService) {
		this.customerService = customerService;
	}


	@RequestMapping(value="/customerlogin")
	public String customerLogin(HttpServletRequest request){
		boolean flag = this.customerService.customerLogin("Àî°×", "123456");
		System.out.println(flag);
		return "customerlogin";
	}
}
