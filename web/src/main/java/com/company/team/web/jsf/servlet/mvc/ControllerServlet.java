package com.company.team.web.jsf.servlet.mvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dispatchServlet/controller")
public class ControllerServlet extends HttpServlet {

    private static final long serialVersionUID = -5169489713395609029L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req);
        gotoPage("/dispatchServlet/view", req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req);
        gotoPage("/dispatchServlet/view", req, resp);
    }

    private void processRequest(HttpServletRequest req) {

    }

    private void gotoPage(String address, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address);
        dispatcher.forward(req, resp);
    }
}
