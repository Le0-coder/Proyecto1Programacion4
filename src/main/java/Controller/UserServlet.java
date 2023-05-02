/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.DAOexception;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import DAO.DAOmysql.MysqlUserDAO;
import Model.UserModel;

/**
 *
 * @author leosa
 */
@WebServlet("/register")
public class UserServlet extends HttpServlet {

    private MysqlUserDAO MysqlUserDAO = new MysqlUserDAO();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        String tel = request.getParameter("tel");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String medioPago = request.getParameter("medioPago");
        String rol = "cliente";
        
        
        UserModel userModel = new UserModel();
        
        userModel.setId(id);
        userModel.setTel(tel);
        userModel.setPassword(password);
        userModel.setName(name);
        userModel.setEmail(email);
        userModel.setMedioPago(medioPago);
        userModel.setRol(rol);
        
        try{
         MysqlUserDAO.insert(userModel);
        }catch (DAOexception ex){
            ex.printStackTrace();
        }
            response.sendRedirect("userDetails.jsp");

    }
 

}
