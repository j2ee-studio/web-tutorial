package com.company.team.web.jsf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet/hello")
public class HelloServlet extends TemplateServlet {

    protected String getTitle(){
        return "Hello";
    }

    protected String getContent(){
        return "<h1>Hello Servlet!!!</h1>";
    }

}
