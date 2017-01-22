package filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebFilter("/AuthenticationFilter")
public class NewFilter implements Filter {
 
    private ServletContext context;
     
    public void init(FilterConfig fConfig) throws ServletException {
        this.context = fConfig.getServletContext();
        this.context.log("AuthenticationFilter initialized");
    }
     
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
 
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
         
        String uri = req.getRequestURI();
        this.context.log("Requested Resource::"+uri);
         
        HttpSession session = req.getSession(false);
        
        String loginURL = req.getContextPath() + "/";
        String loginURL2 = req.getContextPath() + "/index.jsp";
        String loginURL3 = req.getContextPath() + "/LoginServlet";
        
         
        if (req.getRequestURI().equals(loginURL) || req.getRequestURI().equals(loginURL2 ) || req.getRequestURI().equals(loginURL3 )) {
         chain.doFilter(request, response);
         }else if ( uri.indexOf("/css") > 0){
        chain.doFilter(request, response);
    }
    else if( uri.indexOf("/images") > 0){
        chain.doFilter(request, response);
    }
    else if( uri.indexOf("/js") > 0){
        chain.doFilter(request, response);
    }else if( uri.indexOf("/img") > 0){
        chain.doFilter(request, response);
    }else if( uri.indexOf("/font") > 0){
        chain.doFilter(request, response);
    }else if( uri.indexOf("/avatars") > 0){
        chain.doFilter(request, response);
    }
        else{
        if(session == null || session.isNew() || session.getAttribute("user_id") == null ){
            this.context.log("Unauthorized access request");
            res.sendRedirect("index.jsp");
            
           // PrintWriter out = response.getWriter();
        //out.println(session);
        }else{
            // pass the request along the filter chain
            res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            res.setDateHeader("Expires", 0);
            chain.doFilter(request, response);
        }
        } 
         
    }
 
     
 
    public void destroy() {
        //close any resources here
    }
 
}