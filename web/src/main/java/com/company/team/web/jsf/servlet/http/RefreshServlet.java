package com.company.team.web.jsf.servlet.http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.MessageFormat;

@WebServlet("/servlet/http/refresh")
public class RefreshServlet extends HttpServlet {

    private static final long serialVersionUID = 6872555929419969927L;

    /**
     * Count of request send to the server
     * No need to use static modifier why the servlet is singleton
     */
    private int count = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        count++;
        MessageFormat msg = new MessageFormat("Count of request send: {0}");
        System.out.println(msg.format(new Object[]{count}));
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
