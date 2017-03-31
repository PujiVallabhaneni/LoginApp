<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Successfull Login!!</h3>
<jsp:useBean id="user" class="com.pujitha.login.dto.User" scope="request">
     <jsp:setProperty property="*" name="user" />
</jsp:useBean>

 <br> Hello <jsp:getProperty property="userName" name="user"/> 

<br> Address:  <jsp:getProperty property="address" name="user"/>
<br> City: <jsp:getProperty property="city" name="user"/>
<br> pincode: <jsp:getProperty property="pincode" name="user"/>
</body>
</html>