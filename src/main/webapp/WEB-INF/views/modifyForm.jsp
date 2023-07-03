<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/title.css">
<link rel="stylesheet" href="/resources/css/content.css">
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
				<table width="50%" border="0" cellpadding="10" cellspacing="0">
					<tr>
						<td colspan="2" align="center"><span class="content_title">회원 가입</span></td>
					</tr>
					<form action="modifyOk" method="post" name="join_frm">
					<tr>
						<td class="content_text">아 이 디 : </td>
						<td><input class="inputbox" type="text" name="mid" value="${memberDto.mid }" readonly="readonly"></td>
					</tr>
					<tr>
						<td class="content_text">비밀번호 : </td>
						<td><input class="inputbox" type="password" name="mpw" value="${memberDto.mpw }"></td>
					</tr>
					<tr>
						<td class="content_text">비밀번호확인 : </td>
						<td><input class="inputbox" type="password" name="mpw_check"></td>
					</tr>
					<tr>
						<td class="content_text">이 름 : </td>
						<td><input class="inputbox" type="text" name="mname" value="${memberDto.mname }"></td>
					</tr>
					<tr>
						<td class="content_text">이 메 일 : </td>
						<td><input class="inputbox" type="text" name="memail" value="${memberDto.memail }"></td>
					</tr>
					<tr>
						<td class="content_text">가 입 일 : </td>
						<td><input class="inputbox" type="text" name="mdate" value="${memberDto.mdate }" readonly="readonly"></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
						<input class="btn01" type="button" value="수정완료" onclick="joinCheck()">&nbsp;&nbsp;
						<input class="btn01" type="button" value="수정취소" onclick="javascript:window.location.href='go.history(-1);'">
						</td>
					</tr>
					</form>
				</table>
				</center>
			</td>
		</tr>	
	</table>
	</center>
	<%@ include file="include/footer.jsp" %>
</body>
</html>