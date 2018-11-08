package com.company.team.web.jsf.servlet;

import com.company.team.model.type.HttpStatusCode;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.MessageFormat;

public abstract class HttpServletBase extends HelloServlet {

    private static final long serialVersionUID = -733410800745056564L;

    /**
     * You can set error code directly to your servlet response (STATUS CODE)
     * response.setStatus(HttpServletResponse.SC_FORBIDDEN);
     * <p>
     * It is better to use sendError method for setting error message to your servlet response (STATUS CODE)
     * response.sendError(HttpServletResponse.SC_FORBIDDEN);
     *
     * @param response
     * @param sc
     * @throws IOException
     */
    protected void sendError(HttpServletResponse response, HttpStatusCode sc) throws IOException {
        MessageFormat message = new MessageFormat("{0}. {1}");
        response.sendError(sc.getCode(), message.format(new Object[]{sc.toString(), sc.getDescription()}));
    }

}
