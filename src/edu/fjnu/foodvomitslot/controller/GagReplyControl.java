package edu.fjnu.foodvomitslot.controller;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.fjnu.foodvomitslot.model.TbGag;
import edu.fjnu.foodvomitslot.model.TbGagReply;
import edu.fjnu.foodvomitslot.service.GagReplyServiceInte;
import edu.fjnu.foodvomitslot.util.GlobalVariable;
import edu.fjnu.foodvomitslot.util.Page;

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
	@RequestMapping(value="/rec/{gid}/{currentpage}",method=RequestMethod.GET)
	@ResponseBody
	public JSONArray findRecByGId(@PathVariable("gid") String gid,@PathVariable("currentpage")String currentPage,HttpServletRequest request,HttpServletResponse response){
		int pageSize = GlobalVariable.GAG_PAGE_SIZE;
		System.out.println("xx"+gid+"yy"+currentPage);
		Page page = Page.newBuilder(Integer.valueOf(currentPage), pageSize, "rec");
		page.getParams().put("gid", gid);
		List<TbGagReply> list = gagReplyServiceInte.findRecByGId(page,Integer.valueOf(gid));
		JSONArray jo = JSONArray.fromObject(list);
		System.out.println("hh+"+jo);
		return jo;
	}
}
