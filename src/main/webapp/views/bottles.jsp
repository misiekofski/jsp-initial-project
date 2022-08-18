<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>View Bottles</title>
    <link href="<c:url value="/css/main.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Producer</th>
        <th>Volume</th>
        <th>Year</th>
    </tr>
    </thead>
    <tbody>

    <jsp:useBean id="bottles" scope="request" type="java.util.List"/>
    <c:forEach items="${bottles}" var="bottle">
        <tr>
            <td>${bottle.producer}</td>
            <td>${bottle.volume}</td>
            <td>${bottle.year}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>