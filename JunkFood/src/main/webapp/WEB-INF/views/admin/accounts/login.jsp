<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en" class="light-style layout-menu-fixed" dir="ltr"
	data-theme="theme-default" data-assets-path="/assets/"
	data-template="vertical-menu-template-free">

<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />

<title></title>

<meta name="description" content="" />
<!-- Favicon -->
<link rel="icon" type="image/x-icon"
	href="/assets/img/favicon/favicon.ico" />

<!-- Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap"
	rel="stylesheet" />
<!-- Icons. Uncomment required icon fonts -->
<link rel="stylesheet" href="/assets/vendor/fonts/boxicons.css" />
<!-- Core CSS -->
<link rel="stylesheet" href="/css/core.css"
	class="template-customizer-core-css" />
<link rel="stylesheet" href="/css/theme-default.css"
	class="template-customizer-theme-css" />
<script src="/assets/vendor/js/helpers.js"></script>
<style>
body {
	background-color: rgb(107, 112, 112);
}
</style>
</head>
<body>
	<div class="container">
		<div class="row mt-5">
			<div class="col-5 offset-4 mt-5">
				<div class="card mt-5 ">
					<div class="card-header bg-gray p-0">
						<h2 class="text-center text-white mt-3">Login</h2>
					</div>
					<div class="card-body mt-4">
						<form action="/junkfood/login" method="post">
							<div class="form-group">
								<label for="email">Email</label>
								<input type="email" class="form-control mt-2" 
								name="email" id="id"
									placeholder="email" />
							</div>
							<div class="form-group mt-3">
								<label for="password">PASSWORD</label>
								<input type="password" class="form-control mt-2" 
								name="password" id="password"
									placeholder="Password" />
							</div>
							<div class="row m-0 mt-4">
								<button type="submit">login</button>
							</div>
						</form>
						<hr>
						<div class="text-center mb-4">
							Don't have account ? <a href="Register" class="text-danger">Sing
								Up Here</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="/js/jquery.min.js"></script>
	<script src="/js/popper.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
</body>

</html>