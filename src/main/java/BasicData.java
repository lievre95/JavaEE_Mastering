// Import required java libraries

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class BasicData extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        //using context
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("name", "Jora");
        servletContext.setAttribute("age",44);

        String[] users = new String[]{"Tom", "Bob", "Sam"};
        request.setAttribute("users", users);

        ArrayList<String> users2 = new ArrayList<String>();
        Collections.addAll(users2, "Tom", "Bob", "Jora");
        request.setAttribute("users2", users2);
//        //data throw the session
//        HttpSession session = request.getSession();
//        session.setAttribute("name","newValue");
//        session.setAttribute("age", 36);

//        request.setAttribute("name", "Tom");
//        request.setAttribute("age", "23");

        getServletContext().getRequestDispatcher("/basic.jsp").forward(request, response);

    }
}