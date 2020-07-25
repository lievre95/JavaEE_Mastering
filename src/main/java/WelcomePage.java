import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomePage extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String bye = this.getInitParameter("message");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String welcome = "Welcome boyz";

        try {
            writer.println(welcome);
            writer.println("<br>");
            writer.println(bye);
            System.out.println(getServletContext());

            Cookie[] cookies = request.getCookies();
            String cookieName = "user";
            Cookie cookie = null;
            if (cookies != null) {
                for (Cookie c : cookies) {
                    if (cookieName.equals(c.getName())) {
                        cookie = c;
                        break;
                    }
                }
            }
            PrintWriter out = response.getWriter();
            try {
                out.println("<h4> Cookies </h4> Name: " + cookie.getValue());
            } finally {
                out.close();
            }
        } finally {
            writer.close();
        }
    }
}