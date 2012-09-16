<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/jsp/tablib.jsp" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_query.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script type="text/javascript" src="/WEB-INF/js/jquery/jquery-1.6.1.min.js" ></script>
  <script type="text/javascript">
  function sbmt() {
  	if ($("#username").val() == "") {
		$("#queryform").attr("action","/user/user_query.do?get=all");
	} else {
	}
	$("#queryform").submit();
  }
  </script>
  </head>
  
  <body>
  	<form action="/user/user_query.do" method="get">
  		<input name="username" type="text" id="username">
  		<input id="submit" name="提交" type="submit" onClick="sbmt();">
  	</form>
  	
  	<table>
  		<tr>
  			<td>用户名</td>
  		</tr>
  		<c:if test="${user!=null}">
  		<tr>
  			<td><c:out value="${user.name}" /></td>
  			<td><c:out value="${user.password}" /></td>
  		</tr>
  		</c:if>
  		<c:forEach items="${users}" var="user">
  		<tr>
  			<td><c:out value="${user.name}" /></td>
  			<td><c:out value="${user.password}" /></td>
  		</tr>
  		</c:forEach>
  	</table>
  </body>
</html>
