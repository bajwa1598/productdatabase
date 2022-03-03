package com.products.product.database;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String un = request.getParameter("email");
        String pw = request.getParameter("password");
        response.setContentType("text/html");
        
        String U1 = "Admin";
        String P1 = "Admin321@";
        
        String U2 = "owner";
        String P2 = "Owner";
        
        if(pw.equals(P1) && un.equals(U1)){
            RequestDispatcher rd = request.getRequestDispatcher("addProduct.html");
            rd.forward(request, response);
        } else if(pw.equals(P2) && un.equals(U2)){
            RequestDispatcher rd = request.getRequestDispatcher("addProduct.html");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("Alogin.jsp");
            rd.include(request, response);
        }
        out.close();
    }
}
