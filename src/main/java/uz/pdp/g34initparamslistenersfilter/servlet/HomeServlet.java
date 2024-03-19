package uz.pdp.g34initparamslistenersfilter.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
        name = "HomeServlet",
        urlPatterns = "/home",
        initParams = {
                @WebInitParam(name = "companyName" , value = "PDP"),
                @WebInitParam(name = "foundationYear", value = "2017"),
                @WebInitParam(name = "founder" , value = "Odil Mirzayev")
        }
)
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*ServletConfig servletContext = this.getServletConfig();

        String companyName = servletContext.getInitParameter("companyName");
        String foundationYear = servletContext.getInitParameter("foundationYear");
        String founder = servletContext.getInitParameter("founder");
*/
        String companyName = this.getInitParameter("companyName");
        String foundationYear = this.getInitParameter("foundationYear");
        String founder = this.getInitParameter("founder");

        req.setAttribute("companyName", companyName);
        req.setAttribute("foundationYear", foundationYear);
        req.setAttribute("founder", founder);

        req.getRequestDispatcher("/home.jsp").forward(req, resp);
    }
}
