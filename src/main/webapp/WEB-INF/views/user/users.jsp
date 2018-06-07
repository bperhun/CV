<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <br>
<br>
<br>

	
	
		
<sec:authorize access="isAnonymous()">		
<%-- <c:url var="firstUrl" value="${pageContext.request.contextPath}/user/users/pages/1?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}" />
	<c:url var="lastUrl" value="${pageContext.request.contextPath}/user/users/pages/${coursesList.totalPages}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}" />
	<c:url var="prevUrl" value="${pageContext.request.contextPath}/user/users/pages/${currentIndex - 1}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}" />
	<c:url var="nextUrl" value="${pageContext.request.contextPath}/user/users/pages/${currentIndex + 1}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}" /> --%>
<div class="container-fluid ">
<%-- <ul class="pagination">
			<c:choose>
				<c:when test="${currentIndex == 1}">
					<li class="disabled"><a href="#">&lt;&lt;</a></li>
					<li class="disabled"><a href="#">&lt;</a></li>
					<li class="disabled"><a href="${firstUrl}">1</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${firstUrl}">&lt;&lt;</a></li>
					<li><a href="${prevUrl}">&lt;</a></li>
				</c:otherwise>
			</c:choose>
			<c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
				<c:url var="pageUrl" value="${pageContext.request.contextPath}/user/users/pages/${i+1}" />
				<c:choose>
					<c:when test="${i+1 == currentIndex}">
						<li class="disabled"><a href="${pageUrl}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}"><c:out value="${i+1}" /></a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${pageUrl}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}"><c:out value="${i+1}" /></a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>

			<c:choose>
				<c:when test="${currentIndex == coursesList.totalPages}">
					<li class="disabled"><a href="#">&gt;</a></li>
					<li class="disabled"><a href="#">&gt;&gt;</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${nextUrl}">&gt;</a></li>
					<li><a href="${lastUrl}">&gt;&gt;</a></li>
				</c:otherwise>
			</c:choose>
		</ul> --%>
<c:forEach items="${users }" var="user">

  
    
     <br>

                <div class="panel panel-default" >
                    <div class="panel-heading">
                       <b> <h3>${user.userDetails.country}</h3></b>
                    </div>
                    <div class="panel-body" >

                        <div class="box box-info">

                            <div class="box-body">
                            <div class="row">
                                <div class="col-lg-4">
                                    
                                    <img alt="User Pic" src="data:image/jpg; base64, ${user.imagePath}" id="profile-image1" class="img-circle img-responsive">




                                    
</div>
                             
<div class="col-lg-8" >
								<div class="col-sm-5 col-xs-6 tital ">Ім'я:</div>
                                <div class="col-sm-7 col-xs-6 ">${user.userDetails.firstName}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>
                                
                                <div class="col-sm-5 col-xs-6 tital ">Прізвище:</div>
                                <div class="col-sm-7 col-xs-6 ">${user.userDetails.lastName}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Пошта:</div>
                                <div class="col-sm-7 col-xs-6 ">${user.email}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Номер телефону:</div>
                                <div class="col-sm-7"> ${user.userDetails.phoneNumber} </div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Місто:</div>
                                <div class="col-sm-7"> ${user.userDetails.country}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Район:</div>
                                <div class="col-sm-7">${user.userDetails.district}</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Категорія:</div>
                                  <c:forEach items="${user.category.category}"  var="c">
		<b ">${c}</b>
	</c:forEach>  

                                <div class="clearfix"></div>
                                <div class="bot-border"></div> 

                                <div class="col-sm-5 col-xs-6 tital ">Роль:</div>
                                <div class="col-sm-7">${user.role}</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                        


                            </div>
                            </div>
                        </div>

                    </div>
                </div>
           
    </div>
    </c:forEach>
    </div>
    </sec:authorize>

 <sec:authorize access="hasRole('ROLE_ADMIN')">	  

<div class="container-fluid ">
<c:forEach items="${users }" var="user">

  
    
     <br>

                <div class="panel panel-default" >
                    <div class="panel-heading">
                       <b> <h3>${user.userDetails.country}</h3></b>
                    </div>
                    <div class="panel-body" >

                        <div class="box box-info">

                            <div class="box-body">
                            <div class="row">
                                <div class="col-lg-4">
                                    
                                    <img alt="User Pic" src="data:image/jpg; base64, ${user.imagePath}" id="profile-image1" class="img-circle img-responsive">




                                    
</div>
                             
<div class="col-lg-8" >
								<div class="col-sm-5 col-xs-6 tital ">Ім'я:</div>
                                <div class="col-sm-7 col-xs-6 ">${user.userDetails.firstName}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>
                                
                                <div class="col-sm-5 col-xs-6 tital ">Прізвище:</div>
                                <div class="col-sm-7 col-xs-6 ">${user.userDetails.lastName}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Пошта:</div>
                                <div class="col-sm-7 col-xs-6 ">${user.email}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Номер телефону:</div>
                                <div class="col-sm-7"> ${user.userDetails.phoneNumber} </div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Місто:</div>
                                <div class="col-sm-7"> ${user.userDetails.country}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Район:</div>
                                <div class="col-sm-7">${user.userDetails.district}</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Категорія:</div>
                                  <c:forEach items="${user.category.category}"  var="c">
		<b ">${c}</b>
	</c:forEach>  

                                <div class="clearfix"></div>
                                <div class="bot-border"></div> 

                                <div class="col-sm-5 col-xs-6 tital ">Роль:</div>
                                <div class="col-sm-7">${user.role}</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                        
<a href="${pageContext.request.contextPath }/admin/${user.id}/edit" class="btn btn-success">Редагувати дані користувача</a><br/>

 



                            </div>
                            </div>
                        </div>

                    </div>
                </div>
           
    </div>
    </c:forEach>
    </div>
    </sec:authorize>
 