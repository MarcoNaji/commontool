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
<%@ page import="org.semanticweb.owlapi.model.OWLObjectProperty" %>
<%@ page import="org.semanticweb.owlapi.model.OWLObjectPropertyExpression" %>
<%@ page import="org.semanticweb.owlapi.model.OWLDataProperty" %>
<%@ page import="org.semanticweb.owlapi.model.OWLDataPropertyExpression" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="java.util.Set" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>Manage Data Property - CoMOnTool</title>

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
                <link rel="stylesheet" href="css/chosen.css" />
                

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
						<li>
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
                                                <li class="active">
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
                                                        <li>
								<a href="MainOWLData">Manage Data Property</a>
							</li>
                                                        <li>
								View Data Property
							</li>
                                                </ul><!-- .breadcrumb -->
                                        </div>
                                    
                                    
                                   
                                        <c:set var="dataname" value="${data.getIRI().getFragment()}" scope="page" />
                                        <c:set var="dataIRI" value="${data.getIRI()}" scope="page" />
                                        
                                       

					<div class="page-content">
                                            <div class="page-header">
							<h1>
								Compliance Management
								<small>
									<i class="icon-double-angle-right"></i>
									<c:out value="${dataname}"/> Data Property
								</small>
							</h1>
						</div><!-- /.page-header -->
                                                
                                                <c:if test="${not empty msg}">
                                                <div class="alert alert-block alert-success">
											<button type="button" class="close" data-dismiss="alert">
												<i class="icon-remove"></i>
											</button>

											<p>
												<strong>
													<i class="icon-ok"></i>
													Ok!
												</strong>
												${msg}
											</p>

										</div>
                                                                                        </c:if>
                                                
                                                     
                                                
                                                                                        
                                                                                                                              

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
                                                                
                                                                <div class="row">
									<div class="col-xs-12">
                                                                            
                                                                            <div class="space-12"></div>
                                                                            <h3 class="header smaller lighter green">Data Property Details</h3>


											<div class="profile-user-info profile-user-info-striped">
												<div class="profile-info-row">
													<div class="profile-info-name"> Data Property Name </div>

													<div class="profile-info-value">
														<span><c:out value="${dataname}"/></span>
													</div>
												</div>

												<div class="profile-info-row">
													<div class="profile-info-name"> Data IRI </div>

													<div class="profile-info-value">
														<span><c:out value="${dataIRI}"/></span>
													</div>
												</div>
                                                                                                 <div class="profile-info-row">
													<div class="profile-info-name"> Comment </div>

													<div class="profile-info-value">
                                                                                                            <span><c:choose><c:when test="${not empty annotation}">${annotation}</c:when><c:otherwise> No Comment</c:otherwise></c:choose></span>
													</div>
												</div>
                                                                                        </div>
                                                                                                        <div class="space-24"></div>

									<h3 class="header smaller lighter blue">
										Characteristics
                                                                                    <button class="btn-sm btn-success pull-right" onclick="edit_char(this);" value="<c:out value="${dataname}"/>">Edit</button>
										
									</h3>

									<div class="row">
										<div class="col-xs-12 col-sm-12">
											<div class="control-group">
												<label class="control-label bolder blue"></label>

												
													<label>
                                                                                                                <input name="form-field-checkbox" <c:if test="${isFun}"> checked="checked" </c:if> disabled="disabled" type="checkbox" class="ace" />
														<span class="lbl"> Functional</span>
													</label>
												                                                                                
                                                                                                        
												
											</div>
										</div>

										
									</div><!-- /row -->

									

                                                                                                        <div class="space-12"></div>
                                                                                                        <div class="row">
                                                                                                            
                                                                                                                
                                                                                                                
                                                                                                                <div class="col-xs-12 col-sm-6 widget-container-span">
                                                                                                                    <h3 class="row-fluid header smaller lighter purple"> Super Property </h3>
										<div class="widget-box collapsed">

											<div class="widget-header header-color-blue">
												<h5 class="bigger lighter">
													
													<button class="btn btn-success" onclick="edit_super(this);" value="<c:out value="${dataname}"/>">Edit</button>
												</h5>
                                                                                            
                                                                                            <div class="widget-toolbar">


												<a href="#" data-action="collapse">
														<i class="icon-chevron-down"></i>
													</a>
                                                                                            </div>

											</div>

											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover">
														

														<tbody>
                                                                                                                    <c:choose>
                                                                                                                     <c:when test="${not empty superproperty}">
                                                                                                                    <c:forEach items="${superproperty}" var="super">
															<tr>
																<td class=""><c:out value="${super.getIRI().getFragment()}"/></td>

																

																<td>
																	<a href="ViewData?name=${super.getIRI().getFragment()}"><button class="btn btn-xs btn-info">
																	<i class="icon-zoom-in bigger-120"></i>
                                                                                                                                </button></a>
                                                                                                                                        <a href="ChangeSuperData?name=<c:out value="${dataname}"/>" onclick="return confirm('Are you sure you want to cancel the superproperty relationship? note that this data property will be parentless.');"><button class="btn btn-xs btn-danger">
																	<i class="icon-remove bigger-120"></i>
                                                                                                                                </button></a>
																</td>
															</tr>
                                                                                                                    </c:forEach>
                                                                                                                     </c:when>
                                                                                                                        <c:otherwise>
                                                                                                                            <td>
																	<span>No data found.</span>
																</td>
                                                                                                                    </c:otherwise>
                                                                                                                    </c:choose>

														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /span -->


                                                                                                                
                                                                                                           
                                                                                                        <div class="col-xs-12 col-sm-6 widget-container-span">
                                                                                                                    <h3 class="row-fluid header smaller lighter purple"> Sub Property </h3>
										<div class="widget-box collapsed">

											<div class="widget-header header-color-blue">
												<h5 class="bigger lighter">
													
												</h5>
                                                                                            
                                                                                            <div class="widget-toolbar">


												<a href="#" data-action="collapse">
														<i class="icon-chevron-down"></i>
													</a>
                                                                                            </div>

											</div>

											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover">
														

														<tbody>
                                                                                                                    <c:choose>
                                                                                                                     <c:when test="${not empty subproperty}">
                                                                                                                    <c:forEach items="${subproperty}" var="sub">
															<tr>
																<td class=""><c:out value="${sub.getIRI().getFragment()}"/></td>

																

																<td>
																	<a href="ViewData?name=${sub.getIRI().getFragment()}"><button class="btn btn-xs btn-info">
																	<i class="icon-zoom-in bigger-120"></i>
                                                                                                                                </button></a>
																</td>
															</tr>
                                                                                                                    </c:forEach>
                                                                                                                     </c:when>
                                                                                                                        <c:otherwise>
                                                                                                                            <td>
																	<span>No data found.</span>
																</td>
                                                                                                                    </c:otherwise>
                                                                                                                </c:choose>

														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /span -->
                                                                   </div>
                                                                                                        
                                                                                                         <div class="space-12"></div>
                                                                                                        <div class="row">
                                                                                                            
                                                                                                                
                                                                                                                
                                                                                                                <div class="col-xs-12 col-sm-6 widget-container-span">
                                                                                                                    <h3 class="row-fluid header smaller lighter purple"> Disjoint Property </h3>
										<div class="widget-box collapsed">

											<div class="widget-header header-color-blue">
												<h5 class="bigger lighter">
													
													<button class="btn btn-success" onclick="add_disjoint(this);" value="<c:out value="${dataname}"/>">Add</button>
												</h5>
                                                                                            
                                                                                            <div class="widget-toolbar">


												<a href="#" data-action="collapse">
														<i class="icon-chevron-down"></i>
													</a>
                                                                                            </div>

											</div>

											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover">
														

														<tbody>
                                                                                                                    <c:choose>
                                                                                                                     <c:when test="${not empty disjointproperty}">
                                                                                                                    <c:forEach items="${disjointproperty}" var="disjoint">
															<tr>
																<td class=""><c:out value="${disjoint.getIRI().getFragment()}"/></td>

																

																<td>
																	<a href="ViewData?name=${disjoint.getIRI().getFragment()}"><button class="btn btn-xs btn-info">
																	<i class="icon-zoom-in bigger-120"></i>
                                                                                                                                </button></a>
                                                                                                                                        <a href="EditDisjointData?name=<c:out value="${dataname}"/>&disjoint=<c:out value="${disjoint.getIRI().getFragment()}"/>" onclick="return confirm('Are you sure you want to cancel the disjoint relationship?');"><button class="btn btn-xs btn-danger">
																	<i class="icon-remove bigger-120"></i>
                                                                                                                                </button></a>
																</td>
															</tr>
                                                                                                                    </c:forEach>
                                                                                                                     </c:when>
                                                                                                                        <c:otherwise>
                                                                                                                            <td>
																	<span>No data found.</span>
																</td>
                                                                                                                    </c:otherwise>
                                                                                                                </c:choose>
                                                                                                                            
                                                                                                                            

														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /span -->


                                                                                                                
                                                                                                           
                                                                                                        <div class="col-xs-12 col-sm-6 widget-container-span">
                                                                                                                    <h3 class="row-fluid header smaller lighter purple"> Equivalent Property </h3>
										<div class="widget-box collapsed">

											<div class="widget-header header-color-blue">
												<h5 class="bigger lighter">
													
													<button class="btn btn-success" onclick="add_equivalent(this);" value="<c:out value="${dataname}"/>">Add</button>
												</h5>
                                                                                            
                                                                                            <div class="widget-toolbar">


												<a href="#" data-action="collapse">
														<i class="icon-chevron-down"></i>
													</a>
                                                                                            </div>

											</div>

											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover">
														

														<tbody>
                                                                                                                    <c:choose>
                                                                                                                     <c:when test="${not empty equivalentproperty}">
                                                                                                                    <c:forEach items="${equivalentproperty}" var="equivalent">
															<tr>
																<td class=""><c:out value="${equivalent.getIRI().getFragment()}"/></td>

																

																<td>
																	<a href="ViewData?name=${equivalent.getIRI().getFragment()}"><button class="btn btn-xs btn-info">
																	<i class="icon-zoom-in bigger-120"></i>
                                                                                                                                </button></a>
                                                                                                                                        <a href="EditEquivalentData?name=<c:out value="${dataname}"/>&equivalent=<c:out value="${equivalent.getIRI().getFragment()}"/>" onclick="return confirm('Are you sure you want to cancel the equivalent relationship?');"><button class="btn btn-xs btn-danger">
																	<i class="icon-remove bigger-120"></i>
                                                                                                                                </button></a>
																</td>
															</tr>
                                                                                                                    </c:forEach>
                                                                                                                     </c:when>
                                                                                                                        <c:otherwise>
                                                                                                                            <td>
																	<span>No data found.</span>
																</td>
                                                                                                                    </c:otherwise>
                                                                                                                </c:choose>

														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /span -->
                                                                   </div>
                                                                                                
                                                                                                <div class="space-12"></div>
                                                                                                        <div class="row">
                                                                                                            
                                                                                                                
                                                                                                                
                                                                                                                <div class="col-xs-12 col-sm-6 widget-container-span">
                                                                                                                    <h3 class="row-fluid header smaller lighter purple"> Domain </h3>
										<div class="widget-box collapsed">

											<div class="widget-header header-color-blue">
												<h5 class="bigger lighter">
													
													<button class="btn btn-success" onclick="add_domain(this);" value="<c:out value="${dataname}"/>">Add</button>
												</h5>
                                                                                            
                                                                                            <div class="widget-toolbar">


												<a href="#" data-action="collapse">
														<i class="icon-chevron-down"></i>
													</a>
                                                                                            </div>

											</div>

											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover">
														

														<tbody>
                                                                                                                    <c:choose>
                                                                                                                     <c:when test="${not empty domain}">
                                                                                                                    <c:forEach items="${domain}" var="dom">
															<tr>
																<td class=""><c:out value="${dom.getIRI().getFragment()}"/></td>

																

																<td>
																	<a href="ViewData?name=${dom.getIRI().getFragment()}"><button class="btn btn-xs btn-info">
																	<i class="icon-zoom-in bigger-120"></i>
                                                                                                                                </button></a>
                                                                                                                                        <a href="EditDomainData?name=<c:out value="${dataname}"/>&domain=<c:out value="${dom.getIRI().getFragment()}"/>" onclick="return confirm('Are you sure you want to cancel the domain relationship?');"><button class="btn btn-xs btn-danger">
																	<i class="icon-remove bigger-120"></i>
                                                                                                                                </button></a>
																</td>
															</tr>
                                                                                                                    </c:forEach>
                                                                                                                     </c:when>
                                                                                                                        <c:otherwise>
                                                                                                                            <td>
																	<span>No data found.</span>
																</td>
                                                                                                                    </c:otherwise>
                                                                                                                </c:choose>
                                                                                                                            
                                                                                                                            

														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /span -->


                                                                                                                
                                                                                                           
                                                                                                        <div class="col-xs-12 col-sm-6 widget-container-span">
                                                                                                                    <h3 class="row-fluid header smaller lighter purple"> Range </h3>
										<div class="widget-box collapsed">

											<div class="widget-header header-color-blue">
												<h5 class="bigger lighter">
													
													<button class="btn btn-success" onclick="add_range(this);" value="<c:out value="${dataname}"/>">Add</button>
												</h5>
                                                                                            
                                                                                            <div class="widget-toolbar">


												<a href="#" data-action="collapse">
														<i class="icon-chevron-down"></i>
													</a>
                                                                                            </div>

											</div>

											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover">
														

														<tbody>
                                                                                                                    <c:choose>
                                                                                                                     <c:when test="${not empty range}">
                                                                                                                    <c:forEach items="${range}" var="ran">
															<tr>
																<td class=""><c:out value="${ran.getIRI().getFragment()}"/></td>

																

																<td>
																	
                                                                                                                                        <a href="EditRangeData?name=<c:out value="${dataname}"/>&range=<c:out value="${ran.getIRI().getFragment()}"/>" onclick="return confirm('Are you sure you want to cancel the range relationship?');"><button class="btn btn-xs btn-danger">
																	<i class="icon-remove bigger-120"></i>
                                                                                                                                </button></a>
																</td>
															</tr>
                                                                                                                    </c:forEach>
                                                                                                                     </c:when>
                                                                                                                        <c:otherwise>
                                                                                                                            <td>
																	<span>No data found.</span>
																</td>
                                                                                                                    </c:otherwise>
                                                                                                                </c:choose>

														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /span -->
                                                                   </div>
                                                                                                        
                                                                    <!-- /here -->
                                                                      <div class="space-12"></div>

										
									</div><!-- /span -->
								</div><!-- /row -->
                                                                
                                                              



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

		<script src="js/chosen.jquery.min.js"></script>
                <script src="js/date-time/bootstrap-datepicker.min.js"></script>
		<script src="js/date-time/bootstrap-timepicker.min.js"></script>
		<script src="js/date-time/moment.min.js"></script>
		<script src="js/date-time/daterangepicker.min.js"></script>

		<script src="js/fuelux/fuelux.wizard.min.js"></script>
		<script src="js/jquery.validate.min.js"></script>
		<script src="js/additional-methods.min.js"></script>
		<script src="js/bootbox.min.js"></script>
		<script src="js/jquery.maskedinput.min.js"></script>
		<script src="js/select2.min.js"></script>
                <script src="js/jquery-ui-1.10.3.custom.min.js"></script>
                <script src="js/jquery.ui.touch-punch.min.js"></script>
                <script src="js/bootbox.min.js"></script>
                <script src="js/jquery-ui-1.10.3.full.min.js"></script>
                <script src="js/jquery.dataTables.min.js"></script>
                <script src="js/jquery.dataTables.bootstrap.js"></script>
                <script src="js/jquery.inputlimiter.1.3.1.min.js"></script>
		<script src="js/jquery.maskedinput.min.js"></script>
                <script src="js/dropzone.min.js"></script>
                <script src="js/jquery.colorbox-min.js"></script>
                <script src="js/bootstrap-tag.min.js"></script>
                <script src="js/jquery.autosize.min.js"></script>




		<!-- ace scripts -->

		<script src="js/ace-elements.min.js"></script>
		<script src="js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
                
                <script type="text/javascript">
			jQuery(function($) {
                            
                            var oTable1 = $('#sample-table-2').dataTable( {
				"aoColumns": [
			      { "bSortable": true },
			      null, 
				  { "bSortable": false }
				] } );
				
				
				$('table th input:checkbox').on('click' , function(){
					var that = this;
					$(this).closest('table').find('tr > td:first-child input:checkbox')
					.each(function(){
						this.checked = that.checked;
						$(this).closest('tr').toggleClass('selected');
					});
						
				});
			
			
				$('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
				function tooltip_placement(context, source) {
					var $source = $(source);
					var $parent = $source.closest('table')
					var off1 = $parent.offset();
					var w1 = $parent.width();
			
					var off2 = $source.offset();
					var w2 = $source.width();
			
					if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
					return 'left';
				}

			
				$('#simple-colorpicker-1').ace_colorpicker({pull_right:true}).on('change', function(){
					var color_class = $(this).find('option:selected').data('class');
					var new_class = 'widget-header';
					if(color_class != 'default')  new_class += ' header-color-'+color_class;
					$(this).closest('.widget-header').attr('class', new_class);
				});
			
			
				// scrollables
				$('.slim-scroll').each(function () {
					var $this = $(this);
					$this.slimScroll({
						height: $this.data('height') || 100,
						railVisible:true
					});
				});
			
				/**$('.widget-box').on('ace.widget.settings' , function(e) {
					e.preventDefault();
				});*/
				  
				  
			
				// Portlets (boxes)
			    $('.widget-container-span').sortable({
			        connectWith: '.widget-container-span',
					items:'> .widget-box',
					opacity:0.8,
					revert:true,
					forceHelperSize:true,
					placeholder: 'widget-placeholder',
					forcePlaceholderSize:true,
					tolerance:'pointer'
			    });
                            
                            
                        
				
				
			
			});
                        
                        function edit_super(att) {
	bootbox_confirm1("<form class='form-horizontal' id='infos' action='ChangeSuperData?dataName="+att.value +"' method='post'>\
			<div><label for='form-field-11'>Available Data Properties</label><br/><select name='newsupername' class='width-80' id='chngsuper'><option value=''></option><c:forEach items="${ontdata}" var="ont"><c:if test="${ont.getIRI().getFragment() ne dataname}"><option <c:forEach items="${superproperty}" var="super"> <c:if test="${ont.getIRI().getFragment() == super.getIRI().getFragment()}"> selected='selected' </c:if> </c:forEach> value='<c:out value="${ont.getIRI()}"/>'><c:out value="${ont.getIRI().getFragment()}"/></option></c:if></c:forEach></select></div>\
		     \
		    </form>", 'Proceed', 'Cancel').modal('show');
}

function bootbox_confirm1(msg, callback_success, callback_cancel) {
    var d = bootbox.confirm({message:msg, title:"Select New Super Data Property", show:false, callback:function(result) {
        if (result){
            
            if($('#chngsuper').val() != ""){
        	
          	$('#infos').submit();
            }else{
                alert("Please select an data property.");
            }
        	   
          
          }
        else if(typeof(callback_cancel) == 'function')
            callback_cancel();
    }});

    d.bind('shown.bs.modal', function(){
        d.find("select").chosen();
    });
    return d;
}

function add_disjoint(att) {
	bootbox_confirm2("<form class='form-horizontal' id='infos1' action='EditDisjointData?dataName="+att.value +"' method='post'>\
			<div><label for='form-field-11'>Available Data Properties</label><br/><select name='newdisjointname' class='width-80' id='add_disjoint'><option value=''></option><c:forEach items="${ontdata}" var="ont"><c:if test="${ont.getIRI().getFragment() ne dataname}"><option <c:forEach items="${disjointproperty}" var="disjoint"> <c:if test="${ont.getIRI().getFragment() == disjoint.getIRI().getFragment()}"> disabled='disabled' </c:if> </c:forEach> value='<c:out value="${ont.getIRI()}"/>'><c:out value="${ont.getIRI().getFragment()}"/></option></c:if></c:forEach></select></div>\
		     \
		    </form>", 'Proceed', 'Cancel').modal('show');
}

function bootbox_confirm2(msg, callback_success, callback_cancel) {
    var d = bootbox.confirm({message:msg, title:"Add new disjoint Data Property", show:false, callback:function(result) {
        if (result){
            
            if($('#add_disjoint').val() != ""){
        	
          	$('#infos1').submit();
            }else{
                alert("Please select an data property.");
            }
        	   
          
          }
        else if(typeof(callback_cancel) == 'function')
            callback_cancel();
    }});

    d.bind('shown.bs.modal', function(){
        d.find("select").chosen();
    });
    return d;
}

function add_equivalent(att) {
	bootbox_confirm3("<form class='form-horizontal' id='infos2' action='EditEquivalentData?dataName="+att.value +"' method='post'>\
			<div><label for='form-field-11'>Available Data Properties</label><br/><select name='newequivalentname' class='width-80' id='add_equivalent'><option value=''></option><c:forEach items="${ontdata}" var="ont"><c:if test="${ont.getIRI().getFragment() ne dataname}"><option <c:forEach items="${equivalentproperty}" var="equivalent"> <c:if test="${ont.getIRI().getFragment() == equivalent.getIRI().getFragment()}"> disabled='disabled' </c:if> </c:forEach> value='<c:out value="${ont.getIRI()}"/>'><c:out value="${ont.getIRI().getFragment()}"/></option></c:if></c:forEach></select></div>\
		     \
		    </form>", 'Proceed', 'Cancel').modal('show');
}

function bootbox_confirm3(msg, callback_success, callback_cancel) {
    var d = bootbox.confirm({message:msg, title:"Add new equivalent Data Property", show:false, callback:function(result) {
        if (result){
            
            if($('#add_equivalent').val() != ""){
        	
          	$('#infos2').submit();
            }else{
                alert("Please select an data property.");
            }
        	   
          
          }
        else if(typeof(callback_cancel) == 'function')
            callback_cancel();
    }});

    d.bind('shown.bs.modal', function(){
        d.find("select").chosen();
    });
    return d;
}

function edit_char(att) {
	bootbox_confirm4("<form class='form-horizontal' id='infos3' action='EditDataCharacter?dataName="+att.value +"' method='post'>\
			<div><label for='form-field-11'>Characteristics:</label><br/><div class='checkbox'><label><input name='fun' value='1' <c:if test='${isFun}'> checked='checked' </c:if> type='checkbox' class='ace' /><span class='lbl'> Functional</span></label></div></div>\
		     \
		    </form>", 'Proceed', 'Cancel').modal('show');
}

function bootbox_confirm4(msg, callback_success, callback_cancel) {
    var d = bootbox.confirm({message:msg, title:"Edit Data Property Characteristics", show:false, callback:function(result) {
        if (result){
            
            
        	
          	$('#infos3').submit();
            
        	   
          
          }
        else if(typeof(callback_cancel) == 'function')
            callback_cancel();
    }});

    d.bind('shown.bs.modal', function(){
        d.find("select").chosen();
    });
    return d;
}

function add_domain(att) {
	bootbox_confirm5("<form class='form-horizontal' id='infos4' action='EditDomainData?dataName="+att.value +"' method='post'>\
			<div><label for='form-field-11'>Available Classes</label><br/><select name='newdomainname' class='width-80' id='add_domain'><option value=''></option><c:forEach items="${ontclasses}" var="ont"><option <c:forEach items="${domain}" var="dom"> <c:if test="${ont.getIRI().getFragment() == dom.getIRI().getFragment()}"> disabled='disabled' </c:if> </c:forEach> value='<c:out value="${ont.getIRI()}"/>'><c:out value="${ont.getIRI().getFragment()}"/></option></c:forEach></select></div>\
		     \
		    </form>", 'Proceed', 'Cancel').modal('show');
}

function bootbox_confirm5(msg, callback_success, callback_cancel) {
    var d = bootbox.confirm({message:msg, title:"Add new domain", show:false, callback:function(result) {
        if (result){
            
            if($('#add_domain').val() != ""){
        	
          	$('#infos4').submit();
            }else{
                alert("Please select a domain class.");
            }
        	   
          
          }
        else if(typeof(callback_cancel) == 'function')
            callback_cancel();
    }});

    d.bind('shown.bs.modal', function(){
        d.find("select").chosen();
    });
    return d;
}

function add_range(att) {
	bootbox_confirm6("<form class='form-horizontal' id='infos5' action='EditRangeData?dataName="+att.value +"' method='post'>\
			<div><label for='form-field-11'>Available Data Types</label><br/><select name='newrangename' class='width-80' id='add_range'><option value=''></option><c:forEach items="${type}" var="typ"><option <c:forEach items="${range}" var="ran"> <c:if test="${ran.getIRI().getFragment() == typ.getIRI().getFragment()}"> disabled='disabled' </c:if> </c:forEach> value='<c:out value="${typ.getIRI()}"/>'><c:out value="${typ.getIRI().getFragment()}"/></option></c:forEach></select></div>\
		     \
		    </form>", 'Proceed', 'Cancel').modal('show');
}

function bootbox_confirm6(msg, callback_success, callback_cancel) {
    var d = bootbox.confirm({message:msg, title:"Add new range", show:false, callback:function(result) {
        if (result){
            
            if($('#add_range').val() != ""){
        	
          	$('#infos5').submit();
            }else{
                alert("Please select a range class.");
            }
        	   
          
          }
        else if(typeof(callback_cancel) == 'function')
            callback_cancel();
    }});

    d.bind('shown.bs.modal', function(){
        d.find("select").chosen();
    });
    return d;
}
		</script>

	</body>
</html>

