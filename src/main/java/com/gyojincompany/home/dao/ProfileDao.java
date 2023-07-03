package com.gyojincompany.home.dao;

import com.gyojincompany.home.dto.MemberDto;

public interface ProfileDao {
	
	public int memberJoinDao(String mid, String mpw, String mname, String memail);
	//회원 가입 insert
	public int joinIdCheckDao(String mid);
	//1이 반환되면 이미 존재하는 아이디
	public int loginOkDao(String mid, String mpw);
	//1이 반환되면 아이와 비번이 일치하는 계정이 존재
	public MemberDto getMemberInfo(String mid);
	//아이디로 검색하여 해당 레코드를 반환
}
