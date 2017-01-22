package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<title>Login - CoMOnTool</title>\n");
      out.write("\n");
      out.write("\t\t<meta name=\"description\" content=\"User login page\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("\t\t<!-- basic styles -->\n");
      out.write("\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if IE 7]>\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"assets/css/font-awesome-ie7.min.css\" />\n");
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
      out.write("\n");
      out.write("\t\t<!--[if lte IE 8]>\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"assets/css/ace-ie.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<!-- inline styles related to this page -->\n");
      out.write("\n");
      out.write("\t\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"assets/js/html5shiv.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/respond.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body class=\"login-layout\">\n");
      out.write("\t\t<div class=\"main-container\">\n");
      out.write("\t\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-10 col-sm-offset-1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"login-container\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"red\">CoMOn</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"white\">Tool</span>\n");
      out.write("\t\t\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"blue\">&copy; Compliance Management Ontology Tool</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"space-6\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"position-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"login-box\" class=\"login-box visible widget-box no-border\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"header blue lighter bigger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-coffee green\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tPlease Enter Your Information\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form method=\"post\" action=\"LoginServlet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Username\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-user\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"pass\" class=\"form-control\" placeholder=\"Password\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-lock\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"width-35 pull-right btn btn-sm btn-primary\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-key\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tLogin\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-4\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"social-or-login center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bigger-110 red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"social-login center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- /widget-main -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"toolbar clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"show_box('forgot-box'); return false;\" class=\"forgot-password-link\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-arrow-left\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tI forgot my password\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><!-- /widget-body -->\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /login-box -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"forgot-box\" class=\"forgot-box widget-box no-border\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"header red lighter bigger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-key\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tRetrieve Password\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tEnter your email and to receive instructions\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" placeholder=\"Email\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-envelope\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"width-35 pull-right btn btn-sm btn-danger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-lightbulb\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSend Me!\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- /widget-main -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"toolbar center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"show_box('login-box'); return false;\" class=\"back-to-login-link\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tBack to login\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-arrow-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><!-- /widget-body -->\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /forgot-box -->\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /position-relative -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- /.col -->\n");
      out.write("\t\t\t\t</div><!-- /.row -->\n");
      out.write("\t\t\t</div>\n");
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
      out.write(" window.jQuery || document.write(\"<script src='assets/js/jquery-1.10.2.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("</script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tif(\"ontouchend\" in document) document.write(\"<script src='js/jquery.mobile.custom.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t\t<!-- inline scripts related to this page -->\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tfunction show_box(id) {\n");
      out.write("\t\t\t jQuery('.widget-box.visible').removeClass('visible');\n");
      out.write("\t\t\t jQuery('#'+id).addClass('visible');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
}
