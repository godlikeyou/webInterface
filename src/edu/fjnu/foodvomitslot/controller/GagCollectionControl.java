package edu.fjnu.foodvomitslot.controller;

import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.fjnu.foodvomitslot.model.TbGagCollection;
import edu.fjnu.foodvomitslot.service.GagCollectionServiceInte;
import edu.fjnu.foodvomitslot.util.GlobalVariable;

@Controller
@RequestMapping("/collection")
public class GagCollectionControl {
	@Autowired
	private GagCollectionServiceInte gagCollectionInte;
	@RequestMapping(value="/addGagCollection",method=RequestMethod.POST)
	@ResponseBody
	public String addGagCollection(HttpServletRequest request,HttpServletResponse response){
		String userId = request.getParameter("uid");//must login user,user name is unique
		String gagId = request.getParameter("gid");
		System.out.println("uid"+userId+"gid"+gagId);
		Date time = new Date(new Date().getTime());
		Random r = new Random();
		TbGagCollection gc = new TbGagCollection();
		gc.setGcId(r.nextInt()%1000000000);
		gc.setcId(Integer.parseInt(userId));
		gc.setGcStatus(GlobalVariable.GAG_COLLECTED);//
		gc.setGcTime(time);
		gc.setgId(Integer.parseInt(gagId));
		if( gagCollectionInte.insert(gc) > 0){
			return "success";
		}
		return "failure";
	}
	@RequestMapping(value="/cancelGagCollection",method=RequestMethod.POST)
	@ResponseBody
	public String cancelGagCollection(HttpServletRequest request,HttpServletResponse response){
		String userId = request.getParameter("uid");
		String gagId = request.getParameter("gid");
		return "failure";
	}
}
