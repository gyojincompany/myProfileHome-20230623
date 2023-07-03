package com.gyojincompany.home.dto;

public class PageDto {
	
	private int startPage;//현재 화면에서 보여질 시작 페이지 번호
	private int endPage;//현재 화면에서 보여질 마지막 페이지 번호
	private boolean prev;//현재 페이지 보다 낮은 수의 페이지가 있는지의 여부
	private boolean next;//현재 페이지 보다 높은 수의 페이지가 있는지의 여부
	private int total;//전체 글의 개수
	
	private Criteria criteria;

	public PageDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageDto(int total, Criteria criteria) {
		super();
		this.total = total;
		this.criteria = criteria;
		
		this.endPage = (int)(Math.ceil((criteria.getPageNum()/5.0))*5);//ceil->올림
		this.startPage = this.endPage - 4;
		
		int realEndPage = (int)Math.ceil(total*1.0/criteria.getAmount());
		//실제 끝 페이지 번호(중간에 페이지가 끝난 경우)
		
		if(realEndPage < endPage) {
			this.endPage = realEndPage;
		}
		// 처음 계산한 endPage 값보다 realEndPage 값이 작으면 endPage값이 진짜가 아니므로
		// endPage값을 realEndPage값으로 대체
		
		this.prev = this.startPage > 1;
		//시작페이지 번호가 1과 같지 않고 크면 왼쪽에 화살표 생성
		this.next = this.endPage < realEndPage;
		//마지막 페이지 번호가 realEndPage와 같지 않고 작은 경우에만 next 오른쪽 화살표 생성
		
	}

	public PageDto(int startPage, int endPage, boolean prev, boolean next, int total, Criteria criteria) {
		super();
		this.startPage = startPage;
		this.endPage = endPage;
		this.prev = prev;
		this.next = next;
		this.total = total;
		this.criteria = criteria;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}
	
	
}
