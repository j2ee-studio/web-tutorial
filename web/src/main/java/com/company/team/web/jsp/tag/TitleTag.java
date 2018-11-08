package com.company.team.web.jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class TitleTag extends TagSupport {

    private static final long serialVersionUID = -1156304473734603013L;

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.write("<h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_BODY_INCLUDE;
    }


    @Override
    public int doEndTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.write("</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_PAGE;
    }
}
