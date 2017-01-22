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
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="javax.servlet.http.Cookie" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>Manage Object Property - CoMOnTool</title>

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
                                                <li class="active">
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
                                                        <li>
								Manage Object Property
							</li>
                                                </ul><!-- .breadcrumb -->
                                        </div>

					<div class="page-content">
                                            <div class="page-header">
							<h1>
								Compliance Management
								<small>
									<i class="icon-double-angle-right"></i>
									Ontology Object Properties
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
                                                
                                                <c:if test="${not empty msg2}">
                                                <div class="alert alert-block alert-danger">
											<button type="button" class="close" data-dismiss="alert">
												<i class="icon-remove"></i>
											</button>

											<p>
												<strong>
													<i class="icon-ok"></i>
													Error!
												</strong>
												${msg2}
											</p>

										</div>
                                                                                        </c:if>
                                                                                        
                                                                                                                              

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
                                                                
                                                                <h4 class="pink">
									<i class="icon-plus-sign green"></i>
									<a href="#modal-form" role="button" class="blue" data-toggle="modal"> Add Object Property </a>
								</h4>

                                                                
                                                                <div class="row">
									<div class="col-xs-12">
										<div class="table-responsive">
											<table id="sample-table-2" class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th class="center">
															<label>
																
																<span class="lbl">#</span>
															</label>
														</th>
														<th>Object Property Name</th>
														<th>Object Property IRI</th>
														
														<th></th>
													</tr>
												</thead>

												<tbody>
                                                                                                    <c:set var="count" value="1" scope="page" />
                                                                                                     <c:forEach items="${ontology}" var="ont">
													
													<tr>
														<td class="center">
															
																<c:out value="${count}"/>
															
														</td>

														<td>
															<c:out value="${ont.getIRI().getFragment()}"/>
														</td>
														<td><c:out value="${ont.getIRI()}"/></td>
														

														<td>
															<div class="visible-md visible-lg hidden-sm hidden-xs btn-group">
																

                                                                                                                            <a href="ViewObject?name=${ont.getIRI().getFragment()}"><button class="btn btn-xs btn-info">
																	<i class="icon-zoom-in bigger-120"></i>
                                                                                                                                </button></a>

                                                                                                                            <a href="DeleteOWLObject?name=${ont.getIRI().getFragment()}" onclick="return confirm('Are you sure you want to delete <c:out value="${ont.getIRI().getFragment()}"/> property? All subproperties of this property will be parentless.');"><button class="btn btn-xs btn-danger">
																	<i class="icon-trash bigger-120"></i>
                                                                                                                                </button></a>
															</div>

															<div class="visible-xs visible-sm hidden-md hidden-lg">
																<div class="inline position-relative">
																	<button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown">
																		<i class="icon-cog icon-only bigger-110"></i>
																	</button>

																	<ul class="dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close">
																		

																		<li>
																			<a href="ViewObject?name=${ont.getIRI().getFragment()}" class="tooltip-success" data-rel="tooltip" title="View">
																				<span class="green">
																					<i class="icon-zoom-in bigger-120"></i>
																				</span>
																			</a>
																		</li>

																		<li>
																			<a href="DeleteOWLObject?name=${ont.getIRI().getFragment()}" onclick="return confirm('Are you sure you want to delete <c:out value="${ont.getIRI().getFragment()}"/> property? All subproperties of this property will be parentless.');" class="tooltip-error" data-rel="tooltip" title="Delete">
																				<span class="red">
																					<i class="icon-trash bigger-120"></i>
																				</span>
																			</a>
																		</li>
																	</ul>
																</div>
															</div>
														</td>
													</tr>
                                                                                                        <c:set var="count" value="${count + 1}" scope="page"/>
                                                                                                         </c:forEach>
												</tbody>
											</table>
										</div><!-- /.table-responsive -->
									</div><!-- /span -->
								</div><!-- /row -->


								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
                                                
                                                <div id="modal-form" class="modal" tabindex="-1">
									<div class="modal-dialog">
                                                                            <form class="form-horizontal" role="form" id="form_submit" method="post" action="MainOWLObject">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="blue bigger">Please fill the following form fields</h4>
											</div>

											<div class="modal-body overflow-visible">
												<div class="row">
                                                                                                    <div class="col-xs-12">
								

                                                                                                        
									<div class="form-group">
										<label class="col-sm-4 control-label no-padding-right" for="form-field-1"> Object Property Name </label>

										<div class="col-sm-8">
											<input type="text" id="objectName" name="objectName" class="col-xs-10 col-sm-10" />
										</div>
									</div>
                                                                    <div class="space-4"></div>
                                                                    
                                                                    <div class="form-group">
										<label class="col-sm-4 control-label no-padding-right" for="form-field-1"> Comment </label>

										<div class="col-sm-8">
											<textarea class="col-xs-10 col-sm-10" id="form-field-8" name="comment"></textarea>

										</div>
									</div>
                                                                    
                                                                
                                                                                                    </div>
                                                                                           				</div>
											</div>

											<div class="modal-footer">
												<button class="btn btn-sm" data-dismiss="modal">
													<i class="icon-remove"></i>
													Cancel
												</button>

                                                                                            <button type="submit" class="btn btn-sm btn-primary">
													<i class="icon-ok"></i>
													Save
												</button>
											</div>
										</div>
                                                                                </form>
									</div>
                                                                </div>

                                                
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
                            
                            $("#objectName").keydown(function (e) {
                            if (e.keyCode == 32) { 
                             $(this).val($(this).val() + "_"); // append '-' to input
                             return false; // return false to prevent space from being added
                                }
                            });
                            
                            var oTable1 = $('#sample-table-2').dataTable( {
				"aoColumns": [
			      { "bSortable": false },
			      null, null,
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
                            
                            
                        $('#form_submit').validate({
					errorElement: 'div',
					errorClass: 'help-block',
					focusInvalid: false,
					rules: {
						
						objectName: {
							required: true
						}
					},
			
					messages: {
						email: {
							required: "Please provide a valid email.",
							email: "Please provide a valid email."
						},
						password: {
							required: "Please specify a password.",
							minlength: "Please specify a secure password."
						},
						subscription: "Please choose at least one option",
						gender: "Please choose gender",
						agree: "Please accept our policy"
					},
			
					invalidHandler: function (event, validator) { //display error alert on form submit   
						$('.alert-danger', $('.login-form')).show();
					},
			
					highlight: function (e) {
						$(e).closest('.form-group').removeClass('has-info').addClass('has-error');
					},
			
					success: function (e) {
						$(e).closest('.form-group').removeClass('has-error').addClass('has-info');
						$(e).remove();
					},
			
					errorPlacement: function (error, element) {
						if(element.is(':checkbox') || element.is(':radio')) {
							var controls = element.closest('div[class*="col-"]');
							if(controls.find(':checkbox,:radio').length > 1) controls.append(error);
							else error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));
						}
						else if(element.is('.select2')) {
							error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
						}
						else if(element.is('.chosen-select')) {
							error.insertAfter(element.siblings('[class*="chosen-container"]:eq(0)'));
						}
						else error.insertAfter(element.parent());
					},
			
					submitHandler: function (form) {
                                            form.submit();
					},
					invalidHandler: function (form) {
					}
				});

				
				
			
			});
                        
                        </script>
                        
                        
	</body>
        
</html>



