<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  
  <body >
  <div align="center">
    <table border="1">
    <th align="center" bgcolor="green" colspan="2">证券公司信息管理</th>
    <tr><td>
     <ul>
       <li><a href="company/queryCompany.jsp">查询证券公司信息</a></li>
       <li><a href="company/addCompany.jsp">添加证券公司信息</a></li>
     </ul>
    
    </td></tr>
    <tr><td>
     <ul>
       <li><a href="lucre/queryLucre.jsp">查询股票盈亏信息</a></li>
     </ul>
    
    </td></tr>
    </table>
    </div>
  </body>
</html>
