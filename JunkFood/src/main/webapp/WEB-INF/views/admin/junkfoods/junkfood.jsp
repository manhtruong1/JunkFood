<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en" class="light-style layout-menu-fixed" dir="ltr"
	data-theme="theme-default" data-/assets-path="../assets/"
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

<!-- /fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap"
	rel="stylesheet" />

<!-- Icons. Uncomment required icon /fonts -->
<link rel="stylesheet" href="/assets/vendor/fonts/boxicons.css" />

<!-- Core /css -->
<link rel="stylesheet" href="/css/core.css"
	class="template-customizer-core-css" />
<link rel="stylesheet" href="/css/theme-default.css"
	class="template-customizer-theme-css" />
<link rel="stylesheet" href="/css/demo.css" />

<link rel="stylesheet"
	href="/fontawesome-free-6.0.0-web/css/all.min.css">

<script src="/assets/vendor/js/helpers.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>

<body>
	<!-- Layout wrapper -->
	<div class="layout-wrapper layout-content-navbar">
		<div class="layout-container">
			<!-- Menu -->
			<aside id="layout-menu"
				class="layout-menu menu-vertical menu bg-menu-theme">
				<div class="app-brand demo">
					<a href="index.html" class="app-brand-link"> <span
						class="app-brand-logo demo"> <svg width="25"
								viewBox="0 0 25 42" version="1.1"
								xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink">
                <defs>
                  <path
									d="M13.7918663,0.358365126 L3.39788168,7.44174259 C0.566865006,9.69408886 -0.379795268,12.4788597 0.557900856,15.7960551 C0.68998853,16.2305145 1.09562888,17.7872135 3.12357076,19.2293357 C3.8146334,19.7207684 5.32369333,20.3834223 7.65075054,21.2172976 L7.59773219,21.2525164 L2.63468769,24.5493413 C0.445452254,26.3002124 0.0884951797,28.5083815 1.56381646,31.1738486 C2.83770406,32.8170431 5.20850219,33.2640127 7.09180128,32.5391577 C8.347334,32.0559211 11.4559176,30.0011079 16.4175519,26.3747182 C18.0338572,24.4997857 18.6973423,22.4544883 18.4080071,20.2388261 C17.963753,17.5346866 16.1776345,15.5799961 13.0496516,14.3747546 L10.9194936,13.4715819 L18.6192054,7.984237 L13.7918663,0.358365126 Z"
									id="path-1"></path>
                  <path
									d="M5.47320593,6.00457225 C4.05321814,8.216144 4.36334763,10.0722806 6.40359441,11.5729822 C8.61520715,12.571656 10.0999176,13.2171421 10.8577257,13.5094407 L15.5088241,14.433041 L18.6192054,7.984237 C15.5364148,3.11535317 13.9273018,0.573395879 13.7918663,0.358365126 C13.5790555,0.511491653 10.8061687,2.3935607 5.47320593,6.00457225 Z"
									id="path-3"></path>
                  <path
									d="M7.50063644,21.2294429 L12.3234468,23.3159332 C14.1688022,24.7579751 14.397098,26.4880487 13.008334,28.506154 C11.6195701,30.5242593 10.3099883,31.790241 9.07958868,32.3040991 C5.78142938,33.4346997 4.13234973,34 4.13234973,34 C4.13234973,34 2.75489982,33.0538207 2.37032616e-14,31.1614621 C-0.55822714,27.8186216 -0.55822714,26.0572515 -4.05231404e-15,25.8773518 C0.83734071,25.6075023 2.77988457,22.8248993 3.3049379,22.52991 C3.65497346,22.3332504 5.05353963,21.8997614 7.50063644,21.2294429 Z"
									id="path-4"></path>
                  <path
									d="M20.6,7.13333333 L25.6,13.8 C26.2627417,14.6836556 26.0836556,15.9372583 25.2,16.6 C24.8538077,16.8596443 24.4327404,17 24,17 L14,17 C12.8954305,17 12,16.1045695 12,15 C12,14.5672596 12.1403557,14.1461923 12.4,13.8 L17.4,7.13333333 C18.0627417,6.24967773 19.3163444,6.07059163 20.2,6.73333333 C20.3516113,6.84704183 20.4862915,6.981722 20.6,7.13333333 Z"
									id="path-5"></path>
                </defs>
                <g id="g-app-brand" stroke="none" stroke-width="1"
									fill="none" fill-rule="evenodd">
                  <g id="Brand-Logo"
									transform="translate(-27.000000, -15.000000)">
                    <g id="Icon"
									transform="translate(27.000000, 15.000000)">
                      <g id="Mask"
									transform="translate(0.000000, 8.000000)">
                        <mask id="mask-2" fill="white">
                          <use xlink:href="#path-1"></use>
                        </mask>
                        <use fill="#696cff" xlink:href="#path-1"></use>
                        <g id="Path-3" mask="url(#mask-2)">
                          <use fill="#696cff" xlink:href="#path-3"></use>
                          <use fill-opacity="0.2" fill="#FFFFFF"
									xlink:href="#path-3"></use>
                        </g>
                        <g id="Path-4" mask="url(#mask-2)">
                          <use fill="#696cff" xlink:href="#path-4"></use>
                          <use fill-opacity="0.2" fill="#FFFFFF"
									xlink:href="#path-4"></use>
                        </g>
                      </g>
                      <g id="Triangle"
									transform="translate(19.000000, 11.000000) rotate(-300.000000) translate(-19.000000, -11.000000) ">
                        <use fill="#696cff" xlink:href="#path-5"></use>
                        <use fill-opacity="0.2" fill="#FFFFFF"
									xlink:href="#path-5"></use>
                      </g>
                    </g>
                  </g>
                </g>
              </svg>
					</span> <span class="app-brand-text menu-text fs-3 ms-2">Store</span>
					</a> <a href="javascript:void(0);"
						class="layout-menu-toggle menu-link text-large ms-auto d-block d-xl-none">
						<i class="bx bx-chevron-left bx-sm align-middle"></i>
					</a>
				</div>

				<div class="menu-inner-shadow"></div>
				<ul class="menu-inner py-1">
					<!-- Dashboard -->
					<li class="menu-item active"><a href="index.html"
						class="menu-link"> <i
							class="menu-icon tf-icons bx bx-home-circle"></i>
							<div data-i18n="Analytics">Home</div>
					</a></li>
					<!-- Components -->
					<li class="menu-header small text-uppercase"><span
						class="menu-header-text">Components</span></li>
					<!-- Cards -->
					<li class="menu-item"><a href="cards-basic.html"
						class="menu-link"> <i class="fa fa-video mx-2"></i>
							<div data-i18n="Basic">Management Account</div>
					</a></li>
					<li class="menu-item"><a href="icons-boxicons.html"
						class="menu-link"> <i class="fa fa-user-alt mx-2"></i>
							<div data-i18n="Boxicons">Management Product</div>
					</a></li>
					<li class="menu-item"><a href="icons-boxicons.html"
						class="menu-link"> <i class="fa fa-user-alt mx-2"></i>
							<div data-i18n="Boxicons">Management Order</div>
					</a></li>
					<li class="menu-item"><a href="icons-boxicons.html"
						class="menu-link"> <i class="fa fa-user-alt mx-2"></i>
							<div data-i18n="Boxicons">Management Order Detail</div>
					</a></li>
					<li class="menu-item"><a href="javascript:void(0);"
						class="menu-link menu-toggle"> <i
							class="fa-solid fa-address-card mx-3"></i>
							<div data-i18n="Account Settings">Reports</div>
					</a>
						<ul class="menu-sub">
							<li class="menu-item"><a
								href="pages-account-settings-account.html" class="menu-link">
									<div data-i18n="Account">Favorites</div>
							</a></li>
							<li class="menu-item"><a
								href="pages-account-settings-notifications.html"
								class="menu-link">
									<div data-i18n="Notifications">Favorites Users</div>
							</a></li>
							<li class="menu-item"><a
								href="pages-account-settings-connections.html" class="menu-link">
									<div data-i18n="Connections">Share Friend</div>
							</a></li>
						</ul></li>

					<li class="menu-header small text-uppercase"><span
						class="menu-header-text">More Form</span></li>
					<li class="menu-item"><a href="tables-basic.html"
						class="menu-link"> <i class="fa-solid fa-gear mx-3"></i>
							<div data-i18n="Tables">Setting</div>
					</a></li>
					<li class="menu-item"><a href="tables-basic.html"
						class="menu-link"> <i class="fa fa-comments mx-3"></i>
							<div data-i18n="Tables">Help</div>
					</a></li>





				</ul>
			</aside>
			<!-- / Menu -->

			<!-- Layout container -->
			<div class="layout-page">
				<!-- Navbar -->
				<nav
					class="layout-navbar container-xxl navbar navbar-expand-xl navbar-detached align-items-center bg-navbar-theme"
					id="layout-navbar">
					<div
						class="layout-menu-toggle navbar-nav align-items-xl-center me-3 me-xl-0 d-xl-none">
						<a class="nav-item nav-link px-0 me-xl-4"
							href="javascript:void(0)"> <i class="bx bx-menu bx-sm"></i>
						</a>
					</div>

					<div class="navbar-nav-right d-flex align-items-center"
						id="navbar-collapse">
						<!-- Search -->
						<div class="navbar-nav align-items-center">
							<div class="nav-item d-flex align-items-center">
								<i class="bx bx-search fs-4 lh-0"></i> <input type="text"
									class="form-control border-0 shadow-none"
									placeholder="Search..." aria-label="Search..." />
							</div>
						</div>
						<!-- /Search -->

						<ul class="navbar-nav flex-row align-items-center ms-auto">
							<!-- Place this tag where you want the button to render. -->
							<li class="nav-item lh-1 me-3"><a class="github-button"
								href="" data-icon="octicon-star" data-size="large"
								data-show-count="true"
								aria-label="Star themeselection/sneat-html-admin-template-free on GitHub">Star</a>
							</li>

							<!-- User -->
							<li class="nav-item navbar-dropdown dropdown-user dropdown">
								<a class="nav-link dropdown-toggle hide-arrow"
								href="javascript:void(0);" data-bs-toggle="dropdown">
									<div class="avatar avatar-online">
										<img src="/images/duc.jpg" alt
											class="w-px-40 h-auto rounded-circle" />
									</div>
							</a>
								<ul class="dropdown-menu dropdown-menu-end">
									<li><a class="dropdown-item" href="#">
											<div class="d-flex">
												<div class="flex-shrink-0 me-3">
													<div class="avatar avatar-online">
														<img src="/images/duc.jpg" alt
															class="w-px-40 h-auto rounded-circle" />
													</div>
												</div>
												<div class="flex-grow-1">
													<span class="fw-semibold d-block">Duy Đức</span> <small
														class="text-muted">Admin</small>
												</div>
											</div>
									</a></li>
									<li>
										<div class="dropdown-divider"></div>
									</li>
									<li><a class="dropdown-item" href="#"> <i
											class="bx bx-user me-2"></i> <span class="align-middle">My
												Profile</span>
									</a></li>
									<li><a class="dropdown-item" href="#"> <i
											class="bx bx-cog me-2"></i> <span class="align-middle">Settings</span>
									</a></li>
									<li><a class="dropdown-item" href="#"> <span
											class="d-flex align-items-center align-middle"> <i
												class="flex-shrink-0 bx bx-credit-card me-2"></i> <span
												class="flex-grow-1 align-middle">Billing</span> <span
												class="flex-shrink-0 badge badge-center rounded-pill bg-danger w-px-20 h-px-20">4</span>
										</span>
									</a></li>
									<li>
										<div class="dropdown-divider"></div>
									</li>
									<li><a class="dropdown-item" href="auth-login-basic.html">
											<i class="bx bx-power-off me-2"></i> <span
											class="align-middle">Log Out</span>
									</a></li>
								</ul>
							</li>
							<!--/ User -->
						</ul>
					</div>
				</nav>
				<!-- / Navbar -->

				<!-- Content wrapper -->
				<div class="content-wrapper">
					<!-- QLSP -->
					<div class="container">
						<div class="row mt-3 mb-5">
							<div class="col-12">
								<div class="row mt-3">
									<c:if test="${not empty sessionScope.message}">
										<div class="col">
											<div class="alert alert-success fs-4" role="alert">
												${sessionScope.message}
												<c:remove var="message" scope="session" />
											</div>
										</div>
									</c:if>
									<c:if test="${not empty sessionScope.error}">
										<div class="col">
											<div class="alert alert-danger fs-4" role="alert">
												${sessionScope.error}
												<c:remove var="error" scope="session" />
											</div>
										</div>
									</c:if>
								</div>
								<!-- Button trigger modal -->
								<button type="button" class="btn btn-success"
									data-bs-toggle="modal" data-bs-target="#exampleModalProduct">
									+ Create</button>

								<!-- Modal -->
								<div class="modal fade" id="exampleModalProduct" tabindex="-1"
									aria-labelledby="exampleModalLabel" aria-hidden="true">
									<div class="modal-dialog modal-lg">
										<div class="modal-content">
											<div class="modal-header bg-black ">
												<h5 class="modal-title text-white" id="exampleModalLabel">Thêm
													mới sản phẩm</h5>
												<button type="button" class="btn-close"
													data-bs-dismiss="modal" aria-label="Close"></button>
											</div>
											<form:form action="/junkfood/create" method="post"
												modelAttribute="product">
												<div class="modal-body">
													<div class="card-body">
														<div class="row">
															<div class="col-5">
																<img src="" width="90%" alt="">
																<form:input type="file" path="image" />
															</div>
															<div class="col-7">
																<div class="form-group">
																	<form:label path="">Name</form:label>
																	<form:input class="form-control mt-2" path="name"
																		placeholder="Name" />
																</div>
																<div class="form-group mt-3">
																	<form:label path="">Quantity</form:label>
																	<form:input class="form-control mt-2" path="quantity"
																		placeholder="Quantity" />
																</div>
																<div class="form-group mt-3">
																	<form:label path="">Price</form:label>
																	<form:input class="form-control mt-2" path="price"
																		placeholder="Price" />
																</div>
																<div class="form-group mt-3">
																	<form:label path="">Thể Loại</form:label>
																	<form:select class="form-select" path="category">
																		<c:forEach var="lCategory" items="${lCategory}">
																			<form:option value="${lCategory.categoryid}">${lCategory.name}</form:option>
																		</c:forEach>
																	</form:select>
																</div>
																<div class="form-group mt-3">
																	<form:label path="">Vị</form:label>
																	<form:select class="form-select" path="taste">
																		<c:forEach var="taste" items="${tastes}">
																			<form:option value="${taste}">${taste}</form:option>
																		</c:forEach>
																	</form:select>
																</div>
																<div class="form-group mt-3">
																	<form:label path="">Chất Dinh Dưỡng</form:label>
																	<form:select class="form-select" path="nutrient">
																		<c:forEach var="nutrient" items="${nutrients}">
																			<form:option value="${nutrient}">${nutrient}</form:option>
																		</c:forEach>
																	</form:select>
																</div>
																<div class="mt-3">
																	<label>Description</label>
																	<div class="form-floating">
																		<form:textarea class="form-control" path="description"
																			placeholder="Leave a comment here"
																			id="floatingTextarea2" style="height: 100px"></form:textarea>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
												<div class="modal-footer">
													<form:button class="btn btn-success">Create</form:button>
													<button type="button" class="btn btn-secondary"
														data-bs-dismiss="modal">Close</button>
												</div>
											</form:form>
										</div>
									</div>
								</div>
								<div class="card mt-4">
									<div class="card-header">
										<h5 class="float-start mt-2">Quản Lý Sản Phẩm</h5>
										<div class="row float-start">
										<%-- 	<form action="/junkfood/search">
												<label for="browser" class="form-label">Tìm Kiếm
													Theo Tên</label> <input class="form-control" name="name" id="name">
												<button type="submit" class="btn btn-primary mt-3 float-end">Submit</button>
											</form> --%>
										</div>
										<nav class="navbar bg-light float-end">
											<div class="container-fluid">
												<form action="/junkfood">
													<label for="browser" class="form-label">Tìm Kiếm
														Theo Tên</label> <input class="form-control" name="name" id="name">


													<label for="browser" class="form-label">Tìm Kiếm
														Theo Thể Loại</label> <input class="form-control"
														list="browsers" name="category" id="category"
														autocomplete="off">
													<datalist id="browsers" class="float-start">
														<c:forEach var="lCategory" items="${lCategory}">
															<option value="${lCategory.categoryid}">${lCategory.name}</option>
														</c:forEach>
													</datalist>
													<button type="submit"
														class="btn btn-primary mt-3 float-end">Submit</button>
												</form>
											</div>
										</nav>
									</div>
									<div class="table-responsive">
										<table class="table table-dark table-striped">
											<thead>
												<tr>
													<th>ID</th>
													<th>Product Name</th>
													<th>Quantity</th>
													<th>Price</th>
													<th>Image</th>
													<th>Create Date</th>
													<th>Category</th>
													<th>Nutrient</th>
													<th>Taste</th>
													<th>Description</th>
													<th colspan="2" class="text-center">Action</th>
												</tr>
											</thead>
											<tbody class="table-border-bottom-0">
												<c:forEach var="product" items="${products.content}">
													<tr>
														<td>${product.productid}</td>
														<td>${product.name}</td>
														<td>${product.quantity}</td>
														<td><fmt:formatNumber value="${product.price}"
																pattern="#,###" /></td>
														<td>${product.image}</td>
														<td><fmt:formatDate value="${product.createDate}"
																pattern="dd/MM/YYYY" /></td>
														<td>${product.category.name}</td>
														<td>${product.nutrient}</td>
														<td>${product.taste}</td>
														<td>${product.description}</td>
														<td>
															<!-- Button trigger modal -->
															<button type="button" class="btn btn-warning"
																data-bs-toggle="modal"
																data-bs-target="#editModal_${product.productid}">
																Edit</button> <!-- Modal -->
															<div class="modal fade"
																id="editModal_${product.productid}" tabindex="-1"
																aria-labelledby="exampleModalLabel" aria-hidden="true">
																<div class="modal-dialog modal-lg">
																	<div class="modal-content">
																		<div class="modal-header bg-dark ">
																			<h5 class="modal-title text-whitle"
																				id="exampleModalLabel">Edit product</h5>
																			<button type="button" class="btn-close"
																				data-bs-dismiss="modal" aria-label="Close"></button>
																		</div>
																		<form:form
																			action="/junkfood/update?productid=${product.productid}"
																			method="post" modelAttribute="product">
																			<div class="modal-body">
																				<div class="card-body">
																					<div class="row">
																						<div class="col-5">
																							<img src="" width="90%" alt="">
																							<form:input type="file" path="image" />
																						</div>
																						<div class="col-7">
																							<div class="form-group">
																								<input type="hidden" name="productid"
																									id="productid" value="${product.productid}">

																								<label class="text-dark">Name</label>
																								<form:input class="form-control mt-2"
																									path="name" value="${product.name}"
																									placeholder="Name" />
																							</div>
																							<div class="form-group mt-3">
																								<label class="text-dark">Quantity</label>

																								<form:input class="form-control mt-2"
																									path="quantity" value="${product.quantity}"
																									placeholder="Quantity" />
																							</div>
																							<div class="form-group mt-3">
																								<label class="text-dark">Price</label>
																								<form:input class="form-control mt-2"
																									path="price" value="${product.price}"
																									placeholder="Price" />
																							</div>


																							<div class="form-group mt-3">
																								<form:label path="" class="text-dark">Thể Loại</form:label>
																								<form:select class="form-select" path="category">
																									<form:option
																										value="${product.category.categoryid}">${product.category.name}</form:option>
																									<c:forEach var="lCategory" items="${lCategory}">
																										<form:option value="${lCategory.categoryid}">
																										${lCategory.name}
																										</form:option>
																									</c:forEach>
																								</form:select>
																							</div>


																							<div class="form-group mt-3">
																								<form:label path="" class="text-dark">Vị</form:label>
																								<form:select class="form-select" path="taste">
																									<form:option value="${product.taste}">${product.taste}</form:option>
																									<c:forEach var="taste" items="${tastes}">
																										<form:option value="${taste}">${taste}</form:option>
																									</c:forEach>
																								</form:select>
																							</div>
																							<div class="form-group mt-3">
																								<form:label path="" class="text-dark">Chất Dinh Dưỡng</form:label>
																								<form:select class="form-select" path="nutrient">
																									<form:option value="${product.nutrient}">${product.nutrient}</form:option>
																									<c:forEach var="nutrient" items="${nutrients}">
																										<form:option value="${nutrient}">${nutrient}</form:option>
																									</c:forEach>
																								</form:select>
																							</div>
																							<div class="mt-3 text-dark">
																								<label>Description</label>
																								<div class="form-floating">
																									<form:input class="form-control"
																										path="description"
																										value="${product.description}"
																										placeholder="Leave a comment here"
																										id="floatingTextarea2" style="height:70px" />

																								</div>
																							</div>
																							<%-- <div class="mt-3 text-dark">
																								<label>Description</label>
																								<div class="form-floating">
																									<form:textarea class="form-control"
																										path="description"
																										value="${product.description}"
																										placeholder="Leave a comment here"
																										id="floatingTextarea2" style="height: 100px"></form:textarea>

																								</div>
																							</div> --%>
																						</div>
																					</div>

																				</div>

																			</div>
																			<div class="modal-footer">
																				<form:button class="btn btn-primary">Edit</form:button>
																				<button type="button" class="btn btn-secondary"
																					data-bs-dismiss="modal">Close</button>
																			</div>
																		</form:form>
																	</div>
																</div>
															</div>
														</td>
														<td>
															<!-- Button trigger modal -->
															<button type="button" class="btn btn-danger"
																data-bs-toggle="modal"
																data-bs-target="#deleteModal_${product.productid}">
																Delete</button> <!-- Modal -->
															<div class="modal fade"
																id="deleteModal_${product.productid}" tabindex="-1"
																aria-labelledby="exampleModalLabel" aria-hidden="true">
																<div class="modal-dialog">
																	<div class="modal-content">
																		<div class="modal-header  bg-dark">
																			<h5 class="modal-title text-whitle"
																				id="exampleModalLabel">Bạn có thực sự muốn
																				xóa</h5>
																			<button type="button" class="btn-close"
																				data-bs-dismiss="modal" aria-label="Close"></button>
																		</div>
																		<div class="modal-body">
																			<p class="text-dark">
																				Tên Sản Phẩm: <b>${product.name}</b>

																			</p>
																		</div>
																		<div class="modal-footer">
																			<a href="/junkfood/delete/${product.productid}"
																				class="btn btn-primary">Delete</a>

																			<button type="button" class="btn btn-secondary"
																				data-bs-dismiss="modal">Close</button>
																		</div>
																	</div>
																</div>
															</div>
														</td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
									<div class="card-footer">
										<p>Showing out of entries</p>
										<nav aria-label="Page navigation example ">
											<ul class="pagination d-flex justify-content-end">
												<li class="page-item"><a class="page-link"
													href="/junkfood?pageNumber=0">Fist</a></li>
												<c:if test="${products.getNumber() > 0}">
													<li class="page-item"><a class="page-link"
														href="/junkfood?pageNumber=${products.number - 1}">Previous</a></li>
												</c:if>
												<c:if test="${products.getNumber() <= 0}">
													<li class="page-item disabled"><a class="page-link">Previous</a>
													</li>
												</c:if>
												<li class="page-item"><a class="page-link"
													href="/junkfood?pageNumber=${products.number + 1}">Next</a></li>
												<li class="page-item"><a class="page-link"
													href="/junkfood?pageNumber=${products.totalPages + 1}">Last</a></li>
											</ul>
										</nav>
										<ul>
											<li>Số thực thể hiện tại: ${products.numberOfElements}</li>
											<li>Trang số: ${products.number}</li>
											<li>Kích thước trang: ${products.size}</li>
											<li>Tổng số thực thể: ${products.totalElements}</li>
											<li>Tổng số trang: ${products.totalPages}</li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- QLSP -->
					<div class="content-backdrop fade"></div>
				</div>
				<!-- Content wrapper -->
			</div>
			<!-- / Layout page -->
		</div>

		<!-- Overlay -->
		<div class="layout-overlay layout-menu-toggle"></div>
	</div>
	<!-- / Layout wrapper -->

	<script src="/js/jquery.min.js"></script>
	<script src="/js/popper.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<!-- <script src="/css/perfect-scrollbar.js"></script> -->

	<script src="/js/perfect-scrollbar.js"></script>
	<script src="/assets/vendor/js/menu.js"></script>
	<script src="/js/main.js"></script>


</body>

</html>