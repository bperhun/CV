<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <div class="navbar navbar-inverse navbar-fixed-top cont">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                   <span class="icon-bar"></span>
                   <span class="icon-bar"></span>
                   <span class="icon-bar"></span>
               </button>
                <a class="navbar-brand go_to" href="${pageContext.request.contextPath}/"><img src="/resources/img/unnamed.png" ></a>
            </div>
            <sec:authorize access="isAnonymous()">
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="activ"><a href="#home" class="go_to">Новини</a></li>
                    <li><a href="#search" class="go_to">Замовити</a></li>
                    <li><a href="#exit" class="exit go_to">Вхід</a></li>
                    <li class="register"><a href="#register" style="color:white" class="go_to">Реєстрація</a></li>
                    </ul>
                    </sec:authorize>
 
 <sec:authorize access="isAuthenticated()">
  <ul class="nav navbar-nav navbar-right">
		     		
					<c:url var="logoutUrl" value="/logout" />
					<form:form action="${logoutUrl}" method="post" cssStyle="padding-top: 7px;">
						<li class="out"><input class="btn btn-danger btn-lg" type="submit" value="Вихід" /></li>
					</form:form>
					</ul>
			</sec:authorize>
                                   <sec:authorize access="hasRole('ROLE_ADMIN')">
  <ul class="nav navbar-nav navbar-right">
		     		
 <form:form action="/users" cssStyle="padding-top: 7px;">
  <a href="/users" class="btn btn-info btn-lg">
  Редагувати користувачів
</a>

</form:form>
					</ul>
</sec:authorize>
            </div>
        </div>
    </div>