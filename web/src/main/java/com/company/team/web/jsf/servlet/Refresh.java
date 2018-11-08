package com.company.team.web.jsf.servlet;

import j2html.tags.Tag;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static j2html.TagCreator.h1;
import static j2html.TagCreator.p;

@WebServlet(name = "Auto Refresh Content Servlet", urlPatterns = "/servlet/refreshServlet")
public class Refresh extends TemplateViewServlet {

    private static final long serialVersionUID = -5100576740730393140L;

    @Override
    protected void setResponseHeader(HttpServletResponse response) {
        super.setResponseHeader(response);

        /***** Set Refresh - AutoLoad Time as 15 Seconds *****/
        response.setIntHeader("Refresh", 1);

        /***** Set Response Content Type *****/
        response.setContentType("text/html");
    }

    @Override
    public String getTitle() {
        return "Auto Refresh Header";
    }

    @Override
    public Tag[] getMainContent() {

        /***** Get Current Time *****/
        Calendar cal = new GregorianCalendar();
        String am_pm;
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        if (cal.get(Calendar.AM_PM) == 0)
            am_pm = "A.M.";
        else
            am_pm = "P.M.";

        String time = hour + ":" + minute + ":" + second + " " + am_pm;
        String title = "Auto Refresh Header Setting";

        // TODO : "<body bgcolor = \"#f0f0f0\">\n"
        return new Tag[]{
                h1(title).withStyle("align-content: center"),
                p("Current Time Is?= " + time)
        };
    }
}
