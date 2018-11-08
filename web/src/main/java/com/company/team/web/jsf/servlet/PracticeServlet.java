package com.company.team.web.jsf.servlet;

import j2html.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static j2html.TagCreator.h1;

public class PracticeServlet extends TemplateViewServlet {

    private static final long serialVersionUID = 4223363727146245031L;

    private static Logger logger = LoggerFactory.getLogger(PracticeServlet.class);

    @Override
    public String getTitle() {
        return "Practice Servlet";
    }

    @Override
    public Tag[] getMainContent() {
        return new Tag[]{h1("Hello Servlet!!!")};
    }
}
