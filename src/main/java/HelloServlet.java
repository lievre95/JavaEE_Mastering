// Import required java libraries

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Extend HttpServlet class
//compiling a servlet
//D:\Projects\JavaEE_Mastering\webapps\helloapp\WEB-INF\classes>javac -cp .;"d:\Projects\JavaEE_Mastering\lib\servlet-api.jar" HelloServlet.java

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = "/NotFound";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //getting session
//        HttpSession session = request.getSession();
//        //getting the object name
//        String name2 = (String) session.getAttribute("name2");
//        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        Person tom = (Person) session.getAttribute("person");
        PrintWriter out = response.getWriter();
        //supplementary
        Enumeration keys = session.getAttributeNames();
        while(keys.hasMoreElements()){
            System.out.println((String) keys.nextElement());
        }
        //setting interval of inactivity
//      session.setMaxInactiveInterval(60*60*24);//1 day
        session.setMaxInactiveInterval(-1);// when the browser is closed
        //deleting all data from session
        session.invalidate();

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String id = request.getParameter("id");
//        if (id == null) {
//            String path = request.getContextPath() + "/NotFound";
//            response.sendRedirect(path);
//        }
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
        String message = getServletContext().getInitParameter("message");
        response.setContentType("text/html");

        String name = request.getParameter("username");
        String age = request.getParameter("userage");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String[] courses = request.getParameterValues("courses");
        try {
//            //session check
//            if(name2 == null){
//                //setting the object with key
//                session.setAttribute("name2","Tom Mayer");
//                out.println("Session data are set");
//            }else{
//                out.println("Name: "+ name2);
//                //deleting the object with key "name"
//                session.removeAttribute("name2");
//            }
            //saving in session complex objects
            if(tom ==null){
                tom = new Person("Tom", 35);
                out.println("Session data are set for complex object");

            }else{
                out.println("Name: " + tom.getName() + " ; Age: "+ tom.getAge());
                session.removeAttribute("person");
            }


//            writer.println("<h2>Id:</h2> "+ id + " </h2>");
//            writer.println("<h2> Name: " + name + "; Age: "+ age + "</h2>");
//for(String i:nums){
//    writer.println("Nums:"+ i +" ");
            //}
            writer.println("<p>Name: " + name + "</p>");
            writer.println("<p>Age: " + age + "</p>");
            writer.println("<p>Gender: " + gender + "</p>");
            writer.println("<p>Country: " + country + "</p>");
            writer.println("<h4>Courses</h4>");
            writer.println("<h2>" + message + "</h2>");

            for (String course : courses)
                writer.println("<li>" + course + "</li>");

            //----------
            // redirecting the request
//            String path = "/index2.html";
//            ServletContext servletContext = getServletContext();
//            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
//            requestDispatcher.forward(request, response);


        } finally {
            writer.close();
        }
    }
}

