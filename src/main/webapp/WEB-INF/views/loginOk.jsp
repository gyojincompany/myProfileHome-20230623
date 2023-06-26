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
	<%
		String fail = (String) request.getAttribute("loginCheck");
		if(fail.equals("0")) {	
	%>
		<script type="text/javascript">
			alert('아이디 또는 비밀번호가 다릅니다. 다시 확인하시기 바랍니다!');
			history.go(-1);
		</script>
	<%
		}
	%>	
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
							<span class="content_title">${mid }님 로그인 하셨습니다. 반갑습니다!</span><br>							
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