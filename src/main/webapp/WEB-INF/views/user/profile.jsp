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
                        <h4>Профіль користувача</h4>
                    </div>
                    <div class="panel-body" >

                        <div class="box box-info">

                            <div class="box-body">
                                <div class="col-sm-6">
                                    <div align="center"> 
                                    <img alt="User Pic" src="data:image/jpg; base64, ${userProfile.imagePath}" id="profile-image1" class="img-circle img-responsive">

<br>

<a href="/user/profile/image" class="btn btn-info">Завантажити зображення профілю</a><br/>
                                    </div>

                                    <br>

                                    <!-- /input-group -->
                                </div>
                                <div class="col-sm-6">
                                   <h3 style="color:#00b1b1;">${userProfile.firstName}   ${userProfile.lastName} </h3>  
                                    </span>
                                    <!-- <span><p>Aspirant</p></span> -->
                                </div>
                                <div class="clearfix"></div>
                                <hr style="margin:5px 0 5px 0;">


                                <div class="col-sm-5 col-xs-6 tital ">Пошта:</div>
                                <div class="col-sm-7 col-xs-6 ">${userProfile.email}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Номер телефону:</div>
                                <div class="col-sm-7"> ${userProfile.phoneNumber} </div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Місто:</div>
                                <div class="col-sm-7"> ${userProfile.country}</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Район:</div>
                                <div class="col-sm-7">${userProfile.district}</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Категорія:</div>
                                  <c:forEach items="${userProfile.category}"  var="c">
		<b ">${c}</b>
	</c:forEach>  

                                <div class="clearfix"></div>
                                <div class="bot-border"></div> 

                                <div class="col-sm-5 col-xs-6 tital ">Роль:</div>
                                <div class="col-sm-7">${userProfile.role}</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                           <!--      <div class="col-sm-5 col-xs-6 tital ">Nationality:</div>
                                <div class="col-sm-7">Indian</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital ">Relition:</div>
                                <div class="col-sm-7">Hindu</div>
 -->

<br>
<br>
<a href="/user/profile/edit" class="btn btn-success">Редагувати дані користувача</a><br/>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>