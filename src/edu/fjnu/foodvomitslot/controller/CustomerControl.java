package edu.fjnu.foodvomitslot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

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
@RequestMapping("/customer")
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
	
	@RequestMapping(value="/1.0/customerLogin",method=RequestMethod.POST)
	@ResponseBody
	public String customerLoginn(HttpServletRequest request,HttpServletResponse response){
		String customer = request.getParameter("customer");
		/*return customer;*/
		JSONObject jb = JSONObject.fromObject(customer);
		JSONArray ja = jb.getJSONArray("customer");
		String customername = ja.getJSONObject(0).getString("customerName");
		String customerpasswd = ja.getJSONObject(0).getString("customerPasswd");
		//boolean flag = this.customerService.customerLogin(customername,customerpasswd);
		//System.out.println(flag);
		String xx = customername+customerpasswd;
		return xx;
	}
}
