<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<html>
<head>
<title>${title}</title>
</head>
<body>
    <jsp:include page="_menu.jsp" />

    <h2>Users list:</h2>
    <table>
        <tr>
            <td>NAME</td><td>Joining Date</td><td>Salary</td><td>SSN</td><td></td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.userName}</td>
                <td>${user.userRole}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>