package com.gyojincompany.home.dao;

import java.util.List;

import com.gyojincompany.home.dto.BoardDto;
import com.gyojincompany.home.dto.MemberDto;

public interface ProfileDao {
	//**회원관리**
	public int memberJoinDao(String mid, String mpw, String mname, String memail);
	//회원 가입 insert
	public int joinIdCheckDao(String mid);
	//1이 반환되면 이미 존재하는 아이디
	public int loginOkDao(String mid, String mpw);
	//1이 반환되면 아이와 비번이 일치하는 계정이 존재
	public MemberDto getMemberInfo(String mid);
	//아이디로 검색하여 해당 레코드를 반환
	public int memberModify(String mid, String mpw, String mname, String memail);
	//회원 정보 수정
	
	//**게시판관리**
	public int writeDao(String qid, String qcontent);//질문게시판 글쓰기
	public List<BoardDto> listDao(int amount, int pageNum);//모든 글 목록 불러오기
	public BoardDto questionViewDao(String qnum);//해당 번호의 글 하나 불러오기
	
	
	
}
