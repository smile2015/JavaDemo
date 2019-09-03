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
	<script type="text/javascript">
	function clearContent(){
	   //获取输入框dom元素
	   var inputObj = document.getElementById('key');
	   inputObj.value = '';
	   }
	</script>
  </head>
  
  <body >
    <form action="company/query" method="post">
    <table border="0" align="center">
    <th colspan="2" bordercolor="red">证券公司信息管理</th>
    <tr></tr>
    <tr><td>查询条件：</td><td>
    <select  name="condition">
      <option  value="code" selected="selected">股票代码</option>
      <option value="name">证券公司名称</option>
      <option value="commissionRate">佣金费率</option>
    </select>
    </td>
    <td><input type="text" name="key" id="key" value="请输入查询条件关键字" onclick="clearContent();"></input></td>
    <td colspan="2"><input type="submit" value="查询"/></td></tr>
    </table>
    </form>
  </body>
</html>
