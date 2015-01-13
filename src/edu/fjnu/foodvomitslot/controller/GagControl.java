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
import edu.fjnu.foodvomitslot.service.GagServiceInte;
import edu.fjnu.foodvomitslot.util.GlobalVariable;
import edu.fjnu.foodvomitslot.util.Page;

@Controller
@RequestMapping("/article")
public class GagControl {
	@Autowired
	private GagServiceInte gagServiceInte;
	
	@RequestMapping(value="/allarticle/{currentPage}",method=RequestMethod.GET)
	@ResponseBody
	public JSONArray showAllArticle(@PathVariable String currentPage,HttpServletRequest request,HttpServletResponse response){
		System.out.println("cu"+currentPage);
		int pageSize = GlobalVariable.GAG_PAGE_SIZE;
		Page page = Page.newBuilder(Integer.valueOf(currentPage), pageSize, "allarticle");
		List<TbGag> listGap = gagServiceInte.selectAllGag(page);
		for(int i = 0;i < listGap.size();i ++){
			System.out.println("xx"+listGap.get(i).getgContent());
		}
		JSONArray jo = JSONArray.fromObject(listGap);
		System.out.println("xx+"+jo);
		return jo;
	}
	
	@RequestMapping(value="/allarticle/puretext/{currentPage}",method=RequestMethod.GET)
	@ResponseBody
	public JSONArray showAllArticlePureText(@PathVariable String currentPage,HttpServletRequest request,HttpServletResponse response){
		System.out.println("cu"+currentPage);
		int pageSize = GlobalVariable.GAG_PAGE_SIZE;
		Page page = Page.newBuilder(Integer.valueOf(currentPage), pageSize, "allarticle");
		List<TbGag> listGap = gagServiceInte.selectAllGagPureText(page);
		for(int i = 0;i < listGap.size();i ++){
			System.out.println("xx"+listGap.get(i).getgContent());
		}
		JSONArray jo = JSONArray.fromObject(listGap);
		System.out.println("xx+"+jo);
		return jo;
	}
	@RequestMapping(value="/allarticle/havepic/{currentPage}",method=RequestMethod.GET)
	@ResponseBody
	public JSONArray showAllArticleHavePic(@PathVariable String currentPage,HttpServletRequest request,HttpServletResponse response){
		System.out.println("cu"+currentPage);
		int pageSize = GlobalVariable.GAG_PAGE_SIZE;
		Page page = Page.newBuilder(Integer.valueOf(currentPage), pageSize, "allarticle");
		List<TbGag> listGap = gagServiceInte.selectAllGagHavePic(page);
		for(int i = 0;i < listGap.size();i ++){
			System.out.println("xx"+listGap.get(i).getgContent());
		}
		JSONArray jo = JSONArray.fromObject(listGap);
		System.out.println("xx+"+jo);
		return jo;
	}
	@RequestMapping(value="/gagsize",method=RequestMethod.GET)
	@ResponseBody
	public int countGag(HttpServletRequest request,HttpServletResponse response){
		int size = gagServiceInte.countGag();
		return size;
	}
	
	@RequestMapping(value="/gagsize/puretext",method=RequestMethod.GET)
	@ResponseBody
	public int countGagPureText(HttpServletRequest request,HttpServletResponse response){
		int size = gagServiceInte.countPureText();
		System.out.println("size"+size);
		return size;
	}
	
	@RequestMapping(value="/gagsize/havepic",method=RequestMethod.GET)
	@ResponseBody
	public int countGagHavePic(HttpServletRequest request,HttpServletResponse response){
		int size = gagServiceInte.countHavePic();
		System.out.println("size"+size);
		return size;
	}
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
	@ResponseBody
	public String addGag(HttpServletRequest request,HttpServletResponse response){
		String uri = request.getParameter("uri");
		String content = request.getParameter("content");
		System.out.println("ppp"+uri+":"+content);
		TbGag gag = new TbGag();
		Date t = new Date(new Date().getTime());
		Random r = new Random();
		gag.setgId(r.nextInt()%10000000);
		gag.setgContent(content);
		gag.setgPic(uri);
		gag.setGtGoodcount(0);
		gag.setGtReccount(0);
		gag.setgTime(t);
		gag.setGtId(1);//theme
		gag.setsId(1);//school
		gag.setcId(1);//customer
		if(gagServiceInte.insert(gag) > 0)
			return "success";
		return "failure";
	}
}
