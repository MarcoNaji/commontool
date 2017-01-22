package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLException;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

public final class view_005fOWLData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<title>Manage Data Property - CoMOnTool</title>\n");
      out.write("\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("\t\t<!-- basic styles -->\n");
      out.write("\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if IE 7]>\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"css/font-awesome-ie7.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<!-- page specific plugin styles -->\n");
      out.write("\n");
      out.write("\t\t<!-- fonts -->\n");
      out.write("\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/ace-fonts.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- ace styles -->\n");
      out.write("\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/ace.min.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/ace-rtl.min.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/ace-skins.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 8]>\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"css/ace-ie.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<!-- inline styles related to this page -->\n");
      out.write("\n");
      out.write("\t\t<!-- ace settings handler -->\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/ace-extra.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"js/html5shiv.js\"></script>\n");
      out.write("\t\t<script src=\"js/respond.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"navbar navbar-default\" id=\"navbar\">\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\ttry{ace.settings.check('navbar' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"navbar-container\" id=\"navbar-container\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header pull-left\">\n");
      out.write("\t\t\t\t\t<a href=\"HomeServlet\" class=\"navbar-brand\">\n");
      out.write("\t\t\t\t\t\t<small>\n");
      out.write("\t\t\t\t\t\t    <span class=\"white\">CoMOn</span>\n");
      out.write("\t\t\t\t\t\t    <span class=\"white\">Tool</span>\n");
      out.write("\t\t\t\t\t\t</small>\n");
      out.write("\t\t\t\t\t</a><!-- /.brand -->\n");
      out.write("\t\t\t\t</div><!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"navbar-header pull-right\" role=\"navigation\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav ace-nav\">\n");
      out.write("\t\t\t\t\t<li class=\"light-blue\">\n");
      out.write("\t\t\t\t\t\t\t<a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"user-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<small>Welcome,</small>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-caret-down\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"LoginServlet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-off\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\tLogout\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul><!-- /.ace-nav -->\n");
      out.write("\t\t\t\t</div><!-- /.navbar-header -->\n");
      out.write("\t\t\t</div><!-- /.container -->\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"main-container\" id=\"main-container\">\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\ttry{ace.settings.check('main-container' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"main-container-inner\">\n");
      out.write("\t\t\t\t<a class=\"menu-toggler\" id=\"menu-toggler\" href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"menu-text\"></span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"sidebar\" id=\"sidebar\">\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\ttry{ace.settings.check('sidebar' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-shortcuts\" id=\"sidebar-shortcuts\">\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar-shortcuts-large\" id=\"sidebar-shortcuts-large\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-globe\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar-shortcuts-mini\" id=\"sidebar-shortcuts-mini\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-globe\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- #sidebar-shortcuts -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-list\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"HomeServlet\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-dashboard\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"menu-text\"> Dashboard </span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"MainOWLClass\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-circle\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"menu-text\"> Class </span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                <li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"MainOWLObject\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-certificate\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"menu-text\"> Object Property </span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                <li class=\"active\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"MainOWLData\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-asterisk\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"menu-text\"> Data Property </span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                <li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"MainOWLIndividual\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-list\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"menu-text\"> Individual </span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                        </ul><!-- /.nav-list -->\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t\t\t<div class=\"breadcrumbs\" id=\"breadcrumbs\">\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\ttry{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<ul class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-home home-icon\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"HomeServlet\">Home</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                                        <li>\n");
      out.write("\t\t\t\t\t\t\t\tManage Data Property\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                                </ul><!-- .breadcrumb -->\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"page-content\">\n");
      out.write("                                            <div class=\"page-header\">\n");
      out.write("\t\t\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t\t\tCompliance Management\n");
      out.write("\t\t\t\t\t\t\t\t<small>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-double-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\tOntology Data Properties\n");
      out.write("\t\t\t\t\t\t\t\t</small>\n");
      out.write("\t\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t\t</div><!-- /.page-header -->\n");
      out.write("                                                \n");
      out.write("                                                     \n");
      out.write("                                                 ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                \n");
      out.write("                                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                                                        \n");
      out.write("                                                                                                                              \n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- PAGE CONTENT BEGINS -->\n");
      out.write("                                                                \n");
      out.write("                                                                <h4 class=\"pink\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-plus-sign green\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#modal-form\" role=\"button\" class=\"blue\" data-toggle=\"modal\"> Add Data Property </a>\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"table-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table id=\"sample-table-2\" class=\"table table-striped table-bordered table-hover\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"lbl\">#</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Data Property Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Data Property IRI</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th></th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("                                                                                                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                                                                     ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- /.table-responsive -->\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><!-- /span -->\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!-- PAGE CONTENT ENDS -->\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /.col -->\n");
      out.write("\t\t\t\t\t\t</div><!-- /.row -->\n");
      out.write("                                                \n");
      out.write("                                                <div id=\"modal-form\" class=\"modal\" tabindex=\"-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\">\n");
      out.write("                                                                            <form class=\"form-horizontal\" role=\"form\" id=\"form_submit\" method=\"post\" action=\"MainOWLData\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"blue bigger\">Please fill the following form fields</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-body overflow-visible\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                                                                    <div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("                                                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-4 control-label no-padding-right\" for=\"form-field-1\"> Data Property Name </label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"dataName\" name=\"dataName\" class=\"col-xs-10 col-sm-10\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                    <div class=\"space-4\"></div>\n");
      out.write("                                                                    \n");
      out.write("                                                                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-4 control-label no-padding-right\" for=\"form-field-1\"> Comment </label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<textarea class=\"col-xs-10 col-sm-10\" id=\"form-field-8\" name=\"comment\"></textarea>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                    \n");
      out.write("                                                                \n");
      out.write("                                                                                                    </div>\n");
      out.write("                                                                                           \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-sm\" data-dismiss=\"modal\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-remove\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tCancel\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\n");
      out.write("                                                                                            <button type=\"submit\" class=\"btn btn-sm btn-primary\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-ok\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tSave\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                </form>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                </div>\n");
      out.write("\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</div><!-- /.page-content -->\n");
      out.write("\t\t\t\t</div><!-- /.main-content -->\n");
      out.write("                        </div><!-- /.main-container-inner -->\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"#\" id=\"btn-scroll-up\" class=\"btn-scroll-up btn btn-sm btn-inverse\">\n");
      out.write("\t\t\t\t<i class=\"icon-double-angle-up icon-only bigger-110\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div><!-- /.main-container -->\n");
      out.write("\n");
      out.write("\t\t<!-- basic scripts -->\n");
      out.write("\n");
      out.write("\t\t<!--[if !IE]> -->\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\twindow.jQuery || document.write(\"<script src='js/jquery-2.0.3.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t\t<!-- <![endif]-->\n");
      out.write("\n");
      out.write("\t\t<!--[if IE]>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write(" window.jQuery || document.write(\"<script src='js/jquery-1.10.2.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("</script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tif(\"ontouchend\" in document) document.write(\"<script src='js/jquery.mobile.custom.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/typeahead-bs2.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- page specific plugin scripts -->\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/chosen.jquery.min.js\"></script>\n");
      out.write("                <script src=\"js/date-time/bootstrap-datepicker.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/date-time/bootstrap-timepicker.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/date-time/moment.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/date-time/daterangepicker.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/fuelux/fuelux.wizard.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.validate.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/additional-methods.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/bootbox.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.maskedinput.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/select2.min.js\"></script>\n");
      out.write("                <script src=\"js/jquery-ui-1.10.3.custom.min.js\"></script>\n");
      out.write("                <script src=\"js/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("                <script src=\"js/bootbox.min.js\"></script>\n");
      out.write("                <script src=\"js/jquery-ui-1.10.3.full.min.js\"></script>\n");
      out.write("                <script src=\"js/jquery.dataTables.min.js\"></script>\n");
      out.write("                <script src=\"js/jquery.dataTables.bootstrap.js\"></script>\n");
      out.write("                <script src=\"js/jquery.inputlimiter.1.3.1.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.maskedinput.min.js\"></script>\n");
      out.write("                <script src=\"js/dropzone.min.js\"></script>\n");
      out.write("                <script src=\"js/jquery.colorbox-min.js\"></script>\n");
      out.write("                <script src=\"js/bootstrap-tag.min.js\"></script>\n");
      out.write("                <script src=\"js/jquery.autosize.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- ace scripts -->\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/ace-elements.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/ace.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- inline scripts related to this page -->\n");
      out.write("                \n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(function($) {\n");
      out.write("                            \n");
      out.write("                            $(\"#dataName\").keydown(function (e) {\n");
      out.write("                            if (e.keyCode == 32) { \n");
      out.write("                             $(this).val($(this).val() + \"_\"); // append '-' to input\n");
      out.write("                             return false; // return false to prevent space from being added\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                            \n");
      out.write("                            var oTable1 = $('#sample-table-2').dataTable( {\n");
      out.write("\t\t\t\t\"aoColumns\": [\n");
      out.write("\t\t\t      { \"bSortable\": false },\n");
      out.write("\t\t\t      null, null,\n");
      out.write("\t\t\t\t  { \"bSortable\": false }\n");
      out.write("\t\t\t\t] } );\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('table th input:checkbox').on('click' , function(){\n");
      out.write("\t\t\t\t\tvar that = this;\n");
      out.write("\t\t\t\t\t$(this).closest('table').find('tr > td:first-child input:checkbox')\n");
      out.write("\t\t\t\t\t.each(function(){\n");
      out.write("\t\t\t\t\t\tthis.checked = that.checked;\n");
      out.write("\t\t\t\t\t\t$(this).closest('tr').toggleClass('selected');\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('[data-rel=\"tooltip\"]').tooltip({placement: tooltip_placement});\n");
      out.write("\t\t\t\tfunction tooltip_placement(context, source) {\n");
      out.write("\t\t\t\t\tvar $source = $(source);\n");
      out.write("\t\t\t\t\tvar $parent = $source.closest('table')\n");
      out.write("\t\t\t\t\tvar off1 = $parent.offset();\n");
      out.write("\t\t\t\t\tvar w1 = $parent.width();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tvar off2 = $source.offset();\n");
      out.write("\t\t\t\t\tvar w2 = $source.width();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tif( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';\n");
      out.write("\t\t\t\t\treturn 'left';\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('#simple-colorpicker-1').ace_colorpicker({pull_right:true}).on('change', function(){\n");
      out.write("\t\t\t\t\tvar color_class = $(this).find('option:selected').data('class');\n");
      out.write("\t\t\t\t\tvar new_class = 'widget-header';\n");
      out.write("\t\t\t\t\tif(color_class != 'default')  new_class += ' header-color-'+color_class;\n");
      out.write("\t\t\t\t\t$(this).closest('.widget-header').attr('class', new_class);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t// scrollables\n");
      out.write("\t\t\t\t$('.slim-scroll').each(function () {\n");
      out.write("\t\t\t\t\tvar $this = $(this);\n");
      out.write("\t\t\t\t\t$this.slimScroll({\n");
      out.write("\t\t\t\t\t\theight: $this.data('height') || 100,\n");
      out.write("\t\t\t\t\t\trailVisible:true\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t/**$('.widget-box').on('ace.widget.settings' , function(e) {\n");
      out.write("\t\t\t\t\te.preventDefault();\n");
      out.write("\t\t\t\t});*/\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t// Portlets (boxes)\n");
      out.write("\t\t\t    $('.widget-container-span').sortable({\n");
      out.write("\t\t\t        connectWith: '.widget-container-span',\n");
      out.write("\t\t\t\t\titems:'> .widget-box',\n");
      out.write("\t\t\t\t\topacity:0.8,\n");
      out.write("\t\t\t\t\trevert:true,\n");
      out.write("\t\t\t\t\tforceHelperSize:true,\n");
      out.write("\t\t\t\t\tplaceholder: 'widget-placeholder',\n");
      out.write("\t\t\t\t\tforcePlaceholderSize:true,\n");
      out.write("\t\t\t\t\ttolerance:'pointer'\n");
      out.write("\t\t\t    });\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        $('#form_submit').validate({\n");
      out.write("\t\t\t\t\terrorElement: 'div',\n");
      out.write("\t\t\t\t\terrorClass: 'help-block',\n");
      out.write("\t\t\t\t\tfocusInvalid: false,\n");
      out.write("\t\t\t\t\trules: {\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tdataName: {\n");
      out.write("\t\t\t\t\t\t\trequired: true\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tmessages: {\n");
      out.write("\t\t\t\t\t\temail: {\n");
      out.write("\t\t\t\t\t\t\trequired: \"Please provide a valid email.\",\n");
      out.write("\t\t\t\t\t\t\temail: \"Please provide a valid email.\"\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tpassword: {\n");
      out.write("\t\t\t\t\t\t\trequired: \"Please specify a password.\",\n");
      out.write("\t\t\t\t\t\t\tminlength: \"Please specify a secure password.\"\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tsubscription: \"Please choose at least one option\",\n");
      out.write("\t\t\t\t\t\tgender: \"Please choose gender\",\n");
      out.write("\t\t\t\t\t\tagree: \"Please accept our policy\"\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tinvalidHandler: function (event, validator) { //display error alert on form submit   \n");
      out.write("\t\t\t\t\t\t$('.alert-danger', $('.login-form')).show();\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\thighlight: function (e) {\n");
      out.write("\t\t\t\t\t\t$(e).closest('.form-group').removeClass('has-info').addClass('has-error');\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tsuccess: function (e) {\n");
      out.write("\t\t\t\t\t\t$(e).closest('.form-group').removeClass('has-error').addClass('has-info');\n");
      out.write("\t\t\t\t\t\t$(e).remove();\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\terrorPlacement: function (error, element) {\n");
      out.write("\t\t\t\t\t\tif(element.is(':checkbox') || element.is(':radio')) {\n");
      out.write("\t\t\t\t\t\t\tvar controls = element.closest('div[class*=\"col-\"]');\n");
      out.write("\t\t\t\t\t\t\tif(controls.find(':checkbox,:radio').length > 1) controls.append(error);\n");
      out.write("\t\t\t\t\t\t\telse error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\telse if(element.is('.select2')) {\n");
      out.write("\t\t\t\t\t\t\terror.insertAfter(element.siblings('[class*=\"select2-container\"]:eq(0)'));\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\telse if(element.is('.chosen-select')) {\n");
      out.write("\t\t\t\t\t\t\terror.insertAfter(element.siblings('[class*=\"chosen-container\"]:eq(0)'));\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\telse error.insertAfter(element.parent());\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tsubmitHandler: function (form) {\n");
      out.write("                                            form.submit();\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tinvalidHandler: function (form) {\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("                        \n");
      out.write("                        </script>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\t</body>\n");
      out.write("        \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty msg}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"alert alert-block alert-success\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-remove\"></i>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<p>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-ok\"></i>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tOk!\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</strong>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("                                                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty msg2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"alert alert-block alert-danger\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-remove\"></i>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<p>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-ok\"></i>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tError!\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</strong>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("                                                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("count");
    _jspx_th_c_set_0.setValue(new String("1"));
    _jspx_th_c_set_0.setScope("page");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ontology}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("ont");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"center\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"visible-md visible-lg hidden-sm hidden-xs btn-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\n");
          out.write("                                                                                                                            <a href=\"ViewData?name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ont.getIRI().getFragment()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button class=\"btn btn-xs btn-info\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-zoom-in bigger-120\"></i>\n");
          out.write("                                                                                                                                </button></a>\n");
          out.write("\n");
          out.write("                                                                                                                            <a href=\"DeleteOWLData?name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ont.getIRI().getFragment()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"return confirm('Are you sure you want to delete ");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" property? All subproperties of this property will be parentless.');\"><button class=\"btn btn-xs btn-danger\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-trash bigger-120\"></i>\n");
          out.write("                                                                                                                                </button></a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"visible-xs visible-sm hidden-md hidden-lg\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inline position-relative\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-minier btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-cog icon-only bigger-110\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"ViewData?name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ont.getIRI().getFragment()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"View\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"green\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-zoom-in bigger-120\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"DeleteOWLData?name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ont.getIRI().getFragment()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"return confirm('Are you sure you want to delete ");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" property? All subproperties of this property will be parentless.');\" class=\"tooltip-error\" data-rel=\"tooltip\" title=\"Delete\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"red\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-trash bigger-120\"></i>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
          out.write("                                                                                                        ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                                                                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ont.getIRI().getFragment()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ont.getIRI()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ont.getIRI().getFragment()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ont.getIRI().getFragment()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("count");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count + 1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setScope("page");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
