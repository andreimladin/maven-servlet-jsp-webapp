package ro.iteahome.java.advanced.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecurityFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter initializat");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filtram datele");
        System.out.println(servletRequest.getParameter("whoIs"));
        if ("Andrei".equals(servletRequest.getParameter("whoIs"))) {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("Filter distrus");
    }
}
