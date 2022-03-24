package com.yj;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * @Author: Youjin Li
 * @Date: 3/23/2022
 */
public class S2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();

        List<String> names =
                (List<String>) servletContext.getAttribute("names");
        while(names==null){
            try {
                Thread.sleep(10);
                names =
                        (List<String>) servletContext.getAttribute("names");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(names);

        ServletConfig servletConfig = this.getServletConfig();
        System.out.println(servletConfig.getInitParameter("brand"));

    }
}
