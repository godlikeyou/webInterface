package edu.fjnu.foodvomitslot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import edu.fjnu.foodvomitslot.model.TbCustomerFans;
import edu.fjnu.foodvomitslot.service.CustomerFansServiceInte;
import edu.fjnu.foodvomitslot.service.CustomerServiceInte;

@Controller
@RequestMapping("/customerfans")
public class CustomerFansControl {
	CustomerFansServiceInte customerFansService;
	CustomerServiceInte customerService;

	@Autowired
	public void setCustomerFansService(
			CustomerFansServiceInte customerFansService) {
		this.customerFansService = customerFansService;
	}

	@Autowired
	public void setCustomerService(CustomerServiceInte customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(value = "/Myfans/{CustomerId}", method = RequestMethod.GET)
	@ResponseBody
	public String customerLogin(@PathVariable("CustomerId") Integer cid,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("......." + cid);
		List<TbCustomerFans> customerfans = this.customerFansService.getCustomerFans(cid);
		int fansSize = customerfans.size();
		JSONObject jo = new JSONObject();
		if(fansSize != 0){
			List<TbCustomer> listCustomer = new ArrayList<TbCustomer>();
			TbCustomer customer = new TbCustomer();
			for(int i=0;i<customerfans.size();i++){
				customer = this.customerService.getCustomerInfoByCid(customerfans.get(i).getcFansid());
				listCustomer.add(customer);
			}
			//构造json
			
			Map<String, String> map1 = new HashMap<String, String>();
			List<Map> list = new ArrayList<Map>();
			for(int i=0;i<listCustomer.size();i++){
				map1.put("customerName", listCustomer.get(i).getcName());
				map1.put("customerNickname", listCustomer.get(i).getcNickname());
				map1.put("customerPurl", listCustomer.get(i).getcPurl());
				list.add(map1);
				map1.clear();
			}               
	        jo.put("customerfans", list);
	        System.out.println("jjo==="+jo.toString());
		}else{
			
		}
		return jo.toString();
	}

}
