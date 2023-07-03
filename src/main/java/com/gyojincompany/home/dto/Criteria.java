package com.gyojincompany.home.dto;

public class Criteria {
	
	private int pageNum=1;//현재 페이지 번호(글 목록에서 무조건 처음에는 1페이지가 보여져야 하므로 초기값을 1로 지정)
	private int amount=5;//한 페이지 당 출력될 글의 갯수
	private int startNum;//선택된 페이지에서 시작할 글의 번호
	
	public Criteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Criteria(int pageNum, int amount, int startNum) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
		this.startNum = startNum;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	
	
	
}
