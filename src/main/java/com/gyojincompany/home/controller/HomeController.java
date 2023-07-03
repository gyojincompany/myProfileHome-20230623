package com.gyojincompany.home.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.home.dao.ProfileDao;
import com.gyojincompany.home.dto.MemberDto;

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
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		int joinCheck = 0;
		
		ProfileDao dao = sqlSession.getMapper(ProfileDao.class);
		
		//이미 회원가입 여부(아이디 중복 여부)
		int idCheck = dao.joinIdCheckDao(mid);
		//idCheck 가 1이면 이미 있는 아이디
		
		if(idCheck != 1) {
			joinCheck = dao.memberJoinDao(mid, mpw, mname, memail);
			//회원가입 성공하면 joincheck=1
			
		} else {
			model.addAttribute("fail", "idDouble");
			return "joinFail";
		}	
		
		if(joinCheck == 1) {//회원 가입 성공
			model.addAttribute("mname", mname);
			model.addAttribute("mid", mid);
			model.addAttribute("mpw", mpw);
			
			return "joinOk";
		} else {
			return "joinFail";
		}
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk(HttpServletRequest request, HttpSession session, Model model) {
		request.getParameter("mid");
		request.getParameter("mpw");
		
		ProfileDao dao = sqlSession.getMapper(ProfileDao.class);
		
		String loginCheck = String.valueOf(dao.loginOkDao(request.getParameter("mid"), request.getParameter("mpw")));
		//1이면 로그인 성공, 0이면 로그인 실패
		
		
		if(loginCheck.equals("1")) {//로그인 성공
			session.setAttribute("validMember", "yes");
			session.setAttribute("sessionId", request.getParameter("mid"));
			model.addAttribute("loginCheck", loginCheck);
			model.addAttribute("mid", request.getParameter("mid"));
		} else {
			model.addAttribute("loginCheck", loginCheck);
		}
		
		return "loginOk";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();//모든 세션 삭제->로그아웃
		return "redirect:login";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(HttpSession session, Model model) {
		
		String sessionId = (String) session.getAttribute("sessionId");
		
		ProfileDao dao = sqlSession.getMapper(ProfileDao.class);
		
		MemberDto memberDto = dao.getMemberInfo(sessionId);
		
		model.addAttribute("memberDto", memberDto);
		
		return "modifyForm";
	}
	
	@RequestMapping(value = "/modifyOk")
	public String modifyOk(HttpServletRequest request, Model model) {
		
		request.getParameter("mid")
		request.getParameter("mpw")
		request.getParameter("mname")
		request.getParameter("memail")
		
		
		
		return "modifyOk";
	}
	

}
