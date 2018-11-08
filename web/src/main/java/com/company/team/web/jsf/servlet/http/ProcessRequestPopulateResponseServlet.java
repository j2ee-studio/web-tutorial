package com.company.team.web.jsf.servlet.http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet/http/howServletProcessRequest")
public class ProcessRequestPopulateResponseServlet extends HttpServlet {

    private static final long serialVersionUID = -5018798929500172992L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        howServletProcessRequestAndPopulateResponse(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        howServletProcessRequestAndPopulateResponse(request, response);
    }

    private void howServletProcessRequestAndPopulateResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            // handle request

            boolean client_request_has_error = checkErrorForClientRequest(request);

            // error on client request
            if (client_request_has_error) {
                // response.setStatus(400);
                response.sendError(400, "You are sending bad request");
                return;
            }

            boolean redirect_required = checkPhysicalAddressRelatedToClientRequestHasBeenChanged(request);

            // document has been moved
            if (redirect_required) {
                /*
                response.setStatus(301);
                response.setHeader("url", "http://new_url");
                */
                response.sendRedirect("http://new_url");
                return;
            }

            // populate response
            response.getWriter().write("<html> ... </html>");

            // servlet will set status code 200
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(500, "Internal Server Error");
        }
    }

    private boolean checkErrorForClientRequest(HttpServletRequest request) {
        return false;
    }

    private boolean checkPhysicalAddressRelatedToClientRequestHasBeenChanged(HttpServletRequest request) {
        return false;
    }
}
