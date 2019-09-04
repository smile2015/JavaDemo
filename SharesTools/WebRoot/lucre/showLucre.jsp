<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="com.mosorg.sharestools.vo.Lucre"%>
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
  <div align="center">
  <%Lucre lucre =(Lucre)request.getAttribute( "lucre");%>
    <form action="lucre/show" method="post">
    <table  style="text-align:center;" border="1" width="50%">
    <th align="center" bgcolor="green" colspan="2">证券公司信息</th>
    <%
       if("".equals(lucre)||null==lucre){
         out.print("<tr><td align=\"center\" colspan=\"2\">查询结果不存在</td></tr>");
       }else{
     %>
    <tr><td align="right">股票代码：</td><td><%=lucre.getSharesCode()%></td></tr>
    <tr><td align="right">股票买入总额（元）：</td><td><%=lucre.getCostMoney()%></td></tr>
    <tr><td align="right">股票卖出总额（元）：</td><td><%=lucre.getIncomeMoney()%></td></tr>
    <tr><td align="right">股票剩余市值（元）：</td><td><%=lucre.getLestMoney()%></td></tr>
    <% } %>
    <tr><td colspan="2"><a href='index.jsp'>返回首页</a></td></tr>
    </table>
    </form>
    </div>
  </body>
</html>
