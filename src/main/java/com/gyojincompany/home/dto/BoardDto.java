package com.gyojincompany.home.dto;

import java.sql.Timestamp;

public class BoardDto {
	
	private int qnum;//게시판 번호(기본키)
	private String qid;//글쓴이 아이디
	private String qcontent;//글 내용
	private Timestamp qdate;//글 등록일
	
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardDto(int qnum, String qid, String qcontent, Timestamp qdate) {
		super();
		this.qnum = qnum;
		this.qid = qid;
		this.qcontent = qcontent;
		this.qdate = qdate;
	}

	public int getQnum() {
		return qnum;
	}

	public void setQnum(int qnum) {
		this.qnum = qnum;
	}

	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public Timestamp getQdate() {
		return qdate;
	}

	public void setQdate(Timestamp qdate) {
		this.qdate = qdate;
	}
	
	
	
}
