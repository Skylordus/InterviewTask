<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">

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
				<div>
					Показать список всех людей
				</div>

				<form action="/list" method="get">
					<input type="submit" value="Показать"/>
				</form>
				
			</div>

			<c:if test="${showList != null}">
				<div class="col-xs-12">
					<table class="table table-inverse">
						<thead>
						<tr>
							<th>ID</th>
							<th>Фамилия</th>
							<th>Имя</th>
							<th>Ссылка</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach items="${people}" var="person">
							<tr>
								<th scope="row">${person.getId()}</th>
								<td>
									<div>${person.getSurname()}</div>
								</td>
								<td>
									<div>${person.getName()}</div>
								</td>
								<td>
									<a href="/info?id=${person.getId()}">
										Информация
									</a>
								</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</c:if>
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