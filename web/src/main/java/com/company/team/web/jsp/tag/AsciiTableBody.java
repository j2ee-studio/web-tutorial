package com.company.team.web.jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

public class AsciiTableBody extends BodyTagSupport {

    private static final long serialVersionUID = -527344115150242440L;

    int i = 10;

    @Override
    public int doAfterBody() throws JspException {
        try {
            JspWriter out = bodyContent.getEnclosingWriter();
            out.print(bodyContent.getString());
            bodyContent.clearBody();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (i-- > 0) {
            return EVAL_BODY_AGAIN;
        }

        return SKIP_BODY;
    }
}
