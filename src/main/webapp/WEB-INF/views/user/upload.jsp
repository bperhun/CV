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
                        <h4>Добавити зображення(фото має бути не більше 10мб)</h4>
                    </div>
                    <div class="panel-body" >

                        <div class="box box-info">

                            <div class="box-body">
       <form:form modelAttribute="uploadModel" method="POST" action="/user/profile/image" enctype="multipart/form-data">

<form:input path="file" type="file" cssClass="form-control"/>
<input type="submit" value="Upload image" class="btn btn-warning">

</form:form>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>