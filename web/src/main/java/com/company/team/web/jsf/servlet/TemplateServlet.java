package com.company.team.web.jsf.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class TemplateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println(getTitle());
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<a href='" + getServletContext().getContextPath() + "'>Home</a>");
        out.println(getContent());
        out.println("</body>");
        out.println("</html>");
    }

    protected abstract String getTitle();
    protected abstract String getContent();
}
