package com.gyojincompany.home.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.home.dao.ProfileDao;

@Controller
public class HomeController {
	
	@Autowired//DI 자동 주입 
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		
		ProfileDao dao = sqlSession.getMapper(ProfileDao.class);
		
		int joinCheck = dao.memberJoinDao(mid, mpw, mname, memail);
		//회원가입 성공하면 joincheck=1
		
		if(joinCheck == 1) {//회원 가입 성공
			model.addAttribute("mname", mname);
			model.addAttribute("mid", mid);
			model.addAttribute("mpw", mpw);
			
			return "joinOk";
		} else {
			return "joinFail";
		}
		
		
	}

}
