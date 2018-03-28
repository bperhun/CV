<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <div class="container-fluid" id="home">
        <div id="myCarousel" class="carousel slide" data-interval="5000">
            <!-- Индикаторы для карусели -->
            <ol class="carousel-indicators">
                <!-- Перейти к 0 слайду карусели с помощью соответствующего индекса data-slide-to="0" -->
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <!-- Перейти к 1 слайду карусели с помощью соответствующего индекса data-slide-to="1" -->
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <!-- Перейти к 2 слайду карусели с помощью соответствующего индекса data-slide-to="2" -->
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <!-- Слайды карусели -->
            <div class="carousel-inner">
                <!-- Слайды создаются с помощью контейнера с классом item, внутри которого помещается содержимое слайда -->
                <div class="active item">
                    <img src="/resources/img/1.jpg">
                    <div class="carousel-caption">
                        <h3>Новини</h3>
                        <p>Новини</p>
                    </div>
                </div>
                <!-- Слайд №2 -->
                <div class="item">
                    <img src="/resources/img/2.jpg">
                    <div class="carousel-caption">
                        <h3>Новини</h3>
                        <p>Новини</p>
                    </div>
                </div>
                <!-- Слайд №3 -->

                <div class="item">
                    <img src="/resources/img/ec3c404fb2d7b50a4f9e3fd4e91cbcac.jpg">
                    <div class="carousel-caption">
                        <h3>Новини</h3>
                        <p>Новини</p>
                    </div>
                </div>

            </div>
            <!-- Навигация для карусели -->
            <!-- Кнопка, осуществляющая переход на предыдущий слайд с помощью атрибута data-slide="prev" -->
            <a class="carousel-control left" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
            <!-- Кнопка, осуществляющая переход на следующий слайд с помощью атрибута data-slide="next" -->
            <a class="carousel-control right" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>
        </div>
    </div>
    <div class="container-fluid search" id="search">

        <h2>Пошук водіїв</h2>

        <div class="serc">
            <form>
                <div class="form-group">
                    <label>Місто</label>
                    <input type="text" class="form-control" placeholder="Введіть місто">
                </div>
                <div class="form-group">
                    <label>Район</label>
                    <input type="text" class="form-control" placeholder="Введіть район">
                </div>
                <div class="form-group">
                    <label for="sel1">Категорія:</label>
                    <select class="form-control" id="sel1">
    <option>A</option>
    <option>A1</option>
    <option selected>B</option>
    <option>C1</option>
    <option>C</option>
  </select>
                </div>

                <button type="submit" class="btn btn-default">Пошук</button>

            </form>
        </div>
    </div>
    <div class="container-fluid search1" id="register">

        <h2>Реєстрація</h2>
        <div class="reg">
        <form:form action="/register" modelAttribute="userModel" method="POST" class="form-4">
       <div class="form-group">
							<form:errors path="*" cssStyle="color:red"/>
							<c:if test="${error != null}">
							<span class="error">${error}</span>
							</c:if>
						</div>   
            
<div class="form-group">
							<label style="color:darkgray">Адреса електронної пошти</label>
							<form:input path="email" type="text"  title="E-mail address" />
											
							<label >Пароль</label>
							<form:input path="password" type="password" title="Password" />
							
							<label >Підтвердження паролю</label>
							<form:input path="passwordConfirmation" type="password" title="Password Confirmation" />



</div>


               
                <input type="submit"  value="Зареєструватися"> 
                
				
            </form:form>
        </div>
          
            </div>
  
   <div class="container-fluid search" id="exit">

        <h2>Вхід</h2>
        <div class="ext">

<form:form action="/login" method="POST" class="form-4" >
            <fieldset>


                <label for="login">Email</label>
               <input name="email" type="text"  placeholder="Email" required>

                <label for="password">Пароль</label>
                <!-- <input type="password" name='password' placeholder="Пароль" required> -->
                <input name="password" type="password" placeholder="Пароль" required />



                <input type="submit" value="Продовжити">
                
				</fieldset>
            </form:form>
        </div>
        <div class="already">
				<p>У вас ще немає облікового запису?
					<a href="#register" class="go_to">Реєструйся</a>
				</p>
			</div>
    </div>
     