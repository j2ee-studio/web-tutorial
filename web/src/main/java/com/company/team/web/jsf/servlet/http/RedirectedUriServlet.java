package com.company.team.web.jsf.servlet.http;

import com.company.team.model.type.HttpStatusCode;
import com.company.team.web.jsf.servlet.HttpServletBase;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.company.team.model.type.HttpStatusCode.SC_BAD_REQUEST;

@WebServlet("/servlet/http/redirected")
public class RedirectedUriServlet extends HttpServletBase {

    private static final long serialVersionUID = 7087036434274056419L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String code = request.getParameter("redirect");
        if (code == null || code.isEmpty()) {
            sendError(response, SC_BAD_REQUEST);
            return;
        }

        HttpStatusCode httpStatusCode = HttpStatusCode.getInstance(Integer.parseInt(code));
        out.write("You have redirected to this page. ");
        out.write(httpStatusCode.getDescription());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
