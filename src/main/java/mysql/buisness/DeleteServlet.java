package mysql.buisness;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mysql.buisness.ProductDB;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
//            int id = Integer.parseInt(request.getParameter("id"));
//            ProductDB.delete(id);
            response.sendRedirect(request.getContextPath()+"/index3");
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/notfound").forward(request, response);
        }
    }
}