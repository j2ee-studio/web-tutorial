package com.company.team.web.jsf.servlet;

import com.company.team.utility.TraceHelper;
import com.company.team.web.html.HtmlPage;
import com.company.team.web.html.TemplateView;
import j2html.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static j2html.TagCreator.*;

public abstract class TemplateViewServlet extends HttpServlet implements TemplateView {

    private static final long serialVersionUID = 7563887634424553349L;

    private static Logger logger = LoggerFactory.getLogger(TemplateViewServlet.class);

    protected HttpServletRequest request;

    protected HttpServletResponse response;

    protected final HtmlPage htmlPage;

    protected TemplateViewServlet() {
        logger.info("{} -> {} start", this.getClass().getName(), TraceHelper.getMethodName(0));

        htmlPage = new HtmlPage(this) {
            @Override
            protected String getTitle() {
                return templateView.getTitle();
            }

            @Override
            protected Tag[] getHeaderContent() {
                return templateView.getHeaderContent();
            }

            @Override
            protected Tag[] getMainContent() {
                return templateView.getMainContent();
            }

            @Override
            protected Tag[] getFooterContent() {
                return templateView.getFooterContent();
            }
        };

        logger.info("{} -> {} end", this.getClass().getName(), TraceHelper.getMethodName(0));
    }

    /***** This Method Is Called By The Servlet Container To Process A 'GET' Request *****/
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("{} -> {} start", this.getClass().getName(), TraceHelper.getMethodName(0));
        this.request = request;
        this.response = response;
        setResponseHeader(response);
        populateResponse(response);
        logger.info("{} -> {} end", this.getClass().getName(), TraceHelper.getMethodName(0));
    }

    /***** This Method Is Called By The Servlet Container To Process A 'POST' Request *****/
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void setResponseHeader(HttpServletResponse response) {

    }

    protected void populateResponse(HttpServletResponse response) {
        try {
            PrintWriter out = response.getWriter();
            out.print(htmlPage.render());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Tag[] getHeaderContent() {
        return new Tag[]{
                a("Home").withHref(getServletContext().getContextPath()).withStyle("padding: 2px;margin: 2px;"),
                a("Back").withHref(getServletContext().getContextPath() + "/servlet/servlet-overview.html").withStyle("padding: 2px;margin: 2px;"),
        };
    }

    @Override
    public Tag[] getFooterContent() {
        return new Tag[]{
                div().withStyle("padding: 20px 10px 10px 10px; text-align: center").with(
                        p().withStyle("color: #1e90ff; font-size: 10px").withText("Copyright \u00A9 2015")
                ),
        };
    }
}
