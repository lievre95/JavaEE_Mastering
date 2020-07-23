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
public class HelloServlet extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

//        String id = request.getParameter("id");
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
        String []nums = request.getParameterValues("nums");
        String name = request.getParameter("username");
        String age = request.getParameter("userage");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String[] courses = request.getParameterValues("courses");
        try{
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
            for(String course: courses)
                writer.println("<li>" + course + "</li>");
        }finally{
            writer.close();
        }
    }
}