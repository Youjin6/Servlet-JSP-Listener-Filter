package com.yj.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Youjin Li
 * @Date: 3/23/2022
 */
public class LoginServlet extends HttpServlet {
    public LoginServlet() {
        System.out.println("Login servlet constructor invoked");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Login servlet init invoked");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("login server invoked");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();
        if (username.equals("kee") && password.equals("123")) {
            writer.write("Success");
        }
    }

    @Override
    public void destroy() {
        System.out.println("Login servlet destroy invoked");

    }
}
