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
						<td colspan="2" align="center">
							<span class="content_title">회원 가입 실패! 다시 확인해주세요.</span><br>
							<input type="button" value="회원가입 돌아가기" onclick="javascript:history.go(-1);">
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