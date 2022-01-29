package siit.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(urlPatterns = "*")
public class AuthorizationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("inainte de servelt");
        HttpServletRequest req = (HttpServletRequest) request;

        if (!req.getServletPath().equals("/login") && req.getSession(true).getAttribute("logged_user") == null) {
            ((HttpServletResponse) response).sendRedirect("http://localhost:8080/login");
        } else {
            chain.doFilter(request, response);
        }


//        System.out.println("dupa servlet");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
