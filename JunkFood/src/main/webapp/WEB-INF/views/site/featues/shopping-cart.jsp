<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="/images/icons/favicon.png" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/fonts/linearicons-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="/vendor/slick/slick.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/vendor/MagnificPopup/magnific-popup.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="/css/util.css">
<link rel="stylesheet" type="text/css" href="/css/main.css">
<!--===============================================================================================-->
</head>
<body class="animsition">
	<!-- Header -->
	<header>
		<!-- Header desktop -->
		<div class="container-menu-desktop">
			<!-- Topbar -->
			<div class="top-bar">
				<div class="content-topbar flex-sb-m h-full container">
					<div class="left-top-bar">Free shipping for standard order
						over $100</div>

					<div class="right-top-bar flex-w h-full">
						<a href="#" class="flex-c-m trans-04 p-lr-25"> Help & FAQs </a> <a
							href="#" class="flex-c-m trans-04 p-lr-25"> Setting </a> <a
							href="#" class="flex-c-m trans-04 p-lr-25"> English </a> <a
							href="#" class="flex-c-m trans-04 p-lr-25"> Vietnamese </a>
					</div>
				</div>
			</div>

			<div class="wrap-menu-desktop">
				<nav class="limiter-menu-desktop container">
					<!-- Logo desktop -->
					<h4 href="#" class="logo text-dark">DUY ĐỨC STORE</h4>
					<!-- Menu desktop -->
					<div class="menu-desktop">
						<ul class="main-menu">
							<li><a href="/Assiment/Home">Home</a></li>

							<li><a href="/Assiment/Product">Shop</a></li>

							<li class="label1" data-label1="hot"><a
								href="/Assiment/Features/index">Features</a></li>

							<li><a href="/Assiment/About">About</a></li>

							<li><a href="/Assiment/Contact">Contact</a></li>
						</ul>
					</div>

					<!-- Icon header -->
					<div class="wrap-icon-header flex-w flex-r-m">
						<div
							class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 js-show-modal-search">
							<i class="zmdi zmdi-search"></i>
						</div>

						<div
							class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti js-show-cart"
							data-notify="2">
							<i class="zmdi zmdi-shopping-cart"></i>
						</div>

						<a href="#"
							class="dis-block icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti"
							data-notify="0"> <i class="zmdi zmdi-favorite-outline"></i>
						</a>
						<div class="menu-desktop">
							<ul class="main-menu">
								<li class="active-menu"><a href="#"> <i
										class="fa fa-user dis-block icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11"
										aria-hidden="true"></i>

								</a>
									<ul class="sub-menu">

										<li><a href="/Assiment/Login">Login </a></li>
										<li><a href="/Assiment/Register">Register</a></li>
										<li><a href="#">Fogot PassWord</a></li>


										<li><a href="/Assiment/Logoff">Logoff</a></li>
										<li><a href="/Assiment/EditProfile">Edit Profile</a></li>
										<li><a href="#">Change Password</a></li>
										<li><a href="/Assiment/OrderHistory">Order History</a></li>

									</ul></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</div>

		<!-- Header Mobile -->
		<div class="wrap-header-mobile">
			<!-- Logo moblie -->
			<div class="logo-mobile">
				<a href="index.html"><img
					src="/Assiment/images/icons/logo-01.png" alt="IMG-LOGO"></a>
			</div>

			<!-- Icon header -->
			<div class="wrap-icon-header flex-w flex-r-m m-r-15">
				<div
					class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 js-show-modal-search">
					<i class="zmdi zmdi-search"></i>
				</div>

				<div
					class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti js-show-cart"
					data-notify="2">
					<i class="zmdi zmdi-shopping-cart"></i>
				</div>

				<a href="#"
					class="dis-block icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti"
					data-notify="0"> <i class="zmdi zmdi-favorite-outline"></i>
				</a>
				<ul class="main-menu">
					<li class="active-menu"><a href="#"> <i
							class="fa fa-user dis-block icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11"
							aria-hidden="true"></i>

					</a>
						<ul class="sub-menu">
							<c:if test="!isLogin">
								<li><a href="Login">Login </a></li>
								<li><a href="Register">Register</a></li>
								<li><a href="home-03.html">Fogot PassWord</a></li>
							</c:if>
							<c:if test="isLogin">
								<li><a href="Logoff">Logoff</a></li>
								<li><a href="home-03.html">Edit Profile</a></li>
								<li><a href="home-03.html">Change Password</a></li>
							</c:if>
						</ul></li>
				</ul>
			</div>

			<!-- Button show menu -->
			<div class="btn-show-menu-mobile hamburger hamburger--squeeze">
				<span class="hamburger-box"> <span class="hamburger-inner"></span>
				</span>
			</div>
		</div>

		<!-- Menu Mobile -->
		<div class="menu-mobile">
			<ul class="topbar-mobile">
				<li>
					<div class="left-top-bar">Free shipping for standard order
						over $100</div>
				</li>

				<li>
					<div class="right-top-bar flex-w h-full">
						<a href="#" class="flex-c-m p-lr-10 trans-04"> Help & FAQs </a> <a
							href="#" class="flex-c-m p-lr-10 trans-04"> My Account </a> <a
							href="#" class="flex-c-m p-lr-10 trans-04"> EN </a> <a href="#"
							class="flex-c-m p-lr-10 trans-04"> USD </a>
					</div>
				</li>
			</ul>

			<ul class="main-menu-m">
				<li><a href="/Assiment/Home">Home</a> <span
					class="arrow-main-menu-m"> <i class="fa fa-angle-right"
						aria-hidden="true"></i>
				</span></li>

				<li><a href="/Assiment/Product">Shop</a></li>
				<li class="label1" data-label1="hot"><a
					href="/Assiment/Features">Features</a></li>

				<li><a href="/Assiment/About">About</a></li>

				<li><a href="/Assiment/Contact">Contact</a></li>

			</ul>
		</div>

		<!-- Modal Search -->
		<div
			class="modal-search-header flex-c-m trans-04 js-hide-modal-search">
			<div class="container-search-header">
				<button
					class="flex-c-m btn-hide-modal-search trans-04 js-hide-modal-search">
					<img src="/Assiment/images/icons/icon-close2.png" alt="CLOSE">
				</button>

				<form class="wrap-search-header flex-w p-l-15">
					<button class="flex-c-m trans-04">
						<i class="zmdi zmdi-search"></i>
					</button>
					<input class="plh3" type="text" name="search"
						placeholder="Search...">
				</form>
			</div>
		</div>
	</header>
	<section class="bg0 p-t-23 p-b-140 mt-5">
		<!-- breadcrumb -->
		<div class="container mt-5">
			<div class="bread-crumb flex-w p-l-25 p-r-15 p-t-30 p-lr-0-lg">
				<a href="index.html" class="stext-109 cl8 hov-cl1 trans-04">
					Home <i class="fa fa-angle-right m-l-9 m-r-10" aria-hidden="true"></i>
				</a> <span class="stext-109 cl4"> Shoping Cart </span>
			</div>
		</div>
		<!-- Shoping Cart -->
		<div class="container">
			<div class="bg0 p-t-75 p-b-85">
				<div class="row">
					<div class="col-lg-11 col-xl-7 m-lr-auto m-b-50">
						<div class="m-l-25 m-r--38 m-lr-0-xl">
							<div class="row">
								 <div class="col">
							<c:if test="${not empty sessionScope.message}">
								<div class="alert alert-success" role="alert">
									${sessionScope.message}
									<c:remove var="message" scope="session" />
								</div>
							</c:if>
							<c:if test="${not empty sessionScope.error}">
								<div class="alert alert-danger" role="alert">
									${sessionScope.error}
									<c:remove var="error" scope="session" />
								</div>
							</c:if>
						</div> 
							</div>
							<div class="wrap-table-shopping-cart">
								<div class="table-responsive">
									<table class="table">
										<thead>
											<tr>
												<th scope="col">#</th>
												<th scope="col">Id</th>
												<th scope="col">Name</th>
												<th scope="col">Price</th>
												<th scope="col">Quantity</th>
												<th scope="col">Thành Tiền</th>
												<th colspan="2"></th>
											</tr>
										</thead>
										<tbody>
											<c:set var="no" value="1"></c:set>
											<c:forEach items="${cartDetails}" var="cartDetail">
												<tr class="text-center">
													<th><input type="checkbox" value="" name=""></th>
													<th scope="row">${no}</th>
													<td>${cartDetail.name}</td>
													<td><fmt:formatNumber value="${cartDetail.price}"
															pattern="#,###">
														</fmt:formatNumber> <b> Đ</b></td>
													<td>
														<form action="/junkfood/shopping/updatecart" method="post">
															<input type="hidden" name="productid"
																value="${cartDetail.productid}"> <input
																type="number" name="quantity" id="quantity" min="1"
																value="${cartDetail.quantity}"
																onblur="this.form.submit()">
														</form>
													</td>
													<td><fmt:formatNumber
															value="${cartDetail.quantity * cartDetail.price}"
															pattern="#,###"></fmt:formatNumber><b> Đ</b></td>
													<td>
														<!-- Button trigger modal -->
														<button type="button" class="btn btn-secondary"
															data-toggle="modal"
															data-target="#deleteCart_${cartDetail.productid}">
															X</button> <!-- Modal -->
														<div class="modal fade mt-5"
															id="deleteCart_${cartDetail.productid}" tabindex="-1"
															aria-labelledby="exampleModalLabel" aria-hidden="true">
															<div class="modal-dialog mt-5">
																<div class="modal-content mt-5">
																	<div class="modal-header">
																		<h5 class="modal-title" id="exampleModalLabel">Bạn
																			có thực sự muốn xóa ?</h5>
																		<button type="button" class="close"
																			data-dismiss="modal" aria-label="Close">
																			<span aria-hidden="true">&times;</span>
																		</button>
																	</div>
																	<div class="modal-body">
																		<span class="float-start">Tên Sản Phẩm:
																			${cartDetail.name}<b></b>
																		</span>
																	</div>
																	<div class="modal-footer">
																		<a
																			href="/junkfood/shopping/removecart/${cartDetail.productid}"
																			class="btn btn-danger">Xóa</a>
																		<button type="button" class="btn btn-secondary"
																			data-dismiss="modal">Close</button>
																	</div>
																</div>
															</div>
														</div>
													</td>
												</tr>
												<c:set var="no" value="${no + 1}"></c:set>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<div
								class="flex-w flex-sb-m bor15 p-t-18 p-b-15 p-lr-40 p-lr-15-sm">
								<div class="flex-w flex-m m-r-20 m-tb-5">
									<input
										class="stext-104 cl2 plh4 size-117 bor13 p-lr-20 m-r-10 m-tb-5"
										type="text" name="coupon" placeholder="Coupon Code">
									<div
										class="flex-c-m stext-101 cl2 size-118 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer m-tb-5">
										Apply coupon</div>
								</div>
								<div
									class="flex-c-m stext-101 cl2 size-119 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer m-tb-10">
									Update Cart</div>
							</div>
						</div>
					</div>
					<div class="col-sm-10 col-lg-7 col-xl-5 m-lr-auto m-b-50">
						<div
							class="bor10 p-lr-40 p-t-30 p-b-40 m-l-63 m-r-40 m-lr-0-xl p-lr-15-sm">
							<h4 class="mtext-109 cl2 p-b-30">Cart Totals</h4>
							<div class="flex-w flex-t p-t-27 p-b-33">
								<div class="size-208">
									<span class="mtext-101 cl2"> Tổng Tiền: </span>
								</div>

								<div class="size-209 p-t-1">
									<span class="mtext-110 cl2"> <fmt:formatNumber
											value="${total}" pattern="#,###"></fmt:formatNumber> <b>
											Đ</b>
									</span>
								</div>
							</div>
							<!-- Button trigger modal -->
							<button type="button" class="btn btn-primary" data-toggle="modal"
								data-target="#exampleModal">Thanh Toán</button>
							<!-- Modal -->
							<div class="modal fade mt-5" id="exampleModal" tabindex="-1"
								aria-labelledby="exampleModalLabel" aria-hidden="true">
								<div class="modal-dialog mt-5">
									<div class="modal-content mt-5">
										<div class="modal-header">
											<h5 class="modal-title" id="exampleModalLabel">Bạn Có
												Chắc Chắn Là Đặt Hàng Không ?</h5>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<form action="/junkfood/pay/create" method="post">
											<div class="modal-body">

												<input name="" />

											</div>
											<div class="modal-footer">
												<button type="submit" class="btn btn-primary">ĐỒNG
													Ý</button>
												<button type="button" class="btn btn-secondary"
													data-dismiss="modal">Close</button>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>



	</section>

	<!-- Footer -->
	<footer class="bg3 p-t-75 p-b-32">
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-lg-3 p-b-50">
					<h4 class="stext-301 cl0 p-b-30">Categories</h4>

					<ul>
						<li class="p-b-10"><a href="#"
							class="stext-107 cl7 hov-cl1 trans-04"> Women </a></li>

						<li class="p-b-10"><a href="#"
							class="stext-107 cl7 hov-cl1 trans-04"> Men </a></li>

						<li class="p-b-10"><a href="#"
							class="stext-107 cl7 hov-cl1 trans-04"> Shoes </a></li>

						<li class="p-b-10"><a href="#"
							class="stext-107 cl7 hov-cl1 trans-04"> Watches </a></li>
					</ul>
				</div>

				<div class="col-sm-6 col-lg-3 p-b-50">
					<h4 class="stext-301 cl0 p-b-30">Help</h4>

					<ul>
						<li class="p-b-10"><a href="#"
							class="stext-107 cl7 hov-cl1 trans-04"> Email:
								nguyenduc130602@gmail.com </a></li>

						<li class="p-b-10"><a href="#"
							class="stext-107 cl7 hov-cl1 trans-04"> Address:Nghĩa
								Hoàn,Tân Kỳ,Nghệ An </a></li>

						<li class="p-b-10"><a href="#"
							class="stext-107 cl7 hov-cl1 trans-04"> Telephone:0354192063
						</a></li>

						<li class="p-b-10"><a href="#"
							class="stext-107 cl7 hov-cl1 trans-04"> FAQs </a></li>
					</ul>
				</div>

				<div class="col-sm-6 col-lg-3 p-b-50">
					<h4 class="stext-301 cl0 p-b-30">GET IN TOUCH</h4>

					<p class="stext-107 cl7 size-201">Any questions? Let us know in
						store at 8th floor, 379 Hudson St, New York, NY 10018 or call us
						on (+1) 96 716 6879</p>

					<div class="p-t-27">
						<a href="#" class="fs-18 cl7 hov-cl1 trans-04 m-r-16"> <i
							class="fa fa-facebook"></i>
						</a> <a href="#" class="fs-18 cl7 hov-cl1 trans-04 m-r-16"> <i
							class="fa fa-instagram"></i>
						</a> <a href="#" class="fs-18 cl7 hov-cl1 trans-04 m-r-16"> <i
							class="fa fa-pinterest-p"></i>
						</a>
					</div>
				</div>

				<div class="col-sm-6 col-lg-3 p-b-50">
					<h4 class="stext-301 cl0 p-b-30">Newsletter</h4>

					<form>
						<div class="wrap-input1 w-full p-b-4">
							<input class="input1 bg-none plh1 stext-107 cl7" type="text"
								name="email" placeholder="nguyenduc130602@gmail.com">
							<div class="focus-input1 trans-04"></div>
						</div>

						<div class="p-t-18">
							<button
								class="flex-c-m stext-101 cl0 size-103 bg1 bor1 hov-btn2 p-lr-15 trans-04">
								Subscribe</button>
						</div>
					</form>
				</div>
			</div>

			<div class="p-t-40">
				<div class="flex-c-m flex-w p-b-18">
					<a href="#" class="m-all-1"> <img
						src="images/icons/icon-pay-01.png" alt="ICON-PAY">
					</a> <a href="#" class="m-all-1"> <img
						src="images/icons/icon-pay-02.png" alt="ICON-PAY">
					</a> <a href="#" class="m-all-1"> <img
						src="images/icons/icon-pay-03.png" alt="ICON-PAY">
					</a> <a href="#" class="m-all-1"> <img
						src="images/icons/icon-pay-04.png" alt="ICON-PAY">
					</a> <a href="#" class="m-all-1"> <img
						src="images/icons/icon-pay-05.png" alt="ICON-PAY">
					</a>
				</div>
			</div>
		</div>
	</footer>


	<!-- Back to top -->
	<div class="btn-back-to-top" id="myBtn">
		<span class="symbol-btn-back-to-top"> <i
			class="zmdi zmdi-chevron-up"></i>
		</span>
	</div>


	<!--===============================================================================================-->
	<script src="/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="/vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="/vendor/bootstrap/js/popper.js"></script>
	<script src="/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="/vendor/select2/select2.min.js"></script>
	<script>
		$(".js-select2").each(function() {
			$(this).select2({
				minimumResultsForSearch : 20,
				dropdownParent : $(this).next('.dropDownSelect2')
			});
		})
	</script>
	<!--===============================================================================================-->
	<script src="/vendor/daterangepicker/moment.min.js"></script>
	<script src="/vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="/vendor/slick/slick.min.js"></script>
	<script src="/js/slick-custom.js"></script>
	<!--===============================================================================================-->
	<script src="/vendor/parallax100/parallax100.js"></script>
	<script>
		$('.parallax100').parallax100();
	</script>
	<!--===============================================================================================-->
	<script src="/vendor/MagnificPopup/jquery.magnific-popup.min.js"></script>
	<script>
		$('.gallery-lb').each(function() { // the containers for all your galleries
			$(this).magnificPopup({
				delegate : 'a', // the selector for gallery item
				type : 'image',
				gallery : {
					enabled : true
				},
				mainClass : 'mfp-fade'
			});
		});
	</script>
	<!--===============================================================================================-->
	<script src="/vendor/isotope/isotope.pkgd.min.js"></script>
	<!--===============================================================================================-->
	<script src="/vendor/sweetalert/sweetalert.min.js"></script>
	<script>
		$('.js-addwish-b2').on('click', function(e) {
			e.preventDefault();
		});

		$('.js-addwish-b2').each(
				function() {
					var nameProduct = $(this).parent().parent().find(
							'.js-name-b2').html();
					$(this).on('click', function() {
						swal(nameProduct, "is added to wishlist !", "success");

						$(this).addClass('js-addedwish-b2');
						$(this).off('click');
					});
				});

		$('.js-addwish-detail').each(
				function() {
					var nameProduct = $(this).parent().parent().parent().find(
							'.js-name-detail').html();

					$(this).on('click', function() {
						swal(nameProduct, "is added to wishlist !", "success");

						$(this).addClass('js-addedwish-detail');
						$(this).off('click');
					});
				});

		/*---------------------------------------------*/

		$('.js-addcart-detail').each(
				function() {
					var nameProduct = $(this).parent().parent().parent()
							.parent().find('.js-name-detail').html();
					$(this).on('click', function() {
						swal(nameProduct, "is added to cart !", "success");
					});
				});
	</script>
	<!--===============================================================================================-->
	<script src="/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script>
		$('.js-pscroll').each(function() {
			$(this).css('position', 'relative');
			$(this).css('overflow', 'hidden');
			var ps = new PerfectScrollbar(this, {
				wheelSpeed : 1,
				scrollingThreshold : 1000,
				wheelPropagation : false,
			});

			$(window).on('resize', function() {
				ps.update();
			})
		});
	</script>
	<!--===============================================================================================-->
	<script src="/js/main.js"></script>

</body>
</html>