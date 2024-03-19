package uz.pdp.g34initparamslistenersfilter.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
        name = "AuthServlet",
        value = "/auth/login"
)
public class AuthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        Check from db
        Cookie cookie = new Cookie("username", username);
        cookie.setHttpOnly(true);
        cookie.setMaxAge(30);
        resp.addCookie(cookie);

        resp.addCookie(cookie);
        resp.sendRedirect("/");
    }
}
