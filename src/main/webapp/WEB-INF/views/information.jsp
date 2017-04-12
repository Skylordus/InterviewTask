<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.yberdaliyev.models.pojos.Person" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Interview Task</title>
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />">
	<link rel="stylesheet" href="<c:url value="/resources/css/styles.css" />">
	<link href="https://fonts.googleapis.com/css?family=Oxygen:300,400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Lora" rel="stylesheet">

</head>

<body>

<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/script.js"/>"></script>


	<header>
		<nav id="header-nav" class="navbar navbar-default">
			<div class="container">
				<h1 class="navbar-header text-center">
					Задание из собеседования
				</h1>
			</div>
		</nav>
	</header>



	<div id="main-content" class="container">

		<div class="row">

			<div class="col-xs-12">
				<h2>
					Информация о человеке:
				</h2>
				<div>
					<div>
						<span class="info">Идентификатор: </span>
						${person.getId()}
					</div>

					<div>
						<span class="info">Фамилия: </span>
						${person.getSurname()}
					</div>

					<div>
						<span class="info">Имя: </span>
						${person.getName()}
					</div>

					<div>
						<span class="info">Отчество: </span>
						${person.getPatronymic()}
					</div>

					<div>
						<span class="info">Дата рождения: </span>
						<% SimpleDateFormat sm = new SimpleDateFormat("MM-dd-yyyy");
							Person person = (Person) request.getAttribute("person");
							String dob = sm.format(person.getDob());
						%>
						<%=dob%>
					</div>

					<div>
						<span class="info">Рост: </span>
						${person.getHeight()}
					</div>

					<div>
						<span class="info">Вес: </span>
						${person.getWeight()}
					</div>

					<div>
						<span class="info">Пол: </span>
						<c:if test="${person.getGender().equals(\"male\")}">Мужчина</c:if>
						<c:if test="${person.getGender().equals(\"female\")}">Женщина</c:if>
					</div>

				</div>
				<div>
					<form action="/list" method="get">
						<input type="submit" value="Назад к списку"/>
					</form>
				</div>
			</div>

		</div>

	</div> <!-- End of #main-content -->



	<footer class="panel-footer navbar-fixed-bottom">
		<div class="container">
			<div class="row">
				Copyright &copy; Ерлан Бердалиев
			</div>
		</div>
	</footer>



</body>
</html>