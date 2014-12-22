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
import edu.fjnu.foodvomitslot.service.CustomerServiceInte;

@Controller
@RequestMapping("/customer")
public class CustomerControl {

	CustomerServiceInte customerService;

	@Autowired
	public void setCustomerService(CustomerServiceInte customerService) {
		this.customerService = customerService;
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
	public String customerLoginn(HttpServletRequest request,
			HttpServletResponse response) {
		// 获取传过来的json数据
		System.out.println("xxx");
		String customer = request.getParameter("customer");
		// 解析
		JSONObject jb = JSONObject.fromObject(customer);
		JSONArray ja = jb.getJSONArray("customer");
		String customername = ja.getJSONObject(0).getString("customerName");
		String customerpasswd = ja.getJSONObject(0).getString("customerPasswd");
		// 验证
		boolean flag = this.customerService.customerLogin(customername,
				customerpasswd);
		// 组装json，返回
		String result = null;
		JSONObject jo = new JSONObject();
		Map<String, String> map1 = new HashMap<String, String>();
		JSONArray ja1 = new JSONArray();
		if (flag == true) {
			map1.put("result", "001");
			ja1 = JSONArray.fromObject(map1);
		} else {
			map1.put("result", "002");
			ja1 = JSONArray.fromObject(map1);
		}
		jo.put("customer", ja1);
		result = jo.toString();
		return result;
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
