<%-- 
    Document   : success
    Created on : Mar 9, 2016, 2:42:57 PM
    Author     : nisolution
--%>

<%@ page import="org.semanticweb.owlapi.apibinding.OWLManager" %>
<%@ page import="org.semanticweb.owlapi.model.IRI" %>
<%@ page import="org.semanticweb.owlapi.model.OWLAnnotation" %>
<%@ page import="org.semanticweb.owlapi.model.OWLClass" %>
<%@ page import="org.semanticweb.owlapi.model.OWLException" %>
<%@ page import="org.semanticweb.owlapi.model.OWLOntology" %>
<%@ page import="org.semanticweb.owlapi.model.OWLOntologyManager" %>
<%@ page import="org.semanticweb.owlapi.reasoner.OWLReasoner" %>
<%@ page import="org.semanticweb.owlapi.reasoner.OWLReasonerFactory" %>
<%@ page import="org.semanticweb.owlapi.model.OWLAxiom" %>
<%@ page import="org.semanticweb.owlapi.model.AxiomType" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="javax.servlet.http.Cookie" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>Home - CoMOnTool</title>

		<meta name="description" content="" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<!-- basic styles -->

		<link href="css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->

		<!-- fonts -->

		<link rel="stylesheet" href="css/ace-fonts.css" />

		<!-- ace styles -->

		<link rel="stylesheet" href="css/ace.min.css" />
		<link rel="stylesheet" href="css/ace-rtl.min.css" />
		<link rel="stylesheet" href="css/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->

		<script src="js/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="js/html5shiv.js"></script>
		<script src="js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body>
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="HomeServlet" class="navbar-brand">
						<small>
							
                                                    <span class="white">CoMOn</span>
						    <span class="white">Tool</span>
						</small>
					</a><!-- /.brand -->
				</div><!-- /.navbar-header -->

				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
					<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<span class="user-info">
									<small>Welcome,</small>
									${user_name}
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								

								<li>
									<a href="LoginServlet">
										<i class="icon-off"></i>
										Logout
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
			</div><!-- /.container -->
		</div>

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>

				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<i class="icon-globe"></i>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<i class="icon-globe"></i>
						</div>
					</div><!-- #sidebar-shortcuts -->

					<ul class="nav nav-list">
						<li class="active">
							<a href="HomeServlet">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Dashboard </span>
							</a>
						</li>

						<li>
							<a href="MainOWLClass">
								<i class="icon-circle"></i>
								<span class="menu-text"> Class </span>
							</a>
						</li>
                                                <li>
							<a href="MainOWLObject">
								<i class="icon-certificate"></i>
								<span class="menu-text"> Object Property </span>
							</a>
						</li>
                                                <li>
							<a href="MainOWLData">
								<i class="icon-asterisk"></i>
								<span class="menu-text"> Data Property </span>
							</a>
						</li>
                                                <li>
							<a href="MainOWLIndividual">
								<i class="icon-list"></i>
								<span class="menu-text"> Individual </span>
							</a>
						</li>
                                        </ul><!-- /.nav-list -->
                                </div>

				<div class="main-content">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="HomeServlet">Home</a>
							</li>
                                                </ul><!-- .breadcrumb -->
                                        </div>

					<div class="page-content">
                                            <div class="page-header">
							<h1>
								Compliance Management
								<small>
									<i class="icon-double-angle-right"></i>
									Ontology Overview
								</small>
							</h1>
						</div><!-- /.page-header -->

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
                                                                
                                                                <div class="row"> 
                                                               <div class="col-xs-12 col-sm-12">
											<div class="left">
												<div class="profile-user-info profile-user-info-striped">
												<div class="profile-info-row">
													<div class="profile-info-name"> Ontology ID </div>

													<div class="profile-info-value">
														<span><c:out value="${ontology.getOntologyID()}"/></span>
													</div>
												</div>

												<div class="profile-info-row">
													<div class="profile-info-name"> Axiom</div>

													<div class="profile-info-value">
														
                                                                                                            <span><c:out value="${ontology.getAxiomCount()}"/></span>
													</div>
												</div>

												<div class="profile-info-row">
													<div class="profile-info-name"> Logical Axiom </div>

													<div class="profile-info-value">
														<span><c:out value="${ontology.getLogicalAxiomCount()}"/></span>
													</div>
												</div>

												<div class="profile-info-row">
													<div class="profile-info-name">Declare Axiom</div>

													<div class="profile-info-value">
														<span><c:out value="${declare}"/></span>
													</div>
												</div>
                                                                                                        <div class="profile-info-row">
													<div class="profile-info-name">DL Expressivity</div>

													<div class="profile-info-value">
														<span><c:out value="${express}"/></span>
													</div>
												</div>		
											</div>
									     </div>
                                                                   </div>
                                                        </div>
                                                                                                        
                                                                <div class="space-24"></div>
								<h3 class="header smaller red"></h3>

                                                                                                        
                                                                                <div class="row">                                                       
                                                                                <div class="col-xs-6 col-sm-3 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-green">
												<h5 class="bigger lighter">Class Count</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													
													<div class="price">
														<c:out value="${classcount}"/>
														
													</div>
												</div>

												<div>
													<a href="MainOWLClass" class="btn btn-block btn-success">
														<i class="icon-circle bigger-110"></i>
														<span>View</span>
													</a>
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-6 col-sm-3 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-blue">
												<h5 class="bigger lighter">Object Property Count</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													
													<div class="price">
														<c:out value="${objectcount}"/>
														
													</div>
												</div>

												<div>
													<a href="MainOWLObject" class="btn btn-block btn-primary">
														<i class="icon-certificate bigger-110"></i>
														<span>View</span>
													</a>
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-6 col-sm-3 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-orange">
												<h5 class="bigger lighter">Data Property Count</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													
													<div class="price">
														<c:out value="${datacount}"/>
														
													</div>
												</div>

												<div>
													<a href="MainOWLData" class="btn btn-block btn-warning">
														<i class="icon-asterisk bigger-110"></i>
														<span>View</span>
													</a>
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-6 col-sm-3 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-red">
												<h5 class="bigger lighter">Individual Count</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													
													<div class="price">
														<c:out value="${indcount}"/>
														
													</div>
												</div>

												<div>
													<a href="MainOWLIndividual" class="btn btn-block btn-danger">
														<i class="icon-list bigger-110"></i>
														<span>View</span>
													</a>
												</div>
											</div>
										</div>
									</div>
                                                        </div>
                                                
								



								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->
                        </div><!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!-- ace scripts -->

		<script src="js/ace-elements.min.js"></script>
		<script src="js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
	</body>
</html>

