package edu.fjnu.foodvomitslot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
import edu.fjnu.foodvomitslot.model.TbCustomerActive;
import edu.fjnu.foodvomitslot.service.CustomerActiveServiceInte;
import edu.fjnu.foodvomitslot.service.CustomerFansServiceInte;
import edu.fjnu.foodvomitslot.service.CustomerServiceInte;
import edu.fjnu.foodvomitslot.util.Page;

@Controller
@RequestMapping("/customer")
public class CustomerControl {

	CustomerServiceInte customerService;
	CustomerFansServiceInte customerfansService;
	CustomerActiveServiceInte customerActiveService;

	@Autowired
	public void setCustomerService(CustomerServiceInte customerService) {
		this.customerService = customerService;
	}

	@Autowired
	public void setCustomerfansService(
			CustomerFansServiceInte customerfansService) {
		this.customerfansService = customerfansService;
	}

	@Autowired
	public void setCustomerActiveService(
			CustomerActiveServiceInte customerActiveService) {
		this.customerActiveService = customerActiveService;
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
		Map<String, String> map1 = new HashMap<String, String>();
		JSONArray ja1 = new JSONArray();
		TbCustomer customer = this.customerService
				.getCustomerInfoByName(customerName);
		if (customer == null) {
			map1.put("result", "003");
		} else {
			if (customer.getcPassword() == null
					|| !customer.getcPassword().equals(passwd)) {
				map1.put("result", "002");
			} else {
				map1.put("result", "001");
				TbCustomerActive ca = this.customerActiveService.selectCustomerActiveByCid(customer.getcId());
				map1.put("fansCount", String.valueOf(ca.getCaFans()));
				map1.put("postCount", String.valueOf(ca.getCaPost()));
				map1.put("collectionCount", String.valueOf(ca.getCaCollection()));
				map1.put("focusCount", String.valueOf(ca.getCaFocus()));
				map1.put("customerName", customerName);
				if(customer.getcPurl() == null)
					map1.put("customerPic", "");
				else
					map1.put("customerPic", customer.getcPurl());
				if(customer.getcNickname() == null)
					map1.put("customerNickname", "");
				else
					map1.put("customerNickname", customer.getcNickname());
				map1.put("customerId", String.valueOf(customer.getcId()));
				if(customer.getcPhone() == null)
					map1.put("customerPhone","");
				else
					map1.put("customerPhone",customer.getcPhone());
				if(customer.getcEmail() == null)
					map1.put("customerEmail","");
				else
					map1.put("customerEmail",customer.getcEmail());
				if(customer.getcSignature() == null)
					map1.put("customerSignature","");
				else
					map1.put("customerSignature",customer.getcSignature());			
			}
		}
		ja1 = JSONArray.fromObject(map1);
		System.out.println("xx+"+ja1);
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

	@RequestMapping(value = "/blogx/{blogId}", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject customerLogin1(@PathVariable("blogId") Long blogid,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("......." + blogid);
		boolean flag = this.customerService.customerLogin("���", "123456");
		System.out.println(flag);
		// ModelAndView mv = new ModelAndView() ;
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "kamal");
		map.put("id", "123");
		JSONObject jo = JSONObject.fromObject(map);
		String xx = "bbbbbxxb";
		return jo;
	}

	// 分页查询测试
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public String list() {
		int pageNo = 2; // 当前查询的页数
		int pageSize = 2; // 一页几条数据
		Page page = Page.newBuilder(pageNo, pageSize, "blog");
		page.getParams().put("name", "李白"); // 这里再保存查询条件
		List<TbCustomer> listc = this.customerService.selectByNameLevelSubject(
				"李白", page); // 这里将page返回前台
		System.out.println("dfsdf==" + listc.size());
		return listc.toString();
	}

	@RequestMapping(value = "/1.0/customerRegister", method = RequestMethod.POST)
	@ResponseBody
	public JSONArray customerRegister(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("xxxx");
		String customerName = request.getParameter("customer");
		String customerPasswd = request.getParameter("passwd");
		Map<String, String> map = new HashMap<String, String>();
		JSONArray ja = new JSONArray();
		if (customerName == null || "".equals("customerName")
				|| customerPasswd == null || "".equals("customerPasswd")) {
			map.put("result", "004");
			ja = JSONArray.fromObject(map);
			return ja;
		} else {
			TbCustomer customer = this.customerService
					.getCustomerInfoByName(customerName);
			if (customer != null) {
				map.put("result", "003");
				ja = JSONArray.fromObject(map);
				return ja;
			} else {
				Random r = new Random();
				TbCustomer c = new TbCustomer();
				int cid = r.nextInt(10000000);
				c.setcId(cid);
				c.setcName(customerName);
				c.setcPassword(customerPasswd);
				c.setCtTypeid(1);
				if (this.customerService.addCustomer(c)) {
					TbCustomerActive ca = new TbCustomerActive();
					ca.setCaId(r.nextInt(10000000));
					Date now = new Date();
					ca.setCaJointime(now);
					ca.setCaLastlogintime(now);
					ca.setCaPost(0);
					ca.setcId(cid);
					if (this.customerActiveService.addCustomerActiveInfo(ca)) {
						map.put("result", "001");
						map.put("fansCount", "0");
						map.put("postCount", "0");
						map.put("collectionCount", "0");
						map.put("focusCount", "0");
						map.put("customerName", customerName);
						map.put("customerPic", "");
						map.put("customerNickname", "");
						map.put("customerPhone","");
						map.put("customerEmail", "");
						ja = JSONArray.fromObject(map);
						return ja;
					} else {
						map.put("result", "002");
						ja = JSONArray.fromObject(map);
						return ja;
					}
				} else {
					map.put("result", "002");
					ja = JSONArray.fromObject(map);
					return ja;
				}
			}
		}
	}
	/*
	 * 修改用户昵称
	 */
	@RequestMapping(value = "/1.0/update/nickname", method = RequestMethod.POST)
	@ResponseBody
	public int updateNickname(HttpServletRequest request,
			HttpServletResponse response){
		String nickname = request.getParameter("nickname");
		Integer cid = Integer.valueOf(request.getParameter("cid"));
		Map map = new HashMap();
		map.put("cNickname", nickname);
		map.put("cId", cid);
		if(this.customerService.updateCustomerNickname(map))
			return 0;
		else
			return 1;
	}
	@RequestMapping(value="/user/alluser",method=RequestMethod.GET)
	@ResponseBody
	public JSONArray selectAllUser(HttpServletRequest request,HttpServletResponse response){
		List<TbCustomer> list = customerService.selectAllUser();
		JSONArray ja = JSONArray.fromObject(list);
		return ja;
	}
}
