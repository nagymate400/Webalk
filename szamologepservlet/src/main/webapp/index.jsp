<html>
<head>
<title>Calculator</title>
</head>
<body>
<%
szamologepszervlet.Result result = (szamologepszervlet.Result) request.getAttribute("result") : new szamologepszervlet.ResultDto();
Double result = (Double) request.getAttribute("result");
String resultText = (result == null) ? "" : "result" + result.toString();
%>
ver: 0.4;
<form action="szamologep.do" method="post">
<input type="text" name="a" value="<%=result.getA()%>"<br>
<input type="text" name="b" value="<%=result.getB()%>"<br>
<select name="operator">
<option value="+"></option> +
<option value="-"></option> -
<option value="*"></option> *
<option value="/"></option> /
</select>
<%= resultText %>
	<input type="submit" /><br>
</form>
</body>
</html>