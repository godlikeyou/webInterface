package edu.fjnu.foodvomitslot.controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.fjnu.foodvomitslot.model.TbCustomer;
import edu.fjnu.foodvomitslot.service.CustomerFansServiceInte;
import edu.fjnu.foodvomitslot.service.CustomerServiceInte;

@Controller
@RequestMapping("/customer")
public class CustomerControl {

	CustomerServiceInte customerService;
	CustomerFansServiceInte customerfansService;
	@Autowired
	public void setCustomerService(CustomerServiceInte customerService) {
		this.customerService = customerService;
	}
	
	@Autowired
	public void setCustomerfansService(CustomerFansServiceInte customerfansService) {
		this.customerfansService = customerfansService;
	}

	@RequestMapping(value = "/blog/{blogId}", method = RequestMethod.PUT)
	@ResponseBody
	public String customerLogin(@PathVariable("blogId") Long blogid,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("......." + blogid);
		boolean flag = this.customerService.customerLogin("���", "123456");
		System.out.println(flag);
		// ModelAndView mv = new ModelAndView() ;
		String xx = "bbbbbxxb";
		return xx;
	}

	/*
	 * 用户登录
	 */
	@RequestMapping(value = "/1.0/customerLogin", method = RequestMethod.POST)
	@ResponseBody
	public JSONArray customerLoginn(HttpServletRequest request,
			HttpServletResponse response) {
		String customerName = request.getParameter("customer");
		String passwd = request.getParameter("passwd");
		//boolean flag = this.customerService.customerLogin(customer,passwd);
		// 组装json，返回
		String result = null;
		JSONObject jo = new JSONObject();
		Map<String, String> map1 = new HashMap<String, String>();
		JSONArray ja1 = new JSONArray();
		TbCustomer customer = this.customerService.getCustomerInfoByName(customerName);
		if(customer == null){
			map1.put("result", "003");
		}else{
			if(customer.getcPassword() == null || !customer.getcPassword().equals(passwd)){
				map1.put("result", "002");
			}else{
				map1.put("result", "001");
				int fansCount = this.customerfansService.getCustomerFansCount(customer.getcId());
				map1.put("fansCount", String.valueOf(fansCount));
			}
		}
		ja1 = JSONArray.fromObject(map1);
		return ja1;
	}

	/*
	 * 通过用户ID获取用户信息
	 */
	@RequestMapping(value = "/1.0/customer/{customerId}", method = RequestMethod.GET)
	@ResponseBody
	public String customerInfo(@PathVariable("customerId") Integer customerId,
			HttpServletRequest request, HttpServletResponse response) {
		TbCustomer customer = this.customerService
				.getCustomerInfoByCid(customerId);
		String result = null;
		JSONObject jo = new JSONObject();
		Map<String, String> map1 = new HashMap<String, String>();
		JSONArray ja1 = new JSONArray();
		map1.put("result", "002");
		ja1 = JSONArray.fromObject(map1);
		jo.put("customer", ja1);
		result = jo.toString();
		return result;
	}
	
	@RequestMapping(value="/blogx/{blogId}",method=RequestMethod.GET)
	@ResponseBody
	public JSONObject customerLogin1(@PathVariable("blogId") Long blogid,HttpServletRequest request,HttpServletResponse response){
		System.out.println("......."+blogid);
		boolean flag = this.customerService.customerLogin("���", "123456");
		System.out.println(flag);
		//ModelAndView mv = new ModelAndView() ;
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "kamal");
		map.put("id", "123");
		JSONObject jo = JSONObject.fromObject(map);
		String xx = "bbbbbxxb";
		return jo;
	}
}
