<%-- <%@ include file="/WEB-INF/taglib.jsp" %>

<div class="row">
	<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					<h3>Edit user</h3>
					<form:form action="/user/profile/edit" modelAttribute="editUserModel">
						<div class="form-group">
							<form:errors path="*" cssClass="error"/>
						
						</div>
						<div class="form-group">
  							<label class="control-label">First name</label>
							<form:input path="userDetails.firstName" cssClass="form-control"/>
											
							<label class="control-label">Last name</label>
							<form:input path="lastName" cssClass="form-control" title="Password" />
							
							<label class="control-label">Age</label>
							<form:select path="age">
							<c:forEach begin="16" end="95" var="a">
							<form:option value="${a}">${a}</form:option>
							</c:forEach>
							</form:select>
						</div>
						<div class="form-group">
							<span class="input-group-btn">
								<input type="submit" class="btn btn-primary" value="Register">
							</span>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div> --%>

<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <br>
   <br>
   <br>
    <div class="container prof"  >
        <div class="row" >



            <div class="col-md-7 ww" >

                <div class="panel panel-default" >
                    <div class="panel-heading">
                        <h4>Редагувати користувача</h4>
                    </div>
                    <div class="panel-body" >

                        <div class="box box-info">

                            <div class="box-body">
      <form:form action="/user/profile/edit" modelAttribute="editUserModel">
                                <div class="col-sm-6">
                                    <h4 style="color:#00b1b1;">Ім'я<form:input path="userDetails.firstName" cssClass="form-control"/>  Прізвище <form:input path="userDetails.lastName" cssClass="form-control"/></h4>
                                    </span>
                                    <!-- <span><p>Aspirant</p></span> -->
                                </div>
                                <div class="clearfix"></div>
                                <hr style="margin:5px 0 5px 0;">


                              

                                 <div class="col-sm-5 col-xs-6 tital ">Номер телефону:</div>
                                <div class="col-sm-7"><p>Телефон у форматі 38xxx-xxx-xxxx: <form:input path="userDetails.phoneNumber" cssClass="form-control" type="tel" pattern="38[0-9]{3}-[0-9]{3}-[0-9]{4}"/></p> </div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                               <div class="col-sm-5 col-xs-6 tital ">Місто:</div>
                                <div class="col-sm-7"> <form:input path="userDetails.country" cssClass="form-control"/></div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Район:</div>
                                <div class="col-sm-7"><form:input path="userDetails.district" cssClass="form-control"/></div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                 <div class="col-sm-5 col-xs-6 tital ">Категорія:</div>
                               <%--  <div class="col-sm-7"><form:input path="userDetails.category" cssClass="form-control"/></div>  --%>
                    <%--             <div class="col-sm-7"> <form:checkbox path="userDetails.category" value="A"/></div> 
                                <div class="col-sm-7"> <form:checkbox path="userDetails.category" value="B"/></div> --%> 

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>  

                                

                               

                      

<br>
<br>
	<div class="form-group">
							<span class="input-group-btn">
								<input type="submit" class="btn btn-primary" value="Зберегти">
							</span>
						</div>
</form:form>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>