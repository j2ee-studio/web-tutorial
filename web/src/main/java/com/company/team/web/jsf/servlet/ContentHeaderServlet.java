package com.company.team.web.jsf.servlet;

import j2html.tags.ContainerTag;
import j2html.tags.Tag;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Enumeration;

import static j2html.TagCreator.*;

public class ContentHeaderServlet extends TemplateViewServlet {

    private static final long serialVersionUID = 7884179573112341647L;

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void setResponseHeader(HttpServletResponse response) {
        super.setResponseHeader(response);
        response.setContentType("text/html");
    }


    @Override
    public String getTitle() {
        return "Http Request Header";
    }

    @Override
    public Tag[] getMainContent() {
        // Stream<String> str = StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.asIterator(), Spliterator.ORDERED), false);
        return new Tag[]{
                h1("Content Header"),
                ul(attrs("#headers"),
                        Collections.list(request.getHeaderNames()).stream().map(header ->
                                li(
                                        b(header),
                                        span(" : "),
                                        em(request.getHeader(header)).withStyle("margin-left: 5px;")
                                )
                        ).toArray(ContainerTag[]::new)
                ),
        };
    }
}