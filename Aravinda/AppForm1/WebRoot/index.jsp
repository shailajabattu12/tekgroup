<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
<h1>Registration Form</h1>
    <form action="index" method="post">
        <table cellpadding="3pt">
            <tr>
                <td>EmployeeId :</td>
                <td><input type="text" name="id" /></td>
            </tr>
            <tr>
                <td>EmployeeName:</td>
                <td><input type="text" name="name"  /></td>
            </tr>   
            <tr>        
                <td>Address :</td>
                <td><input type="text" name="address"  /></td>
            </tr>
            
        </table>
        <p />
        <input type="submit" value="Register" />
    </form>  </body>
</html>
