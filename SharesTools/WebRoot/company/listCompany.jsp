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
  <%ArrayList companys =(ArrayList)request.getAttribute( "companys");%>
    <form action="company/show" method="post">
    <table border="1">
    <th align="center" bgcolor="green" colspan="2">证券公司信息</th>
    <tr><td align="center">股票代码：</td><td align="center">证券公司名称：</td><td align="center">证券公司佣金费率：</td><td align="center">操作</td></tr>
    <%
	for(int i = 0; i < companys.size(); i++) {
	Company company = (Company) companys.get(i);
	%> 
    <tr><td><input type="text" name="code" value="<%=company.getCode()%>"/></td><td><input type="text" name="name" value="<%=company.getName()%>"/></td><td><input type="text" name="commissionRate" value="<%=company.getCommissionRate()%>"/><td colspan="3"><a href="company/show?code=<%=company.getCode()%>">详情</a>|<a href="company/load?code=<%=company.getCode()%>">修改</a>|<a href="company/delete?code=<%=company.getCode()%>">删除</a></td></tr>
    <%
	}
	%>
	<tr><td colspan="4"><a href='index.jsp'>返回首页</a></td></tr>
    </table>
    </form>
  </body>
</html>
