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
  
  <body >
  <div align="center">
  <%ArrayList lucres =(ArrayList)request.getAttribute( "lucres");%>
    <form action="lucre/show" method="post">
    <table border="1" width="50%">
    <th align="center" bgcolor="green" colspan="5">股票盈亏信息</th>
    <tr><td align="center">股票代码</td><td align="center">股票卖出总额</td><td align="center">股票买入总额</td><td align="center">股票剩余市值</td><td align="center">操作</td></tr>
    <%
    if(lucres.size()==0){
         out.print("<tr><td align=\"center\" colspan=\"5\">查询结果不存在</td></tr>");
       }else{
		for(int i = 0; i < lucres.size(); i++) {
		Lucre lucre = (Lucre) lucres.get(i);
       
	%> 
    <tr><td><%=lucre.getSharesCode()%></td><td><%=lucre.getIncomeMoney()%></td><td><%=lucre.getCostMoney()%></td><td><%=lucre.getLestMoney()%></td><td><a href="lucre/show?code=<%=lucre.getSharesCode()%>">详情</a></td></tr>
    <%
     }
	}
	%>
	<tr><td colspan="5"><a href='index.jsp'>返回首页</a></td></tr>
    </table>
    </form>
    </div>
  </body>
</html>
