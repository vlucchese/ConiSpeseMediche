<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<title>Coni Spese Mediche v1.0</title>

<link href="/ConiSpeseMediche/_ui/css/style.css" rel="stylesheet" />
<link href="/ConiSpeseMediche/_ui/css/reset.css" rel="stylesheet" />

</head>
<body>
	<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
		<font color="red"> Your login attempt was not successful due to
			<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />.
		</font>
	</c:if>
	<div class="wrap">
		<form name="loginForm" action="authenticateUser" method="post">
			<div class="avatar">
				<img src="/ConiSpeseMediche/_ui/images/ImgLogoSimbolo.png"
					height="150px" width="150px" align="center">
			</div>
			<input type="text" name="username" placeholder="Username" style="margin-top: 20px;"/>
			<div class="bar">
				<i></i>
			</div>
			<input type="password" name="password" placeholder="Password" /> <input
				type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<input type="submit" value="Login">
		</form>
	</div>
</body>
</html>