<%--
  Created by IntelliJ IDEA.
  User: shangzhidong
  Date: 2016/8/19
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
            type="text/css"
            href="<c:url value="../resources/style.css" />"/>

</head>
<body>
    <h1>Welcome to Spittr</h1>
    <a href="<c:url value="/" />">Spittles</a>
    <a href="<c:url value="/register"/> ">Regitster</a>
</body>
</html>