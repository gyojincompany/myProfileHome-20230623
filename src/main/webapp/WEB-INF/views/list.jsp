<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/title.css">
<link rel="stylesheet" href="/resources/css/content.css">
<link rel="stylesheet" href="/resources/css/board.css">
<script type="text/javascript" src="/resources/js/join.js"></script>
<title>** Profile Home **</title>
</head>
<body>
	<%@ include file="include/header.jsp" %>
	<center>
	<table width="60%" border="0" cellpadding="20" cellspacing="0">
		<tr align="center">
			<td>
				<span class="title01">DEVELOPER GYOJIN's PROFILE</span>
			</td>
		</tr>
		<tr align="center">
			<td>
				<span class="title02">I'm Gyojin Lee, a developer who wants a development job. Please call me back.</span>
			</td>
		</tr>		
		<tr>
			<td style="background-color: #006194;height: 500px;">
				<center>
				<table width="80%" border="0" cellpadding="10" cellspacing="0">
					<tr>
						<td colspan="4" align="center"><span class="content_title">질문 게시판</span></td>
					</tr>
					<tr>
						<th class="title" width="10%">번호</th>
						<th class="title" width="15%">아이디</th>
						<th class="title" width="60%">질문내용</th>
						<th class="title" width="20%">등록일</th>						
					</tr>
					
					<c:forEach items="${boardDtos }" var="dto">
					<tr>
						<td class="content">${dto.qnum }</td>
						<td class="content">${dto.qid }</td>
						<td class="content">
						<a href="questionView?qnum=${dto.qnum }">${dto.qcontent }</a>
						</td>
						<td class="content">
							<c:out value="${fn:substring(dto.qdate,0,10) }"></c:out>
						</td>
					</tr>
					</c:forEach>
					<tr>
						<td colspan="4" align="right">
							<input class="btn01" type="button" value="글쓰기" onclick="javascript:window.location.href='question'">
						</td>
					</tr>
					<tr>
						<td colspan="5" align="center">
							<c:if test="${pageMaker.prev }">
								<a href="list?pageNum=${pageMaker.startPage-5 }">◀◀</a>&nbsp;&nbsp;&nbsp;																
							</c:if>
							<c:if test="${currPage != 1 }">
								<a href="list?pageNum=${currPage-1 }">◀</a>&nbsp;&nbsp;&nbsp;
							</c:if>
							<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="num">
								<c:choose>
									<c:when test="${currPage==num }">
										<span style="font-weight: bold;text-decoration:underline;color: #000000;">${num }</span>&nbsp;&nbsp;&nbsp;
									</c:when>
									<c:otherwise>
										<a href="list?pageNum=${num }">${num }</a>&nbsp;&nbsp;&nbsp;	
									</c:otherwise>									
								</c:choose>
							</c:forEach>
							<c:if test="${pageMaker.next }">
								<a href="list?pageNum=${currPage+1 }">▶</a>&nbsp;&nbsp;&nbsp;
								<a href="list?pageNum=${pageMaker.startPage+5 }">▶▶</a>								
							</c:if>
						</td>
					</tr>
				</table>
				</center>
			</td>
		</tr>	
	</table>
	</center>
	<%@ include file="include/footer.jsp" %>
</body>
</html>