<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<jsp:include page="head.jsp"></jsp:include>
<body>
	<jsp:include page="testata.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div style="margin-left: 20px;">
		<c:if test="${not empty KO}">
			<font color="red"> <p> ${ko}</p>
			</font>
		</c:if>
		<font color="blue">	<br>
		<p> ${ok}</p>
		</font>
	</div>
</body>
</html>