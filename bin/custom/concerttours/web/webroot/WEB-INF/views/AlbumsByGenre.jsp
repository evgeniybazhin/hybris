<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="album" items="${albums}">
    <li>
       ${album.band.name} -  ${album.title} | ${album.duration}
    </li>
</c:forEach>
</body>
</html>
