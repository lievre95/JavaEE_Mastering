// Import required java libraries

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

// Extend HttpServlet class
//compiling a servlet
//D:\Projects\JavaEE_Mastering\webapps\helloapp\WEB-INF\classes>javac -cp .;"d:\Projects\JavaEE_Mastering\lib\servlet-api.jar" HelloServlet.java

@WebServlet("/hello")
public class HelloServlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        User tomik = new User("Tom", 26);
//        request.setAttribute("tomik", tomik);
//        getServletContext()
//                .getRequestDispatcher("/user.jsp")
//                .forward(request, response);
        request.setAttribute("messagejs","<script>alert('XSS atack')</script>");
        getServletContext().getRequestDispatcher("/postuser2.jsp").forward(request, response);
    }
}
