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

import edu.fjnu.foodvomitslot.model.TbGagReply;
import edu.fjnu.foodvomitslot.service.GagReplyServiceInte;

@Controller
@RequestMapping("/gagreply")
public class GagReplyControl {
	@Autowired
	private GagReplyServiceInte gagReplyServiceInte;
	
	@RequestMapping(value="/addGagReply",method=RequestMethod.POST)
	@ResponseBody
	public String addGagReply(HttpServletRequest request,HttpServletResponse response){
		String gid = request.getParameter("gid");
		String uid = request.getParameter("uid");
		String content = request.getParameter("content");
		TbGagReply gr = new TbGagReply();
		Random r = new Random();
		gr.setGrId(r.nextInt()%1000000000);
		Date time = new Date(new Date().getTime());
		gr.setGrTime(time);
		gr.setGrContent(content);
		gr.setcId(Integer.valueOf(uid));
		gr.setgId(Integer.valueOf(gid));
		if( gagReplyServiceInte.insert(gr) > 0){
			return "success";
		}
		return "failure";
	}
}
