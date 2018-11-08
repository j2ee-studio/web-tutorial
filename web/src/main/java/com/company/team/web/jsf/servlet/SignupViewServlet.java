package com.company.team.web.jsf.servlet;

import j2html.tags.Tag;

import javax.servlet.annotation.WebServlet;

import static com.company.team.web.html.HtmlTag.*;
import static j2html.TagCreator.*;

@WebServlet(name="Signup Form Servlet", urlPatterns = "/servlet/signup")
public class SignupViewServlet extends TemplateViewServlet {

    private static final long serialVersionUID = -7600914166008108208L;

    @Override
    public String getTitle() {
        return "Signup Page";
    }

    @Override
    public Tag[] getMainContent() {
        return new Tag[]{
                h1("Please sign up"),
                form().withMethod("post").with(
                        emailInput("Email address"),
                        choosePasswordInput("Choose Password"),
                        repeatPasswordInput("Repeat Password"),
                        submitButton("Sign up")
                )
        };
    }
}
