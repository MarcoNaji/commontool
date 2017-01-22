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
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.AxiomType;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<title>Home - CoMOnTool</title>\n");
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
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                    <span class=\"white\">CoMOn</span>\n");
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
      out.write("\t\t\t\t\t\t<li class=\"active\">\n");
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
      out.write("                                                <li>\n");
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
      out.write("                                                </ul><!-- .breadcrumb -->\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"page-content\">\n");
      out.write("                                            <div class=\"page-header\">\n");
      out.write("\t\t\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t\t\tCompliance Management\n");
      out.write("\t\t\t\t\t\t\t\t<small>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-double-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\tOntology Overview\n");
      out.write("\t\t\t\t\t\t\t\t</small>\n");
      out.write("\t\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t\t</div><!-- /.page-header -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- PAGE CONTENT BEGINS -->\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"row\"> \n");
      out.write("                                                               <div class=\"col-xs-12 col-sm-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-user-info profile-user-info-striped\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-name\"> Ontology ID </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-value\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-name\"> Axiom</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-value\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                                            <span>");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-name\"> Logical Axiom </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-value\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-name\">Declare Axiom</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-value\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                                        <div class=\"profile-info-row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-name\">DL Expressivity</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info-value\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t     </div>\n");
      out.write("                                                                   </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                                                                        \n");
      out.write("                                                                <div class=\"space-24\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"header smaller red\"></h3>\n");
      out.write("\n");
      out.write("                                                                                                        \n");
      out.write("                                                                                <div class=\"row\">                                                       \n");
      out.write("                                                                                <div class=\"col-xs-6 col-sm-3 pricing-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-header header-color-green\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5 class=\"bigger lighter\">Class Count</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_out_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"MainOWLClass\" class=\"btn btn-block btn-success\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-circle bigger-110\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>View</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-3 pricing-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-header header-color-blue\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5 class=\"bigger lighter\">Object Property Count</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_out_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"MainOWLObject\" class=\"btn btn-block btn-primary\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-certificate bigger-110\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>View</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-3 pricing-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-header header-color-orange\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5 class=\"bigger lighter\">Data Property Count</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_out_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"MainOWLData\" class=\"btn btn-block btn-warning\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-asterisk bigger-110\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>View</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-3 pricing-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-header header-color-red\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5 class=\"bigger lighter\">Individual Count</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_out_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"MainOWLIndividual\" class=\"btn btn-block btn-danger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-list bigger-110\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>View</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!-- PAGE CONTENT ENDS -->\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /.col -->\n");
      out.write("\t\t\t\t\t\t</div><!-- /.row -->\n");
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
      out.write("\t\t<!-- ace scripts -->\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/ace-elements.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/ace.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- inline scripts related to this page -->\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ontology.getOntologyID()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ontology.getAxiomCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ontology.getLogicalAxiomCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${declare}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent(null);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${express}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent(null);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${classcount}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent(null);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${objectcount}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent(null);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datacount}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_out_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent(null);
    _jspx_th_c_out_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${indcount}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }
}
