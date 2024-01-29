<%-- HTML5에서 추가된 input 요소의 type 유형 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String name = request.getParameter("name");
	String birthday = request.getParameter("birthday");
	String age1 = request.getParameter("age1");
	String satisfaction = request.getParameter("satisfaction");
	String email =  request.getParameter("email");
	String tel =  request.getParameter("tel");
	String url = request.getParameter("url");
	String wakeup =  request.getParameter("wakeup");
	String color =  request.getParameter("color");

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이 름 : <%= name %><br/>
	생 일 : <%= birthday %><br/>
	나이 : <%= age1 %><br/>
	만족도 : <%= satisfaction %><br/>
	이메일 : <%= email %><br/>
	연락처 : <%= tel %><br/>	
	기상시간 : <%= wakeup %><br/>
	홈페이지 : <%= url %><br/>
	선호하는 색상 : <%= color %><br/>
</body>
</html>