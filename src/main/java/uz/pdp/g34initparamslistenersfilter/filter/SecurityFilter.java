package uz.pdp.g34initparamslistenersfilter.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

public class SecurityFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String requestURI = req.getRequestURI();
        if (requestURI.startsWith("/auth") || requestURI.equals("/")){
            chain.doFilter(request, response);
            return;
        }
        Cookie[] cookies = req.getCookies();
        if (cookies == null) {
            resp.sendRedirect("/auth/login");
            return;
        }
        for (Cookie cookie : cookies) {
            System.out.println("cookieName => " + cookie.getName());
            if (cookie.getName().equals("username")) {
                chain.doFilter(req, resp);
            }
        }

        resp.sendRedirect("/auth/login");
    }
}
