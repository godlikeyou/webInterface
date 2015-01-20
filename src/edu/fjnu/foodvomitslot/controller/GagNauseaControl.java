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

import edu.fjnu.foodvomitslot.model.TbGag;
import edu.fjnu.foodvomitslot.model.TbGagNausea;
import edu.fjnu.foodvomitslot.service.GagNauseaServiceInte;
import edu.fjnu.foodvomitslot.service.GagServiceInte;
import edu.fjnu.foodvomitslot.util.GlobalVariable;

@Controller
@RequestMapping("/gagnausea")
public class GagNauseaControl {
	@Autowired
	private GagNauseaServiceInte gagNauseaServiceInte;
	@Autowired 
	private GagServiceInte gagServiceInte;
	/**
	 * @description 增加恶心或者点赞，即点击向下手指，一个用户要么给恶心要么给赞，不能两个都给
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/addGagNausea",method=RequestMethod.POST)
	@ResponseBody
	public String addGagNausea(HttpServletRequest request,HttpServletResponse response){
		String gid = request.getParameter("gid");
		String uid = request.getParameter("uid");
		String type = request.getParameter("type");//标识恶心还是赞
		Date time = new Date(new Date().getTime());
		TbGagNausea gn = new TbGagNausea();
		Random r = new Random();
		gn.setGnId(r.nextInt()%1000000000);
		gn.setcId(Integer.parseInt(uid));
		gn.setgId(Integer.parseInt(gid));
		if( type.equals(GlobalVariable.GAG_GOOD))
			gn.setGnStatus(GlobalVariable.GAG_GOOD);
		else
			gn.setGnStatus(GlobalVariable.GAG_NAUSEA);
		gn.setGnTime(time);
		if( gagNauseaServiceInte.insert(gn) > 0){
			TbGag gag = gagServiceInte.selectByPrimaryKey(Integer.valueOf(gid));
			gag.setGtGoodcount(gag.getGtGoodcount() + 1);
			this.gagServiceInte.updateByPrimaryKeySelective(gag);
			return "success";
		}
		return "failure";
	}
	
	/**
	 * @description 取消恶心或者取消点赞
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/goodGag",method=RequestMethod.POST)
	@ResponseBody
	public String goodGag(HttpServletRequest request,HttpServletResponse response){
		
		return "failure";
	}
}
