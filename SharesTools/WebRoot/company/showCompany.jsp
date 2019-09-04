<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="com.mosorg.sharestools.vo.Company"%>
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
  <%Company company =(Company)request.getAttribute( "company");%>
    <form action="company/show" method="post">
    <table border="1">
    <th align="center" bgcolor="green" colspan="2">证券公司信息</th>
    <tr><td align="right">股票代码：</td><td><%=company.getCode()%></td></tr>
    <tr><td align="right">证券公司名称：</td><td><%=company.getName()%></td></tr>
    <tr><td align="right">证券公司佣金费率：</td><td><%=company.getCommissionRate()%></td></tr>
    <tr align="center"><td colspan="2"><a href="company/load?code=<%=company.getCode()%>">修改</a>|<a href="company/delete?code=<%=company.getCode()%>">删除</a></td></tr>
    <tr><td colspan="2"><a href='index.jsp'>返回首页</a></td></tr>
    </table>
    </form>
  </body>
</html>
