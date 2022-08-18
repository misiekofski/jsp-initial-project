<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Bottle</title>
</head>
<body>
<c:if test="${addBottleSuccess}">
    <div>Successfully added Bottle from producer: ${savedBottle.producer}</div>
</c:if>

<c:url var="addbottle_url" value="/bottle/add"/>
<form:form action="${addbottle_url}" method="post" modelAttribute="bottle">
    <form:label path="producer">Producer: </form:label> <form:input type="text" path="producer"/>
    <form:label path="volume">Volume: </form:label> <form:input type="text" path="volume"/>
    <form:label path="year">Production year: </form:label> <form:input path="year"/>
    <input type="submit" value="submit"/>
</form:form>
</body>
</html>