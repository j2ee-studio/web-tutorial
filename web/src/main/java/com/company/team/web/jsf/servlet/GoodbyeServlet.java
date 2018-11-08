package com.company.team.web.jsf.servlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "Goodbye Servlet", urlPatterns = "/servlet/goodbye")
public class GoodbyeServlet extends TemplateServlet {

    private static final long serialVersionUID = 6610473428979403538L;

    protected String getTitle() {
        return "Goodbye";
    }

    protected String getContent() {
        return "<h1>Goodbye Servlet!!!</h1>";
    }

}
