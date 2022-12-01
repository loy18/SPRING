<%@ page  contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>로그인 안되유</title>
</head>
<body>
	<h3>Access Denied</h3>
	<h1>${SPRING_SECURITY_403_EXCEPTION.message }</h1>
	<!-- model.addAttribute -->
	<h3>${msg}</h3>
</body>
</html>