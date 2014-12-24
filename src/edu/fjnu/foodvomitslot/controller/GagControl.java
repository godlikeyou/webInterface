package edu.fjnu.foodvomitslot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.fjnu.foodvomitslot.model.TbGag;
import edu.fjnu.foodvomitslot.service.GagServiceInte;

@Controller
@RequestMapping("/article")
public class GagControl {
	@Autowired
	private GagServiceInte gagServiceInte;
	
	@RequestMapping(value="/allarticle",method=RequestMethod.GET)
	@ResponseBody
	public JSONArray showAllArticle(HttpServletRequest request,HttpServletResponse response){
		List<TbGag> listGap = gagServiceInte.selectAllGag();
		for(int i = 0;i < listGap.size();i ++){
			System.out.println("xx"+listGap.get(i).getgContent());
		}
		JSONArray jo = JSONArray.fromObject(listGap);
		System.out.println("xx+"+jo);
		return jo;
	}
}
