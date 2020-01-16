package com.ryan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mb_ok")
public class joinServle extends HttpServlet {
        private static final long serialVersionUID = 1L;
   
    public joinServle() {
        super();
        
    }

        
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   
                    //클라이언트(브라우저)에서 받음
                    String id =request.getParameter("id");
                    String pw =request.getParameter("pw");
                    String name =request.getParameter("name");
                    String email =request.getParameter("email");
                    String phone =request.getParameter("phone");
                    
                    // 클라이언트(브라우저)로 보냄
                    response.setContentType("text/html;charset=uft-8");
                    PrintWriter out = response.getWriter();
                    out.print(id);
                    out.print(pw);
                    out.print(name);
                    out.print(email);
                    out.print(phone);
        //        response.getWriter().append("Served at: ").append(request.getContextPath());
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                doGet(request, response);
        }

}
