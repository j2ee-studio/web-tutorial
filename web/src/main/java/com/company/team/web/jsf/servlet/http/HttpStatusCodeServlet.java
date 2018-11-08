package com.company.team.web.jsf.servlet.http;

import com.company.team.model.type.HttpStatusCode;
import com.company.team.web.jsf.servlet.HttpServletBase;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.company.team.model.type.HttpStatusCode.*;


@WebServlet("/servlet/http/httpStatusCode")
public class HttpStatusCodeServlet extends HttpServletBase {

    private static final long serialVersionUID = 8141611620255270355L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println(request.getRequestURL() + "?sc=" + request.getParameter("sc"));

        try {
            String code = request.getParameter("sc");
            if (code == null || code.isEmpty()) {
                sendError(response, SC_BAD_REQUEST);
                return;
            }

            HttpStatusCode httpStatusCode = HttpStatusCode.getInstance(Integer.parseInt(code));

            switch (httpStatusCode) {
                case SC_MOVED_PERMANENTLY:
                    response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
                    response.setHeader("Location", request.getContextPath() + "/servlet/http/redirected?redirect=" + HttpServletResponse.SC_MOVED_PERMANENTLY);
                    break;

                case SC_MOVED_TEMPORARILY:
                case SC_FOUND:
                    response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
                    response.setHeader("Location", request.getContextPath() + "/servlet/http/redirected?redirect=" + HttpServletResponse.SC_MOVED_TEMPORARILY);
                    break;

                default:
                    sendError(response, httpStatusCode);
            }

        } catch (NumberFormatException e) {
            sendError(response, SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            sendError(response, SC_FORBIDDEN);
            e.printStackTrace();
        }
    }
}
