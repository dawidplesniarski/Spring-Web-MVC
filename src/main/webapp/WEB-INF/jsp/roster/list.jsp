<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 14/12/2019
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Roster</h1>
<ul>
    <c:forEach var="member" items="${memberList}" varStatus="status">
        <li>
            <a href="member.do?id=${status.index}">
                <c:out value="${member}"></c:out>
            </a>
        </li>
    </c:forEach>
</ul>
