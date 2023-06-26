package com.gyojincompany.home.dao;

public interface ProfileDao {
	
	public int memberJoinDao(String mid, String mpw, String mname, String memail);
	//회원 가입 insert
}
