<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
a {
	margin: 10px;
}

body {
	text-align: center;
}

form {
	display: inline-block;
}

form, table {
	margin: auto;
}
</style>

</head>
<body>

	<a href="/letter?search=a">A</a>
	<a href="/letter?search=b">B</a>
	<a href="/letter?search=c">C</a>
	<a href="/letter?search=d">D</a>
	<a href="/letter?search=e">E</a>
	<a href="/letter?search=f">F</a>
	<a href="/letter?search=g">G</a>
	<a href="/letter?search=h">H</a>
	<a href="/letter?search=i">I</a>
	<a href="/letter?search=j">J</a>
	<a href="/letter?search=k">K</a>
	<a href="/letter?search=l">L</a>
	<a href="/letter?search=m">M</a>
	<a href="/letter?search=n">N</a>
	<a href="/letter?search=o">O</a>
	<a href="/letter?search=p">P</a>
	<a href="/letter?search=q">Q</a>
	<a href="/letter?search=r">R</a>
	<a href="/letter?search=s">S</a>
	<a href="/letter?search=t">T</a>
	<a href="/letter?search=u">U</a>
	<a href="/letter?search=v">V</a>
	<a href="/letter?search=w">W</a>
	<a href="/letter?search=x">X</a>
	<a href="/letter?search=y">Y</a>
	<a href="/letter?search=z">Z</a>

	<br>
	<br>
	<form method="post" action="/search">
		<input name="search" id="search" type="text" value="${ search }"
			autofocus="autofocus" /> <input type="submit">
	</form>
	
	<br>
	<br>

	<table>
		<c:forEach items="${ countryList }" var="item">
			<tr>
				<td>${ item.code }</td>
				<td>${ item.name }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>