<%@ include file="/WEB-INF/taglib.jsp" %>
<ul>
<c:forEach items="${users }" var="user">
<li>
<img alt="sgsg" src="data:image/png; base64, ${user.imagePath}" width="150px"> | ${user.firstName} ${user.lastName}
</li>
</c:forEach>
</ul>